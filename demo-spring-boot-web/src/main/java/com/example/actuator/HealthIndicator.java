package com.example.actuator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

/**
 * 1、扩展健康端点
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月16日
 *
 */
@Component
public class HealthIndicator extends AbstractHealthIndicator{

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		builder.up().withDetail("userStatus", true);
	}

}
