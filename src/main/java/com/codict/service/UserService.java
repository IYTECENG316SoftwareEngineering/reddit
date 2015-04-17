package com.codict.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codict.entity.Entry;
import com.codict.entity.Role;
import com.codict.entity.User;
import com.codict.repository.EntryRepository;
import com.codict.repository.RoleRepository;
import com.codict.repository.TopicRepository;
import com.codict.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EntryRepository entryRepository;
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}
	
	public User findOne(String name) {
		return userRepository.findByName(name);
	}
	
	@Transactional
	public User findOneWithEntries(int id) {
		User user = findOne(id);
		List<Entry> entries =  entryRepository.findByUser(user, new PageRequest(0, 10, Direction.DESC, "publishedDate"));
		user.setEntries(entries);
		return user;
	}

	public User save(User user) {
//		Before saving, set enabled and encode password
		user.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		
		List<Role> roles = new ArrayList<Role>();
//		Get role user as an object
		roles.add(roleRepository.findByName("ROLE_USER"));
		user.setRoles(roles);
		
		return userRepository.save(user);
		
	}

	public User findOneWithEntries(String name) {
		User user = userRepository.findByName(name);
		return findOneWithEntries(user.getId());
	}
	
	public void delete(int id) {
		userRepository.delete(id);	
	}
}
