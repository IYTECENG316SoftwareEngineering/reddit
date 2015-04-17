	package com.codict.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codict.entity.Category;
import com.codict.entity.Entry;
import com.codict.entity.Role;
import com.codict.entity.Topic;
import com.codict.entity.User;
import com.codict.repository.CategoryRepository;
import com.codict.repository.EntryRepository;
import com.codict.repository.RoleRepository;
import com.codict.repository.TopicRepository;
import com.codict.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	// RoleRepository is an interface, here is not instance of interface, here is
	// instance of the some classes that will be generated and implement
	// repository interface.
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EntryRepository entryRepository;
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

//	it is created after the spring context creation that is created during application startup.
//	any method that is postconstruct calls automaticly.
	
	@PostConstruct
	public void init() {
			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);

			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);

			
			User userAdmin = new User();
			userAdmin.setEnabled(true);
			userAdmin.setName("admin");
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			userAdmin.setPassword(encoder.encode("admin"));
			userAdmin.setEmail("admin@gmail.com");
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleUser);
			roles.add(roleAdmin);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);
		
			
			User user = new User();
			user.setEnabled(true);
			user.setName("user");
			BCryptPasswordEncoder encoder2 = new BCryptPasswordEncoder();
			user.setPassword(encoder2.encode("user"));
			user.setEmail("user@gmail.com");
			List<Role> userroles = new ArrayList<Role>();
			userroles.add(roleUser);
			user.setRoles(userroles);
			userRepository.save(user);
			
			
			
			Category category = new Category();
			category.setName("Programming");
			categoryRepository.save(category);
			
			Category category2 = new Category();
			category2.setName("Politics");
			categoryRepository.save(category2);
			
			Category category3 = new Category();
			category3.setName("Health");
			categoryRepository.save(category3);
			
			Category category4 = new Category();
			category4.setName("Religion");
			categoryRepository.save(category4);
			
			Category category5 = new Category();
			category5.setName("Human");
			categoryRepository.save(category5);
			
			Category category6 = new Category();
			category6.setName("Science");
			categoryRepository.save(category6);
			
			Topic topic= new Topic();
			topic.setTitle("Java");
			topic.setCategory(category);
			topicRepository.save(topic);

			
			Entry entry1 = new Entry();
			entry1.setTopic(topic);
			entry1.setUser(userAdmin);
			entry1.setPublishedDate(new LocalDateTime());
			entry1.setDescription("A good robust scalable object oriented programming language.");
			entryRepository.save(entry1);
			
			Entry entry2 = new Entry();
			entry2.setTopic(topic);
			entry2.setUser(userAdmin);
			entry2.setPublishedDate(new LocalDateTime());
			entry2.setDescription("It's a programming language primarily utilized for making enterprise level applications.");
			entryRepository.save(entry2);
			
			Entry entry3 = new Entry();
			entry3.setTopic(topic);
			entry3.setUser(user);
			entry3.setPublishedDate(new LocalDateTime());
			entry3.setDescription("Spelled like that, coffee.");
			entryRepository.save(entry3);


			
			Topic topic2= new Topic();
			topic2.setTitle("Economic crisis");
			topic2.setCategory(category2);
			topicRepository.save(topic2);
			
			Entry entry4 = new Entry();
			entry4.setTopic(topic2);
			entry4.setUser(user);
			entry4.setPublishedDate(new LocalDateTime());
			entry4.setDescription("People are hurt unnecessarily because they remember only good times and are not prepared for bad times. ");
			entryRepository.save(entry4);
			
			Entry entry5 = new Entry();
			entry5.setTopic(topic2);
			entry5.setUser(user);
			entry5.setPublishedDate(new LocalDateTime());
			entry5.setDescription("When there are 2 consecutive quarters (6 months) of Negative GDP growth it is called recession.");
			entryRepository.save(entry5);
			
	}
}
