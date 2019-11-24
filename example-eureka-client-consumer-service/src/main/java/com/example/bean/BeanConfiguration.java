package com.example.bean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {
	
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
	
	@Bean
	@LoadBalanced // restTemplate负载均衡配置：自动构造LoadBalancerClient接口的实现类并注册到spring容器中
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
