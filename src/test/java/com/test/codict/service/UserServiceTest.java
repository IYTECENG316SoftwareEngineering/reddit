package com.test.codict.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codict.entity.Role;
import com.codict.entity.User;
import com.codict.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"})
@Transactional
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindOneString() {
		User user = userService.findOne("admin");
		assertEquals(user.getName(),"admin");
	}

	@Test
	public void testFindOneWithEntriesInt() {
		User user = userService.findOneWithEntries(1);
		assertEquals(user.getEntries().size(), 2);
	}

	@Test
	public void testSave() {
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		
		User user = new User();
		user.setEnabled(true);
		user.setName("mike");
		BCryptPasswordEncoder encoder2 = new BCryptPasswordEncoder();
		user.setPassword(encoder2.encode("mike"));
		user.setEmail("mike@gmail.com");
		List<Role> userroles = new ArrayList<Role>();
		userroles.add(roleUser);
		user.setRoles(userroles);
		
		User returned = userService.save(user);
		
		assertEquals(user.getName(), returned.getName());
		assertEquals(user.getRoles().get(0), returned.getRoles().get(0));
	}


}
