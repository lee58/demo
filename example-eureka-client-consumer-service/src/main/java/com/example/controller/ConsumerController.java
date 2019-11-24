package com.example.controller;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.response.ResponseData;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * 1、RestTemplate调用接口
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月24日
	 */
	@PostMapping("/callUserClient")
	public ResponseData callUserClient() {
		ResponseData responseData = new ResponseData();
		String url = "http://127.0.0.1:8081/user/testRestTemplate";
		String forObject = restTemplate.getForObject(url, String.class);
		responseData.setMessage("success");
		responseData.setData(forObject);
		return responseData;
	}

	/**
	 * 2、在RestTemplate添加@LoadBalanced注解后，url写服务名称即可
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月24日
	 */
	@PostMapping("/callUserClient2")
	public ResponseData callUserClient2() {
		ResponseData responseData = new ResponseData();
		String url = "http://eureka-client-user-service/user/testRestTemplate";
		String forObject = restTemplate.getForObject(url, String.class);
		responseData.setMessage("success");
		responseData.setData(forObject);
		return responseData;
	}
}
