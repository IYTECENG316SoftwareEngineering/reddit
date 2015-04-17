package com.codict.entity.formModal;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class NewTopic {

	@Size(max = 60, message = "Title must be at most 60 characters!")
	public String topicTitle;
	public String firstEntry;
	public String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTopicTitle() {
		return topicTitle;
	}

	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}

	public String getFirstEntry() {
		return firstEntry;
	}

	public void setFirstEntry(String firstEntry) {
		this.firstEntry = firstEntry;
	}

	@Override
	public String toString() {
		return "NewTopic [topicTitle=" + topicTitle + ", firstEntry="
				+ firstEntry + ", category=" + category + "]";
	}
}
