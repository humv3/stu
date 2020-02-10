package com.tian.stu.springCloud.springbootstu.module.user.service;

/**
 * desc:  <br>
 * date: 15:19
 *
 * @author : TianZhenYu
 */

import com.tian.stu.springCloud.springbootstu.module.user.dao.UserMapper;
import com.tian.stu.springCloud.springbootstu.module.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * desc:  <br>
 * date: 2019/7/20 15:19
 *
 * @author TianZhenYu
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login( Long id  ){
       return userMapper.selectByPrimaryKey( id );
    }

    public User login2(Long id) {
        return userMapper.login2( id );
    }
}
