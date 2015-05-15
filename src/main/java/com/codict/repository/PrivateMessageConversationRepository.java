package com.codict.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.PrivateMessageConversation;
import com.codict.entity.User;

public interface PrivateMessageConversationRepository  extends JpaRepository<PrivateMessageConversation, Integer>{

	List<PrivateMessageConversation> findBySenderUser(User user);
	List<PrivateMessageConversation> findByReceiverUser(User user);
//
	List<PrivateMessageConversation> findBySenderUserOrReceiverUser(User user1,User user2);


	
}
