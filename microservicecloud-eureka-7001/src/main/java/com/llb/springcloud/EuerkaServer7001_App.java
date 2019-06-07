package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
//注册 接收其他注册
public class EuerkaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EuerkaServer7001_App.class, args);
	}

}
