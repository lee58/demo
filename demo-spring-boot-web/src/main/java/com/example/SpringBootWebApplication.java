package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.starter2.EnableStarterClient;

/**
 * SpringBoot启动类
	@Description 
	@author 大都督
	@date 2019年11月14日
 *
 */
@EnableStarterClient // 注解方式开启自定义Starter
@SpringBootApplication	// 该注解表示该类是一个SpringBoot应用
@EnableAsync	//开启异步执行任务
public class SpringBootWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
}