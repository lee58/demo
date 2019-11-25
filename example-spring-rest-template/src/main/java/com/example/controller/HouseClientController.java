package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.HouseInfo;

@RestController
public class HouseClientController {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * 1、使用@RequestParam注解传递参数，返回对象信息
	 * 
	 * @Description
	 * @param name
	 * @return
	 * @author 大都督
	 * @date 2019年11月25日
	 */
	@GetMapping("/call/data")
	public HouseInfo getData(@RequestParam("name") String name) {
		// 请求的api地址，一种是：字符串；另一种是：URI
		String url = "http://localhost:8081/house/data?name=" + name;
		// 返回的数据类型
		Class<HouseInfo> responseType = HouseInfo.class;
		return restTemplate.getForObject(url, responseType);
	}

	/**
	 * 2、使用@PathVariable注解传递参数，返回字符串
	 * 
	 * @Description
	 * @param name
	 * @return
	 * @author 大都督
	 * @date 2019年11月25日
	 */
	@GetMapping("/call/data2/{name}")
	public String getData2(@PathVariable("name") String name) {
		String url = "http://127.0.0.1:8081/house/data/{name}";
		Class<String> responseType = String.class;
		return restTemplate.getForObject(url, responseType, name);
	}

	/**
	 * 3、使用getForEntity获取数据
	 * 
	 * @Description
	 * @param name
	 * @return
	 * @author 大都督
	 * @date 2019年11月25日
	 */
	@GetMapping("/call/dataEntity")
	public HouseInfo getDataEntity(@RequestParam("name") String name) {
		String url = "http://127.0.0.1:8081/house/data?name=" + name;
		Class<HouseInfo> responseType = HouseInfo.class;
		ResponseEntity<HouseInfo> responseEntity = restTemplate.getForEntity(
				url, responseType);
		if (responseEntity.getStatusCodeValue() == 200) {
			return responseEntity.getBody();
		}
		return null;
	}
}
