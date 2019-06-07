package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.llb.springcloud.streamprivider.SendMessageInterface;

@SpringBootApplication
@EnableBinding(SendMessageInterface.class)//绑定
public class StreamProvider8201_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(StreamProvider8201_App.class, args);
	}
}
