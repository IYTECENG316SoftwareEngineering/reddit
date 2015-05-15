package com.codict.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codict.entity.PrivateMessage;
import com.codict.entity.PrivateMessageConversation;

public interface PrivateMessageRepository extends JpaRepository<PrivateMessage, Integer> {

	
	List<PrivateMessage> findByPrivateMessageConversation(PrivateMessageConversation privateMessageConversation);
	
}
