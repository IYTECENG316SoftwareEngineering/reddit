package com.codict.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.entity.User;

public interface EntryRepository extends JpaRepository<Entry, Integer>{
	
	List<Entry> findByUser(User user, Pageable pageable);
	
	List<Entry> findByTopic(Topic topic, Pageable pageable);
}
