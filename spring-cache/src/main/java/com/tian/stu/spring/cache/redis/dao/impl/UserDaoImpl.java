package com.tian.stu.spring.cache.redis.dao.impl;

import com.tian.stu.spring.cache.redis.dao.UserDao;
import com.tian.stu.spring.cache.redis.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.dao.impl stu
 */
@Component
public class UserDaoImpl implements UserDao {

    private Map<Object,User> users= new HashMap();


    public boolean addUser(User user) {
        users.put(user.getId(),user);
        return true;
    }

    public boolean deleteUser(User user) {
        users.remove(user.getId());
        return true;
    }

    public boolean updateUser(User user) {
        users.put(user.getId(),user);
        return true;
    }

    public User findOne(int id) {
        return users.get(id);
    }

    public List<User> findAll() {
        List<User> list = new ArrayList();
        for (Map.Entry<Object, User> entry : users.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
}
