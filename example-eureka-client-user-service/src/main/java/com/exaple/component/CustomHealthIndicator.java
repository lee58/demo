package com.exaple.component;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator extends AbstractHealthIndicator{

	/**
	 * 5、扩展健康检查端点，模拟异常情况
	 */
	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
//		builder.down().withDetail("status", false);
	}

}
