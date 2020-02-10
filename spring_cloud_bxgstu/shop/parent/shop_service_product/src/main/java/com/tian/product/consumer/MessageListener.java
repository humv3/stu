package com.tian.product.consumer;

import com.tian.product.channel.MyProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * 负责接收中间件数据
 */
@Component
@EnableBinding(MyProcessor.class)
public class MessageListener {

	//监听binding中的消息
	@StreamListener(MyProcessor.MYINPUT)
	public void input(String message) {
		System.out.println("获取到消息: "+message);
	}


}
