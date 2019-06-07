package com.llb;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import zipkin2.server.internal.EnableZipkinServer;
import zipkin2.storage.mysql.v1.MySQLStorage;

/** 

* @author 作者 llb: 

* @version 创建时间：2019年5月7日 下午2:40:07 

* 类说明 

*/
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ChainmonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChainmonitorApplication.class, args);
    }
    
	@Bean
	public MySQLStorage mySQLStorage(DataSource datasource) {
		return MySQLStorage.newBuilder().datasource(datasource).executor(Runnable::run).build();
	}
}
