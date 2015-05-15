package com.codict.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.joda.time.LocalDateTime;

@Entity
public class Entry {

	@Id
	@GeneratedValue
	private Integer id;

	@Size(min = 3, message = "Entry must be at least 3 characters!")
	private String description;

	@Column(name = "published_date")
	private LocalDateTime publishedDate;

	private String dateString;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	private Integer upVoteCount = 0;

	private Integer downVoteCount = 0;

	@ManyToMany(mappedBy = "favoriteEntries")
	private Set<User> userFavorited;

	@ManyToOne
	@JoinColumn(name = "topic_id")
	private Topic topic;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.toLowerCase();
		;
	}

	public LocalDateTime getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(LocalDateTime publishedDate) {
		this.publishedDate = publishedDate;
		this.dateString = publishedDate.toString("dd-MMM-yy hh:mm:ss");
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public Integer getUpVoteCount() {
		return upVoteCount;
	}

	public void setUpVoteCount(Integer upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	public Integer getDownVoteCount() {
		return downVoteCount;
	}

	public void setDownVoteCount(Integer downVoteCount) {
		this.downVoteCount = downVoteCount;
	}

	public void addUpVote() {
		upVoteCount++;
	}

	public void addDownVote() {
		downVoteCount++;
	}

	public Set<User> getUserFavorited() {
		return userFavorited;
	}

	public void setUserFavorited(Set<User> userFavorited) {
		this.userFavorited = userFavorited;
	}

}
