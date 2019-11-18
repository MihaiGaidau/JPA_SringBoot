package com.learning.database;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
class DatabaseApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Test
	public void findAllUsers()  {
		List<User> users = userRepository.findAll();
		assertNotNull(users);
		assertFalse(users.isEmpty());
	}
	@Test
	public void findUserById()  {
		Optional<User> user = userRepository.findById(1);
		assertNotNull(user.get());
	}

	@Test
	public void createUser() {
		User user = new User();
		user.setName("Paul");
		user.setEmail("paul@gmail.com");
		User savedUser = userRepository.save(user);
		User newUser = userRepository.findById(savedUser.getId()).get();
		assertEquals("Paul", newUser.getName());
		assertEquals("paul@gmail.com", newUser.getEmail());
	}

}
