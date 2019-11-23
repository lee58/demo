package com.example.async;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 线程池参数配置类
 * 
 * @Description 自定义执行异步任务的线程池
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@Configuration
@ConfigurationProperties(prefix = "custom.task.pool")
public class TaskThreadPoolConfig {

	// 核心线程数
	private int corePoolSize = 5;
	
	// 最大线程数
	private int maxPoolSize = 50;
	
	// 线程池维护线程所允许的空闲时间
	private int keepAliveSeconds = 60;
	
	// 队列长度
	private int queueCapacity = 10000;
	
	// 线程名称前缀
	private String threadNamePrefix = "my-asyncTask-";

	public int getCorePoolSize() {
		return corePoolSize;
	}

	public void setCorePoolSize(int corePoolSize) {
		this.corePoolSize = corePoolSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}

	public int getKeepAliveSeconds() {
		return keepAliveSeconds;
	}

	public void setKeepAliveSeconds(int keepAliveSeconds) {
		this.keepAliveSeconds = keepAliveSeconds;
	}

	public int getQueueCapacity() {
		return queueCapacity;
	}

	public void setQueueCapacity(int queueCapacity) {
		this.queueCapacity = queueCapacity;
	}

	public String getThreadNamePrefix() {
		return threadNamePrefix;
	}

	public void setThreadNamePrefix(String threadNamePrefix) {
		this.threadNamePrefix = threadNamePrefix;
	}

}
