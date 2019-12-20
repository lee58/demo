package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbonClient")
public class RibbonClientController {
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	/**
	 * 6、ribbonClient的使用
		@Description 
		@return
		@author 大都督
		@date 2019年12月19日
	 */
	@GetMapping("/choose")
	public Object chooseUrl() {
		ServiceInstance instance = loadBalancer.choose("example-spring-rest-template");
		return instance;
	}

}
