package com.exaple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient	// 表示当前服务是eureka客户端
public class EurekaClientUserServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientUserServiceApplication.class, args);
	}
}
