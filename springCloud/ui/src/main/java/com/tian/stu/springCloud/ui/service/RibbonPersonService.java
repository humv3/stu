package com.tian.stu.springCloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.tian.stu.springCloud.ui.service stu
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonPersonService {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "restPerson_")
    @RequestMapping("/person")
    public String restPerson(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://person/person/getName",String.class);
    }

    public String restPerson_(){
        return "服务器忙:ribbon person";
    }
}
