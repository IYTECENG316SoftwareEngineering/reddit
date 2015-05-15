package com.codict.entity;

import java.util.List;

import javax.persistence.CascadeType;
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
	
	private Integer dailyEntryCount = 0;
	
	@OneToMany(mappedBy="topic", cascade = CascadeType.REMOVE)
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

	public Integer getDailyEntryCount() {
		return dailyEntryCount;
	}

	public void setDailyEntryCount(Integer dailyEntryCount) {
		this.dailyEntryCount = dailyEntryCount;
	}

	public void increaseOneDailyEntryCount(){
		dailyEntryCount++;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (( id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((title == null) ? 0 : title.hashCode());
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result
				+ ((lastUpdatedTime == null) ? 0 : lastUpdatedTime.hashCode());
		result = prime * result
				+ ((dailyEntryCount == null) ? 0 : dailyEntryCount.hashCode());
		result = prime * result
				+ ((entries == null) ? 0 : entries.hashCode());
		
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topic other = (Topic) obj;
		return this.hashCode() == other.hashCode();
	}
	
		
}

