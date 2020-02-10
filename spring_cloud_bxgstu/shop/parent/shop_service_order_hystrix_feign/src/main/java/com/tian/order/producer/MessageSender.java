package com.tian.order.producer;

import com.tian.order.channel.MyProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 负责向中间件发送数据
 */
@Component
@EnableBinding(MyProcessor.class)
public class MessageSender {

	@Autowired
	@Qualifier(value=MyProcessor.MYOUTPUT)
	private MessageChannel myoutput;

	//发送消息
	public void send(Object obj) {
		myoutput.send(MessageBuilder.withPayload(obj).build());
	}
}
