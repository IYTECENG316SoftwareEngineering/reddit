package com.codict.service;

import java.util.List;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.entity.User;
import com.codict.repository.EntryRepository;
import com.codict.repository.TopicRepository;
import com.codict.repository.UserRepository;

@Service
public class EntryService {
	@Autowired
	private EntryRepository entryRepository;
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public void save(Entry entry, String name){
		User user = userRepository.findByName(name);
		entry.setUser(user);
		entryRepository.save(entry);
	}
	
	public void save(Entry entry){
		entryRepository.save(entry);
	}
	
	public void save(Entry entry, String name, Topic topic){
		User user = userRepository.findByName(name);
		entry.setTopic(topic);
		entry.setUser(user);
		entry.setPublishedDate(new LocalDateTime());
		entryRepository.save(entry);
	}
	
	public void delete(Entry entry) {
		entryRepository.delete(entry);
	}

	public Entry findOne(int id) {
		return entryRepository.findOne(id);
	}
	public List<Entry> getEntries(){
		return entryRepository.findAll(new PageRequest(0, 20, Direction.DESC, "publishedDate")).getContent();
	}


}
