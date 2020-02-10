package com.tian.product.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author:TianZhenYu
 * @date:2020/2/9
 * @description:order.channel shop_parent
 */
public interface MyProcessor {
    /**
     * 消息生产者的配置
     */
    String MYOUTPUT = "myOutput";

    @Output("myOutput")
    MessageChannel myOutput();

    /**
     * 消息消费者的配置
     */
    String MYINPUT = "myInput";

    @Input("myInput")
    SubscribableChannel myInput();
}
