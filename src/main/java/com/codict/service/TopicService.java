package com.codict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codict.entity.Category;
import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.helper.Settings;
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

	// @Cacheable(value = "podcasts", key = "#id")
	@Transactional
	public Topic findOneWithEntries(int id, int pageNumber, String sortingType) {
		Topic topic = findOne(id);
		List<Entry> entries = entryRepository.findByTopic(topic,
				new PageRequest(pageNumber, Settings.PAGE_CAPACITY,
						Direction.ASC, sortingType));
		topic.setEntries(entries);
		return topic;
	}

	@Transactional
	public List<Topic> findAll() {
		List<Topic> topics = topicRepository.findAll();
		return topics;
	}

	@CacheEvict(value = "podcasts", key = "#topic.id")
	public Topic save(Topic topic) {
		return topicRepository.save(topic);
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(Topic topic) {
		topicRepository.delete(topic);
	}

	// @Scheduled(fixedDelay = 5000)
	// public void resetDailyEntryCount() {
	// topicRepository.resetDailyEntriesCount();
	// }

	public List<Topic> findTopicByCriteria(String criteria) {

		return topicRepository.findByTitleContainingIgnoreCase(criteria);
	}

	public Long getTopicTotalPageCount(int id) {

		return topicRepository.countWithTopic(id);

	}

	public Long getCategoryTotalPageCount(int id) {

		return topicRepository.countWithCategory(id);

	}

	public List<Topic> findByCategory(Category categoryObj, int pageNumber) {

		return topicRepository.findByCategory(categoryObj, new PageRequest(
				pageNumber, 2, Direction.DESC, "lastUpdatedTime"));
	}

//	public Topic findNiceOneWithEntries(int id, int pageNumber) {
//
//		Topic topic = topicRepository.findOne(id);
//		topic.setEntries(entryRepository.findByTopic(topic, new PageRequest(
//				pageNumber, 2, Direction.DESC, "upVoteCount")));
//		return topic;
//	}
}
