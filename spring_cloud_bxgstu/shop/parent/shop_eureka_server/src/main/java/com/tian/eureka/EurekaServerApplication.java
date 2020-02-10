package com.tian.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:TianZhenYu
 * @date:2020/1/30
 * @description:com.tian.eureka shop_parent
 */
@SpringBootApplication(scanBasePackages="com.tian")
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
