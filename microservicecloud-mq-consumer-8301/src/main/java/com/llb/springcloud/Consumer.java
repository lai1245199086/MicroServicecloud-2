package com.llb.springcloud;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@StreamListener("my_stream_channel")
	public  void redMsg(String msg) {
		System.out.println("当你看到这条消息，说明接收成功了"+msg);
	}

}
