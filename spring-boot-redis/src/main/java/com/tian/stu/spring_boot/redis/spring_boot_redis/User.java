package com.tian.stu.spring_boot.redis.spring_boot_redis;

import java.io.Serializable;

/**
 * @author:TianZhenYu
 * @date:2018/5/2
 * @description:com.tian.stu.spring_boot.redis.spring_boot_redis.pojos stu
 */

public class User implements Serializable{


    private  static final long serialVersionUID=7981560250804078637l;

    private String name;

    private String age;
    
    private String id;

    public User(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
