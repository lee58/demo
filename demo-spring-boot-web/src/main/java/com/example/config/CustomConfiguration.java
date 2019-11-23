package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义配置类
 * 
 * @Description 获取properties中配置信息
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@ConfigurationProperties(prefix = "custom.configuration")
// prefix定义配置前缀
@Component
public class CustomConfiguration {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
