package com.tian.stu.springCloud.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.tian.stu.springCloud.ui.service stu
 */
@RestController
@RequestMapping("/feign")
public class FeignSomeService {

    @Autowired
    private ISomeService someService;

    @HystrixCommand(fallbackMethod = "restSome_")
    @RequestMapping("/some")
    public String restSome(){
        return someService.getSome();
    }

    public String restSome_(){
        return "服务器忙:feign some";
    }
}
