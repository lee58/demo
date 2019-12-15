package com.example.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.interceptor.MyLoadBalanced;

@Configuration
public class BeanConfiguration {

	@Bean
//	@LoadBalanced // 负载能力
	@MyLoadBalanced // 使用自定义拦截注解
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
