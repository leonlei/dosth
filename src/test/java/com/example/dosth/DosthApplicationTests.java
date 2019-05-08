package com.example.dosth;

import com.example.dosth.domain.User;
import com.example.dosth.repo.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DosthApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void test(){
		User user = userRepository.getOne(1);
	}
}
