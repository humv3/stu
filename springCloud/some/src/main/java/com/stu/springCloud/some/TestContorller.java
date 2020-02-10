package com.stu.springCloud.some;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:TianZhenYu
 * @date:2019/7/21
 * @description:com.stu.springCloud.some springCloud
 */
@RestController
@RequestMapping("/test")
public class TestContorller {

    @Autowired
    private PersonTest personTest;

    @RequestMapping("/test")
    public String test() {
       return personTest.getName(9);

    }
}
