package com.exaple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.ResponseData;

@RestController
@RequestMapping("/user")
public class UserController {

	/**
	 * 1、测试eureka客户端接口
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月23日
	 */
	@PostMapping("/testEurekaClient")
	public ResponseData testEurekaClient() {
		ResponseData r = new ResponseData();
		r.setMessage("success");
		return r;
	}

	/**
	 * 2、返回String类型数据，给消费者使用
	 * 
	 * @Description
	 * @return
	 * @author 大都督
	 * @date 2019年11月24日
	 */
	@GetMapping("/testRestTemplate")
	public String testRestTemplate() {
		return "hello, i am user service";
	}
}
