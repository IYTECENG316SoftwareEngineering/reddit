package com.codict.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.joda.time.LocalDateTime;

@Entity
public class PrivateMessage {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String message;
	
	private LocalDateTime sentDate;

	private String sentDateString;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	private PrivateMessageConversation privateMessageConversation;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message.toLowerCase();
	}

	public LocalDateTime getSentDate() {
		return sentDate;
	}

	public void setSentDate(LocalDateTime sentDate) {
		this.sentDate = sentDate;
		this.sentDateString = sentDate.toString("dd-MMM-yy hh:mm:ss");
	}


	public String getSentDateString() {
		return sentDateString;
	}

	public void setSentDateString(String sentDateString) {
		this.sentDateString = sentDateString;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public PrivateMessageConversation getPrivateMessageConversation() {
		return privateMessageConversation;
	}

	public void setPrivateMessageConversation(
			PrivateMessageConversation privateMessageConversation) {
		this.privateMessageConversation = privateMessageConversation;
	}
	
}
