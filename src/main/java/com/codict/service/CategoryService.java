package com.codict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codict.entity.Category;
import com.codict.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category findByName(String category) {
		return categoryRepository.findByNameIgnoreCase(category);
	}

	public Category findOne(int id) {
		return categoryRepository.findOne(id);
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
