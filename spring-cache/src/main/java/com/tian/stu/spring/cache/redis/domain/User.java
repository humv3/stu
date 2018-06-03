package com.tian.stu.spring.cache.redis.domain;

import java.io.Serializable;

/**
 * @author:TianZhenYu
 * @date:2018/5/7
 * @description:com.tian.stu.spring.cache.sample.domain stu
 */
public class User implements Serializable{
    private static final long serialVersionUID=7981560250804078637l;

    private Integer id;

    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
