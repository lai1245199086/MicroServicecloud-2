package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
//加载启动
@EnableFeignClients(basePackages= {"com.llb.springcloud"})
@ComponentScan("com.llb.springcloud")
public class DeptConsumer_feign_80_APP {

	public static void main(String[] args) {
		
   SpringApplication.run(DeptConsumer_feign_80_APP.class, args);
	}

}
