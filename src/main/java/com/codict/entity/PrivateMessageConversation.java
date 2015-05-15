package com.codict.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PrivateMessageConversation {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private User senderUser;

	@ManyToOne
	private User receiverUser;

	private String subject;

	@OneToMany(mappedBy = "privateMessageConversation")
	private List<PrivateMessage> messages;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getSenderUser() {
		return senderUser;
	}

	public void setSenderUser(User senderUser) {
		this.senderUser = senderUser;
	}

	public User getReceiverUser() {
		return receiverUser;
	}

	public void setReceiverUser(User receiverUser) {
		this.receiverUser = receiverUser;
	}

	public List<PrivateMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<PrivateMessage> messages) {
		this.messages = messages;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void addPrivateMessage(PrivateMessage privateMessage){
		messages.add(privateMessage);
	}

}
