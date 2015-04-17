package com.codict.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.repository.EntryRepository;
import com.codict.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	@Autowired
	private EntryRepository entryRepository;

	public Topic findOne(int id) {
		return topicRepository.findOne(id);
	}

	public Topic findOne(String title) {
		return topicRepository.findByTitle(title);
	}

	@Transactional
	public Topic findOneWithEntries(int id) {
		Topic topic = findOne(id);
		List<Entry> entries = entryRepository.findByTopic(topic,
				new PageRequest(0, 10, Direction.ASC, "publishedDate"));
		topic.setEntries(entries);
		return topic;
	}

	@Transactional
	public List<Topic> findAll() {
		List<Topic> topics = topicRepository.findAll();
		return topics;
	}

	public Topic save(Topic topic) {
		return topicRepository.save(topic);
	}

}
