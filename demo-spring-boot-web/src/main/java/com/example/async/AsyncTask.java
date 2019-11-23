package com.example.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步执行任务
 * 
 * @Description 1、异步调用：不用等待结果的返回就执行后面的逻辑 2、同步调用：需要等待结果再执行后面的逻辑
 *              注意：异步执行任务，必须在外部的类调用异步方法，在本类中则不起作用。 最后再启动类上开启异步任务的执行，添加@EnableAsync即可
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@Component
public class AsyncTask {

	@Async
	public void doTask() {
		System.err.println(Thread.currentThread().getName());
	}

}
