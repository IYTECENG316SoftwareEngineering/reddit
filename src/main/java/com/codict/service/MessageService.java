package com.codict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codict.entity.PrivateMessage;
import com.codict.entity.PrivateMessageConversation;
import com.codict.entity.User;
import com.codict.repository.PrivateMessageConversationRepository;
import com.codict.repository.PrivateMessageRepository;
import com.codict.repository.UserRepository;

@Service
public class MessageService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PrivateMessageRepository privateMessageRepository;

	@Autowired
	private PrivateMessageConversationRepository privateMessageConversationRepository;

	public List<PrivateMessageConversation> findConversationsByUser(User user) {

		return privateMessageConversationRepository
				.findBySenderUserOrReceiverUser(user, user);
	}
	
	public PrivateMessageConversation findOne(int id){
		return privateMessageConversationRepository.findOne(id);
	}

	public PrivateMessageConversation findOneWithMessages(int id) {

		PrivateMessageConversation privateMessageConversation = privateMessageConversationRepository
				.findOne(id);
		System.out.println(privateMessageConversation.getSubject());
		List<PrivateMessage> messages = privateMessageRepository
				.findByPrivateMessageConversation(privateMessageConversation);
		privateMessageConversation.setMessages(messages);
		System.out.println("Message size is:" +messages.size());
		return privateMessageConversation;
	}
	
	public PrivateMessage save(PrivateMessage message){
		return privateMessageRepository.save(message);
	}

	public PrivateMessageConversation save(PrivateMessageConversation conversation){
		return privateMessageConversationRepository.save(conversation);
	}
}
