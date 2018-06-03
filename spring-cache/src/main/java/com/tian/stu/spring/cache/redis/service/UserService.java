package com.tian.stu.spring.cache.redis.service;

import com.tian.stu.spring.cache.redis.domain.User;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.service stu
 */
public interface UserService {

    boolean addUser(User user);
    boolean deleteUser(User user);
    boolean updateUser(User user);
    User findOne(int id);
    List<User> findAll();
    User updateCache(int id);
    void deleteAllCache();
}
