package com.tian.stu.springCloud.springbootstu.module.user.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "t_user")
public class User {

    public User() {
    }

    private Long id;


    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    @JSONField( format = "yyyy-MM-dd" ,serialize = false)
    private Date date = new Date();


}