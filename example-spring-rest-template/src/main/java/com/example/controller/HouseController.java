package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.HouseInfo;

@RestController
@RequestMapping("/house")
public class HouseController {
	
	@GetMapping("/data")
	public HouseInfo getData(@RequestParam("name") String name) {
		return new HouseInfo(1L, "河北省", "承德市", "宽城满族自治县，化皮溜子乡");
	}

	@GetMapping("/data/{name}")
	public String getData2(@PathVariable("name") String name) {
		return name;
	}
	
	@PostMapping("/save")
	public Long addData(@RequestBody HouseInfo houseInfo) {
		System.out.println(houseInfo.getProvinceName());
		return 100L;
	}
}
