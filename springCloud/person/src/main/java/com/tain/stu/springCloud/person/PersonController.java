package com.tain.stu.springCloud.person;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.tain.stu.springCloud.person stu
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @RequestMapping("/getName")
    public String getName(Integer i){
        return "who"+i;
    }
}
