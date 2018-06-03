package com.tian.stu.springCloud.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.tian.stu.springCloud.configServer stu
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class,args);
    }
}
