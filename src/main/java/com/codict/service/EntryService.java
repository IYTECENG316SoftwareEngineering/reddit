package com.codict.service;

import java.util.List;
import java.util.Set;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
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

	public void save(Entry entry, String name) {
		User user = userRepository.findByName(name);
		entry.setUser(user);
		entryRepository.save(entry);
	}

	public Entry save(Entry entry) {
		return entryRepository.save(entry);
	}

	public void save(Entry entry, String name, Topic topic) {
		User user = userRepository.findByName(name);
		entry.setTopic(topic);
		entry.setUser(user);
		entry.setPublishedDate(new LocalDateTime());
		entryRepository.save(entry);
	}

	@PreAuthorize("#entry.user.name == authentication.name or hasRole('ROLE_ADMIN')")
	public void delete(@P("entry") Entry entry) {
		entryRepository.delete(entry);
	}

	public Entry findOne(int id) {
		return entryRepository.findOne(id);
	}

	public List<Entry> getEntries() {
		return entryRepository.findAll(
				new PageRequest(0, 20, Direction.DESC, "publishedDate"))
				.getContent();
	}

	public List<Entry> getLastEntriesByUser(User user) {
		return entryRepository.findByUser(user, new PageRequest(0, 8,
				Direction.DESC, "publishedDate"));
	}

	public List<Entry> getMostUpVotedEntriesByUser(User user) {
		return entryRepository.findByUser(user, new PageRequest(0, 8,
				Direction.DESC, "upVoteCount"));
	}

	public Set<Entry> getFavoritesByUser(User user) {

		return entryRepository.findByUserFavorited(user);
	}

	public Set<Integer> getFavoritedUsersID(Integer id) {

		return entryRepository.findByUserFavorited(id);

	}

}
