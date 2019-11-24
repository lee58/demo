package com.example.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.InstanceInfo;

/**
 * 4、Eureka监听器 集群环境下，每个节点都会触发事件
 * 
 * @Description
 * @author 大都督
 * @date 2019年11月24日
 *
 */
@Component
public class EurekaStateChangeListener {

	@Value("${server.port}")
	private String port;

	@EventListener
	private void listen(EurekaInstanceCanceledEvent event) {
		System.out.println("Eureka port:" + port + " :::: " + event.getServerId() + ", "
				+ event.getAppName() + " :::::::服务下线 ！！！");
	}

	@EventListener
	private void listen(EurekaInstanceRegisteredEvent event) {
		InstanceInfo instanceInfo = event.getInstanceInfo();
		System.out.println("Eureka port:" + port + " :::: " + instanceInfo.getAppName()
				+ " :::::::进行注册 ！！！");
	}

	@EventListener
	private void listen(EurekaInstanceRenewedEvent event) {
		System.out.println("Eureka port:" + port + " :::: " + event.getServerId() + ", "
				+ event.getAppName() + " :::::::服务进行续约 ！！！");
	}

	@EventListener
	private void listen(EurekaRegistryAvailableEvent event) {
		System.out.println("Eureka port:" + port + " :::: " + "注册中心启动 ！！！");
	}

	@EventListener
	private void listen(EurekaServerStartedEvent event) {
		System.out.println("Eureka port:" + port + " :::: " + "Eureka Server 启动 ！！！");
	}
}
