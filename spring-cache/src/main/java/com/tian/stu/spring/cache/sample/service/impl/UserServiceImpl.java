package com.tian.stu.spring.cache.sample.service.impl;

import com.tian.stu.spring.cache.sample.dao.UserDao;
import com.tian.stu.spring.cache.sample.domain.User;
import com.tian.stu.spring.cache.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.service.impl stu
 */
@Component
@EnableCaching
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @CacheEvict(value = "data",allEntries = true)
    public boolean addUser(User user) {
       userDao.addUser(user);
        return false;
    }

    @CacheEvict(value = "data",allEntries = true)
    public boolean deleteUser(User user) {
        userDao.deleteUser(user);
        return false;
    }

    @CacheEvict(value = "data",allEntries = true)
    public boolean updateUser(User user) {
        userDao.deleteUser(user);
        return false;
    }

    @Cacheable(value = "data")
    public boolean findOne(int id) {
        System.out.println("userService执行");
        userDao.findOne(id);
        return false;
    }

    @Cacheable(value = "data")
    public List<User> findAll() {
        System.out.println("userService执行");
        List<User> all = userDao.findAll();
        return all;
    }
}
