package com.codict.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.joda.time.LocalTime;

import com.codict.annotation.UniqueTopicTitle;

@Entity
public class Topic {

	@Id
	@GeneratedValue
	private Integer id;

	
	@Column(unique = true)
	@UniqueTopicTitle(message="Such title already exist!")
	@Size(min = 3, message = "Title must be at least 3 characters!")
	private String title;
	
	@ManyToOne
	private Category category; 
	
	private LocalTime lastUpdatedTime;
	

	
	@OneToMany(mappedBy="topic")
	private List<Entry> entries;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title.toLowerCase();
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(LocalTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	
		
}

