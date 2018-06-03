package com.tian.stu.spring_boot.redis.spring_boot_redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:TianZhenYu
 * @date:2018/5/2
 * @description:com.tian.stu.spring_boot.redis.spring_boot_redis stu
 */
@Service
@Configuration
@EnableCaching
public class RedisService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    private Set<User> users = new HashSet<User>();

    private Set<City> cities = new HashSet<City>();

    @CachePut(value = "user", key = "'User:'+#user.id")
    public User addUser(User user) {
        users.add( user );
        return user;
    }

    @Cacheable(value = "user", key = "'User:'+#id")
    public User addUser( String id,  String name,  String age ) {
        User user = new User(id, name, age);
        users.add(user);
        return user;
    }

    @Cacheable(value = "user", key = "'User:'+#id")
    public User getStudent(String id) {
        System.out.println("not in redis cache");
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @CachePut(value = "city", key = "'City:'+#city.id")
    public City addCity(City city) {
        cities.add(city);
        return city;
    }
}