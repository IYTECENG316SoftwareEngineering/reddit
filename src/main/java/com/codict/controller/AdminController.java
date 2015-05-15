package com.codict.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.service.EntryService;
import com.codict.service.TopicService;
import com.codict.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private UserService userService;

	@Autowired
	private EntryService entryService;
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public String topics(Model model) {
		model.addAttribute("topics", topicService.findAll());
		return "topics";
	}

	@RequestMapping("/users")
	public String users(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users";
	}
//	{id} is dynamic part of url
//	Front Controller looks this mapping and takes id value and put this value into pathvariable
	@RequestMapping("users/{id}")
	public String detail(Model model, @PathVariable("id") int id) {
		model.addAttribute("user", userService.findOneWithEntries(id));
		return "user-detail";
	}
	
	@Transactional	
	@RequestMapping("users/remove/{id}")
	public String removeUser(@PathVariable("id") int id){
		userService.delete(id);
		return "redirect:/users.html";
	}
	@Transactional
	@RequestMapping("users/entry/remove/{id}")
	public String removeEntry(@PathVariable("id") int id){
		Entry entry = entryService.findOne(id);
		entryService.delete(entry);
		return "redirect:/users.html";
	}
	
	@Transactional
	@RequestMapping("topics/remove/{id}")
	public String removeTopic(@PathVariable("id") int id){
		Topic topic = topicService.findOne(id);
		topicService.delete(topic);
		return "redirect:/topics.html";
	}

	
}
