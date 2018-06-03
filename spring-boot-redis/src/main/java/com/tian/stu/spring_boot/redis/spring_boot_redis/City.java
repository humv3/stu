package com.tian.stu.spring_boot.redis.spring_boot_redis;

import java.io.Serializable;

/**
 * @author:TianZhenYu
 * @date:2018/5/2
 * @description:com.tian.stu.spring_boot.redis.spring_boot_redis.pojos stu
 */
public class City implements Serializable {


    private String city1;

    private String s;

    private String sz;

    private String id;

    public City(String city1, String s, String 深圳) {
        this.city1 = city1;
        this.s = s;
        this.sz = 深圳;
    }

    public String getCity1() {
        return city1;
    }

    public void setCity1(String city1) {
        this.city1 = city1;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
