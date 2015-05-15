package com.codict.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

 
	
}
