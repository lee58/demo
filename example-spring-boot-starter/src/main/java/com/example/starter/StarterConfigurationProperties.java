package com.example.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * example-spring-boot-starter配置类
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@Data
@ConfigurationProperties("costum.spring.boot.starter")
public class StarterConfigurationProperties {
	
	private String name;

}
