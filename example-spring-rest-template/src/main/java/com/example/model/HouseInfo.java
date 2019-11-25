package com.example.model;

import lombok.Data;

@Data
public class HouseInfo {

	private long id;

	private String provinceName;

	private String cityName;

	private String areaName;

	public HouseInfo() {
		super();
	}

	public HouseInfo(long id, String provinceName, String cityName,
			String areaName) {
		super();
		this.id = id;
		this.provinceName = provinceName;
		this.cityName = cityName;
		this.areaName = areaName;
	}

}
