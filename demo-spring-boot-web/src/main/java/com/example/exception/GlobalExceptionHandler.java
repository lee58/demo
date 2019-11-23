package com.example.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.response.ResponseData;

/**
 * 统一异常处理类
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private Logger logger = LoggerFactory
			.getLogger(GlobalExceptionHandler.class);

	@ResponseBody
	@ExceptionHandler(Exception.class)
	public ResponseData defaultErrorHandler(HttpServletRequest req, Exception e) {
		logger.error("", e);
		ResponseData responseData = new ResponseData();
		responseData.setMessage(e.getMessage());
		if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
			responseData.setCode(404);
		}else {
			responseData.setCode(500);
		}
		responseData.setData(null);
		responseData.setStatus(false);
		return responseData;
	}
}
