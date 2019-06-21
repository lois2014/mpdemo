package com.example.mpdemo;

import com.example.mpdemo.entity.User;
import com.example.mpdemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.mpdemo.mapper")
public class MpdemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testInsert() {

		System.out.println("--- insert ---");
		User user = new User();

		user.setName("123");
		user.setAge(1);
		user.setEmail("123434@qq.com");
		int a = userMapper.insert(user);

	}

	@Test
	public void testSelect() {
		System.out.println("--- select ---");
		List<User> userList = userMapper.selectList(null);
		Assert.assertEquals(6, userList.size());
		userList.forEach(System.out::println);
	}

}
