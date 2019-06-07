package com.llb.springcloud.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llb.springcloud.streamprivider.SendMessageInterface;
@RestController
public class SendMsgController {
    //创建发送消息通道
	//生产投递消息
	@Autowired
	private SendMessageInterface SendMessageInterfaces;
	
	@RequestMapping("/sendmsg")
	public String SendMsg() {
		String msg = UUID.randomUUID().toString();//整合数据
		Message<?> build = MessageBuilder.withPayload(msg.getBytes()).build();//构建消息
		SendMessageInterfaces.sendMsg().send(build);//发送消息
		return "当你看到这个，你fasong就成功了";
		
	}
}
