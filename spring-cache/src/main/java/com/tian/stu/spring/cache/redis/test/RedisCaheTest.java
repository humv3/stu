package com.tian.stu.spring.cache.redis.test;

import com.tian.stu.spring.cache.redis.dao.UserDao;
import com.tian.stu.spring.cache.redis.domain.User;
import com.tian.stu.spring.cache.redis.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.BoundZSetOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.IOException;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.test stu
 */

public class RedisCaheTest {

    private ApplicationContext ac ;

    private UserService userService;

    private UserDao userDao;

    private RedisTemplate redisTemplate;

    @Before
    public void init() {
        ac = new ClassPathXmlApplicationContext("classpath:spring-redis.xml");
        userService = ac.getBean(UserService.class);
        userDao = ac.getBean(UserDao.class);
        redisTemplate = ac.getBean(RedisTemplate.class);
    }

    @Test
    public void testRedisCache(){
        userService.deleteAllCache();

        System.out.println("添加user,id=0");
        userService.addUser(new User(0,"zero"));
        System.out.println("第一次查询");
        System.out.println(userService.findOne(0));
        System.out.println("第二次查询");
        System.out.println(userService.findOne(0));

        System.out.println("添加user,id=1");
        userService.addUser(new User(1,"one"));
        System.out.println("第一次查询");
        System.out.println(userService.findOne(1));
        System.out.println("第二次查询");
        System.out.println(userService.findOne(1));

        userService.updateUser(new User(0,"zero+"));
        System.out.println("更新map后查询");
        System.out.println(userService.findOne(0));
        userService.updateCache(0);
        System.out.println("更新cache后查询");
        System.out.println(userService.findOne(0));


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
