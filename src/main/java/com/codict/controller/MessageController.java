package com.codict.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codict.entity.Entry;
import com.codict.entity.PrivateMessage;
import com.codict.entity.PrivateMessageConversation;
import com.codict.entity.Topic;
import com.codict.entity.User;
import com.codict.service.CategoryService;
import com.codict.service.EntryService;
import com.codict.service.MessageService;
import com.codict.service.TopicService;
import com.codict.service.UserService;

@Controller
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private UserService userService;

	@Autowired
	private EntryService entryService;

	@Autowired
	private TopicService topicService;

	@Autowired
	private CategoryService categoryService;
	
	
	@ModelAttribute("privateMessage")
	public PrivateMessage constructMessage() {
		return new PrivateMessage();
	}

	
	@RequestMapping(value = "/account/inbox", method = RequestMethod.GET)
	public  String showInbox( Model model, Principal principal ){

		User user = userService.findOne(principal.getName());
		List<PrivateMessageConversation> conversations = messageService.findConversationsByUser(user);
		model.addAttribute("conversations", conversations);
		
		return "privateMessage";
	}
	
	
	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET)
	public  String showMessage( Model model, @PathVariable("id") int id ){

		PrivateMessageConversation conversation = messageService.findOneWithMessages(id);
		model.addAttribute("conversation", conversation);
		
		return "conversation";
	}
	
	@RequestMapping(value = "/message/{id}", method = RequestMethod.POST, params = "sendMessage")
	public String doSendMessage(Model model, @PathVariable("id") int id,
			@Valid @ModelAttribute("privateMessage") PrivateMessage privateMessage, BindingResult result,Principal principal) {
		if (result.hasErrors()) {
			return showMessage(model,id);
		}
		User messageOwner = userService.findOne(principal.getName());
		
		PrivateMessage message = new PrivateMessage();
		message.setMessage(privateMessage.getMessage());
		message.setUser(messageOwner);
		
		PrivateMessageConversation conversation = messageService.findOneWithMessages(id);
		message.setPrivateMessageConversation(conversation);
		messageService.save(message);
		
		return "redirect:/message/{id}.html";
	}
	
	
	
}