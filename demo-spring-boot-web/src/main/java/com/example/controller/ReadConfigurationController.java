package com.example.controller;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.CustomConfiguration;

/**
 * 三种读取配置文件的方法
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月14日
 *
 */
@RestController
public class ReadConfigurationController {

	@Autowired
	private Environment env;
	@Value("${server.port}")
	private String port;
	@Autowired
	private CustomConfiguration customConfiguration;

	/**
	 * 1、通过Environment的getProperty方法来读取配置信息
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月14日
	 */
	@GetMapping("/getProperty")
	public String getProperty() {
		String port = env.getProperty("server.port");
		return port;
	}

	/**
	 * 2、@Value读取配置
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月15日
	 */
	@GetMapping("/readConfigurationByValue")
	public String readConfigurationByValue() {
		return port;
	}
	
	/**
	 * 3、读取自定义配置类
	 * 
		@Description 
		@return
		@author 大都督
		@date 2019年11月16日
	 */
	@PostMapping("/readCustomConfiguration")
	public String readCustomConfiguration() {
		return customConfiguration.getName();
	}

}
