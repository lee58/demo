package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.ResponseData;
import com.example.starter2.StarterClient;

/**
 * 自定义spring-boot-starter客户端使用
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@RestController
public class StarterController {

	@Autowired
	private StarterClient starterClient;
	
	@PostMapping("/starter/getStarterName")
	public ResponseData getStarterName() {
		ResponseData responseData = new ResponseData();
		responseData.setData(starterClient.getName());
		responseData.setStatus(true);
		responseData.setMessage("success");
		return responseData;
	}
}
