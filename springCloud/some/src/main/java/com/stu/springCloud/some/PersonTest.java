package com.stu.springCloud.some;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:TianZhenYu
 * @date:2019/7/21
 * @description:com.stu.springCloud.some springCloud
 */
@FeignClient("person")
//@RequestMapping("/person")
public interface PersonTest {
    @RequestMapping("/getName")
    String getName(Integer i);
}
