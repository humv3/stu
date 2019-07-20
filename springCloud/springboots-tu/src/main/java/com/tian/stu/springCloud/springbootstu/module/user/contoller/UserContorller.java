package com.tian.stu.springCloud.springbootstu.module.user.contoller;

/**
 * desc:  <br>
 * date: 15:11
 *
 * @author : TianZhenYu
 */

import com.tian.stu.springCloud.springbootstu.module.user.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:  <br>
 * date: 2019/7/20 15:11
 *
 * @author TianZhenYu
 */
@RestController
@RequestMapping("/user")
public class UserContorller {
    @RequestMapping("/login")
    public User login () {

    }
}
