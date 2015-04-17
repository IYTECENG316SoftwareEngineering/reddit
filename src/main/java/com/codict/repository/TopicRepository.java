package com.codict.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer>{
	Topic findByTitle(String title);
}
