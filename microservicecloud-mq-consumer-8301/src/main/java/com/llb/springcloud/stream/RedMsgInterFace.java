package com.llb.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface RedMsgInterFace {
     
	 @Input("my_stream_channel")//底层绑定交换机
	 SubscribableChannel redMsg();
}
