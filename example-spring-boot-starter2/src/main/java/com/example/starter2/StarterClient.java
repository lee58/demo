package com.example.starter2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



/**
 * spring-boot-starter客户端类
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */

public class StarterClient {
	
	private StarterConfigurationProperties starterConfigurationProperties;

	public StarterClient() {}
	
	public StarterClient(StarterConfigurationProperties starterConfigurationProperties) {
		this.starterConfigurationProperties = starterConfigurationProperties;
	}
	
	public String getName() {
		return starterConfigurationProperties.getName();
	}
	

}
