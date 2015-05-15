package com.codict.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	Category findByNameIgnoreCase(String Name);
	
}
