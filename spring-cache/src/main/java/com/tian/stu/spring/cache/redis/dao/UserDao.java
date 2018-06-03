package com.tian.stu.spring.cache.redis.dao;

import com.tian.stu.spring.cache.redis.domain.User;

import java.util.List;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.dao stu
 */
public interface UserDao {

    boolean addUser(User user);
    boolean deleteUser(User user);
    boolean updateUser(User user);
    User findOne(int id);
    List<User> findAll();
}
