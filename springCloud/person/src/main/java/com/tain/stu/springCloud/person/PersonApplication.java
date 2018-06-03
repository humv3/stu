package com.tain.stu.springCloud.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.swing.*;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.tain.stu.springCloud.person stu
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PersonApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class,args);
    }
}
