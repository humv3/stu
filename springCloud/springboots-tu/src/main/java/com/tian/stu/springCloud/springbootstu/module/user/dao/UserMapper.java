package com.tian.stu.springCloud.springbootstu.module.user.dao;


import com.tian.stu.springCloud.springbootstu.module.user.domain.User;
import com.yx.exam.module.authority.domain.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * desc:  <br>
 * date: 2019 07 01
 * @author TianZhenYu
 */
@Repository
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}