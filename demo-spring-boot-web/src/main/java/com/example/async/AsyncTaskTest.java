package com.example.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.ResponseData;
/**
 * 异步执行测试类
	@Description 
	@author 大都督
	@date 2019年11月16日
 *
 */
@RestController
public class AsyncTaskTest {
	
	@Autowired
	private AsyncTask asyncTask;
	
	/**
	 * 
		@Description 异步执行任务 
		@return
		@author 大都督
		@date 2019年11月16日
	 */
	@PostMapping("/testAsyncTask")
	public ResponseData testAsyncTask() {
		ResponseData r = new ResponseData();
		System.out.println("==========1===========");
		asyncTask.doTask();
		System.out.println("==========2===========");
		r.setMessage("async task success");
		return r;
	}

}
