package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST接口
	@Description 
	@author 大都督
	@date 2019年11月14日
 *
 */
@RestController	// 该注解是@Controller和@ResponseBody的组合注解
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
