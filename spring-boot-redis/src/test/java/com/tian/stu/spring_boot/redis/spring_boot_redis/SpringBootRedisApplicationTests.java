package com.tian.stu.spring_boot.redis.spring_boot_redis;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRedisApplicationTests {

		private Logger logger= LoggerFactory.getLogger(this.getClass());



		@Autowired
		private RedisService service;

		@Test
		public void contextLoads() {

			User user=new User("student1","name","19");

			User user1 = service.addUser(user);
			System.out.println(user1);
			System.out.println(user.equals(user1) + "比较");

		/*	try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}*/
			logger.info("RedisTest执行完成，return {}",service.getStudent(user1.getId()).getId());
			System.out.println("ok");
			City city=new City("city1","400500","深圳");
			service.addCity(city);

			try {
				System.in.read();


			} catch (IOException e) {
				e.printStackTrace();
			}
		}



}
