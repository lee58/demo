package com.example.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring-boot-starter自动配置类
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@Configuration
@EnableConfigurationProperties(StarterConfigurationProperties.class)
public class StarterAutoConfigure {

	@Bean
	@ConditionalOnProperty(prefix="costum.spring.boot.starter", value="enabled", havingValue="true")
	public StarterClient starterClient(StarterConfigurationProperties starterConfigurationProperties) {
		return new StarterClient(starterConfigurationProperties);
	}
}
