package com.codict.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.entity.User;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

	List<Entry> findByUser(User user, Pageable pageable);

	List<Entry> findByUser(User user);

	Set<Entry> findByUserFavorited(User user);

	@Query(value = "SELECT favoriteEntries_id FROM app_user_Entry WHERE userFavorited_id = ?1", nativeQuery = true)
	Set<Integer> findByUserFavorited(Integer id);

	List<Entry> findByTopic(Topic topic, Pageable pageable);


}
