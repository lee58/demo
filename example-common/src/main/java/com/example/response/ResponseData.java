package com.example.response;

/**
 * 统一返回结果定义
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
public class ResponseData {

	private Boolean status = true;
	
	private int code = 200;
	
	private String message;
	
	private Object data;
	
	public ResponseData() {
		super();
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
