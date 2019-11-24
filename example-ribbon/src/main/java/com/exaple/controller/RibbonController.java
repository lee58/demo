package com.exaple.controller;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rx.Observable;

import com.example.response.ResponseData;
import com.google.common.collect.Lists;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import com.netflix.loadbalancer.reactive.ServerOperation;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

	/**
	 * 1、ribbon实现负载均衡
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月24日
	 */
	@PostMapping("/testRibbon")
	public ResponseData testRibbon() {
		ResponseData r = new ResponseData();
		// 服务列表
		ArrayList<Server> serverList = Lists.newArrayList(new Server(
				"localhost", 8081), new Server("localhost", 8083));
		// 构建负载实例
		BaseLoadBalancer loadBalancer = LoadBalancerBuilder.newBuilder()
				.buildFixedServerListLoadBalancer(serverList);
		// 调用7次来测试效果
		for (int i = 0; i < 7; i++) {
			String result = LoadBalancerCommand.<String> builder()
					.withLoadBalancer(loadBalancer).build()
					.submit(new ServerOperation<String>() {

						@Override
						public Observable<String> call(Server server) {
							try {
								String addr = "http://" + server.getHost() +":"
										+ server.getPort()
										+ "/user/testRestTemplate";
								System.out.println("调用地址： " + addr);
								URL url = new URL(addr);
								HttpURLConnection conn = (HttpURLConnection) url
										.openConnection();
								conn.setRequestMethod("GET");
								conn.connect();
								InputStream in = conn.getInputStream();
								byte[] data = new byte[in.available()];
								in.read(data);
								return Observable.just(new String(data));
							} catch (Exception e) {
								return Observable.error(e);
							}
						}
					}).toBlocking().first();
			System.out.println(result);
			r.setData(result);
		}
		return r;
	}
}
