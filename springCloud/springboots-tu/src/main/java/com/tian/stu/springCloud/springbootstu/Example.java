package com.tian.stu.springCloud.springbootstu;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.tian.stu.springCloud.springbootstu.module.user.contoller.UserContorller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.LinkedList;
import java.util.List;

@RestController
@SpringBootApplication
@MapperScan("com.tian.stu.springCloud.springbootstu.module.user.dao")
public class Example  {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }



    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Example.class, args);
        //UserMapper bean = run.getBean(UserMapper.class);
        //UserMapper ben = run.getBean(UserMapper.class);
        UserContorller bean = run.getBean(UserContorller.class);
        UserContorller bean4 = run.getBean(UserContorller.class);
    }






}
