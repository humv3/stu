package com.tian.stu.spring_boot.redis.spring_boot_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRedisApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringBootRedisApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
