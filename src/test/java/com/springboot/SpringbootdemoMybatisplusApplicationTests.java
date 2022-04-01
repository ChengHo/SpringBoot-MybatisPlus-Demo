package com.springboot;

import com.springboot.mapper.UserMapper;
import com.springboot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootdemoMybatisplusApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		List<User> list = userMapper.selectList(null);
		assertEquals(5, list.size());
		list.forEach(System.out::println);
	}

	@Test
	void contextLoads() {
	}

}
