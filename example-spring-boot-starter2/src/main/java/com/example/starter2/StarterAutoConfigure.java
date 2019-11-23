package com.example.starter2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
public class StarterAutoConfigure {

	@Bean
	@ConditionalOnProperty(prefix="costum.spring.boot.starter2", value="enabled", havingValue="true")
	public StarterClient starterClient(StarterConfigurationProperties starterConfigurationProperties) {
		return new StarterClient(starterConfigurationProperties);
	}
}
