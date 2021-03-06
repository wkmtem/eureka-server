package com.nsntc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Class Name: EurekaServerApplication
 * Package: com.nsntc.eureka
 * Description: 
 * @author wkm
 * Create DateTime: 2017/12/14 下午8:31
 * Version: 1.0
 */
/** 声明Eureka注册发现中心服务 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		/** 获取JVM传递的参数 -Dport=? */
		//System.getProperty("port");
	}
}
