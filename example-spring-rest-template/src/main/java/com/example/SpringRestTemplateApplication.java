package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient	// 表示当前服务是eureka客户端
public class SpringRestTemplateApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestTemplateApplication.class, args);
	}

}
