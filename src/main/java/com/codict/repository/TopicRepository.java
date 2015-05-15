package com.codict.repository;

import java.util.List;

import javax.persistence.Cacheable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.codict.entity.Category;
import com.codict.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

	Topic findByTitle(String title);

	@Modifying(clearAutomatically = true)
	@Query("update Topic u set u.dailyEntryCount = '0'")
	void resetDailyEntriesCount();

	List<Topic> findByTitleContainingIgnoreCase(String criteria);

	List<Topic> findByCategory(Category category, Pageable pageable);

	@Query("select count(u) from Entry u where topic_id = ?1")
	Long countWithTopic(int id);

	@Query("select count(u) from Topic u where category_id = ?1")
	Long countWithCategory(int id);

}
