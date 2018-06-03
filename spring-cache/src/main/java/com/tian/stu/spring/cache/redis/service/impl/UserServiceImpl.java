package com.tian.stu.spring.cache.redis.service.impl;

import com.tian.stu.spring.cache.redis.dao.UserDao;
import com.tian.stu.spring.cache.redis.domain.User;
import com.tian.stu.spring.cache.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
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

    public boolean addUser(User user) {
       userDao.addUser(user);
        return false;
    }

    @CacheEvict(value = "data",key="#user.id")
    public boolean deleteUser(User user) {
        userDao.deleteUser(user);
        return false;
    }

    @CacheEvict(value ="data+#id",allEntries = true)
    public void deleteAllCache(){

    }

    @CacheEvict(value = "data",key = "#user.id")
    public boolean updateUser(User user) {
        userDao.updateUser(user);
        return false;
    }

    @CachePut(value = "data+#id",key = "#id")
    public User updateCache(int id){
        return userDao.findOne(id);
    }

    @Cacheable(value = "data+#id",key = "#id")
    public User findOne(int id) {
        System.out.println("userService执行");
        return userDao.findOne(id);
    }

    @Cacheable(value = "data")
    public List<User> findAll() {
        System.out.println("userService执行");
        List<User> all = userDao.findAll();
        return all;
    }
}
