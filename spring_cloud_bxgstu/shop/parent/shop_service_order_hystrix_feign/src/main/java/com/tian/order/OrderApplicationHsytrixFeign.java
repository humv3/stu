package com.tian.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @author:TianZhenYu
 * @date:2020/1/29
 * @description:common.tian.product shop_parent
 */
@EntityScan("com.tian")
@SpringCloudApplication
@EnableFeignClients
@EnableHystrixDashboard
@EnableBinding(Source.class)
public class OrderApplicationHsytrixFeign  {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationHsytrixFeign.class,args);
    }
}
