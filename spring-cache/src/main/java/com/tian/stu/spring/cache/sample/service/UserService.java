package com.tian.stu.spring.cache.sample.service;

import com.tian.stu.spring.cache.sample.domain.User;

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
    boolean findOne(int id);
    List<User> findAll();
}
