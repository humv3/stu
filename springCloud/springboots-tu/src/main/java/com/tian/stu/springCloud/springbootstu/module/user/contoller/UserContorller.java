package com.tian.stu.springCloud.springbootstu.module.user.contoller;

/**
 * desc:  <br>
 * date: 15:11
 *
 * @author : TianZhenYu
 */

import com.tian.stu.springCloud.springbootstu.module.user.domain.User;
import com.tian.stu.springCloud.springbootstu.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login () {
        User login = userService.login(1L);
        return login;
    }

    @RequestMapping("/login2")
    public User login2 () {
        User login = userService.login2(1L);
        return login;
    }
}
