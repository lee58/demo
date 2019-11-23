package com.example.starter2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;


/**
 * spring boot starter 启动注解定义
	@Description 
	@author 大都督
	@date 2019年11月21日
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({StarterAutoConfigure.class})
public @interface EnableStarterClient {

}
