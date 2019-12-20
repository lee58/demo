package com.example.rule;

import java.util.List;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

/**
 * 自定义负载策略
	@Description 
	@author 大都督
	@date 2019年12月20日
 *
 */
public class MyRule implements IRule{

	private ILoadBalancer lb;
	
	@Override
	public Server choose(Object key) {
		List<Server> allServers = lb.getAllServers();
		for (Server server : allServers) {
			System.out.println(server.getHostPort());
		}
		return allServers.get(0);
	}

	@Override
	public ILoadBalancer getLoadBalancer() {
		
		return lb;
	}

	@Override
	public void setLoadBalancer(ILoadBalancer lb) {
		this.lb = lb;
	}
	
	

}
