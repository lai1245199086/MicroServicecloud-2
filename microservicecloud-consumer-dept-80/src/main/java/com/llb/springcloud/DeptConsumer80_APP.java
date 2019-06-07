package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.llb.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//加载启动
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)//对这个微服务，使用这样一个加载均衡默认算法
public class DeptConsumer80_APP {

	public static void main(String[] args) {
		
   SpringApplication.run(DeptConsumer80_APP.class, args);
	}

}
