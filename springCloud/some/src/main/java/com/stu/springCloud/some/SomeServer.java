package com.stu.springCloud.some;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.stu.springCloud.some stu
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class SomeServer {

    @Value("${my.message}")
    private String message;

    @RequestMapping("/getSome")
    public String getSome(){
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(SomeServer.class,args);
    }
}
