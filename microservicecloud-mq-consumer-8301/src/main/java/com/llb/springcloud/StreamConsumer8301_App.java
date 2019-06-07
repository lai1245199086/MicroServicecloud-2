package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.llb.springcloud.stream.RedMsgInterFace;

@SpringBootApplication
@EnableBinding(RedMsgInterFace.class)
public class StreamConsumer8301_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(StreamConsumer8301_App.class, args);
	}
}
