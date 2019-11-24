package com.exaple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/eurekaClient")
public class EurekaClientController {

	@Autowired
	private EurekaClient eurekaClient;

	/**
	 * 4、使用eurekaClient来获取元数据信息（也可以使用DiscoveryClient）
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月24日
	 */
	@PostMapping("/getEurekaClientUerServiceInfo")
	public Object getEurekaClientUerServiceInfo() {
		return eurekaClient.getInstancesByVipAddress(
				"eureka-client-user-service", false);
	}
}
