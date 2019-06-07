package com.llb.springcloud.streamprivider;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;
@Component
public interface SendMessageInterface {
	    //创建发送消息通道
	    @Output("my_stream_channel")//将以这个通道创建交换机
		SubscribableChannel sendMsg();

}
