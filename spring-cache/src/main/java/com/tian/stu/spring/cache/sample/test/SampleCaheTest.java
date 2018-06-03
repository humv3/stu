package com.tian.stu.spring.cache.sample.test;

import com.tian.stu.spring.cache.sample.dao.UserDao;
import com.tian.stu.spring.cache.sample.domain.User;
import com.tian.stu.spring.cache.sample.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.test stu
 */

public class SampleCaheTest {

    private ApplicationContext ac ;

    private UserService userService;

    private UserDao userDao;

    @Before
    public void init() {
        ac = new ClassPathXmlApplicationContext("classpath:spring-sample.xml");
        userService = ac.getBean(UserService.class);
        userDao = ac.getBean(UserDao.class);
    }

    @Test
    public void testSampleCache(){
        System.out.println("添加user");
        userService.addUser(new User(0,"one"));
        System.out.println("第一次查询");
        System.out.println(userService.findOne(0));
        System.out.println("第二次查询");
        System.out.println(userService.findOne(0));
    }
}
