package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//引入某技术 就是这里引进开关Enable  开启
//注册 接收其他注册
public class EuerkaServer7003_App {
	public static void main(String[] args) {
		SpringApplication.run(EuerkaServer7003_App.class, args);
	}

}
