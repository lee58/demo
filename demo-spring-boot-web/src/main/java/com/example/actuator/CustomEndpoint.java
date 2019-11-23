package com.example.actuator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * 2、自定义全新端点（验证失败）
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@Component
@Endpoint(id = "customEndPoint")
public class CustomEndpoint {
	
	@ReadOperation
	public List<Map<String, Object>> health() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("userStatus", true);
		list.add(map);
		return list;
	}

}
