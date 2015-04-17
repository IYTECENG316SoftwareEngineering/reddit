package com.codict.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codict.entity.Entry;
import com.codict.service.EntryService;
import com.codict.service.UserService;

@Controller
@RequestMapping("/users")
public class AdminController {

	@Autowired
	private UserService userService;

	@Autowired
	private EntryService entryService;

	@RequestMapping
	public String users(Model model) {
		model.addAttribute("users", userService.findAll());
		return "users";
	}
//	{id} is dynamic part of url
//	Front Controller looks this mapping and takes id value and put this value into pathvariable
	@RequestMapping("/{id}")
	public String detail(Model model, @PathVariable("id") int id) {
		model.addAttribute("user", userService.findOneWithEntries(id));
		return "user-detail";

	}
	@Transactional	
	@RequestMapping("/remove/{id}")
	public String removeUser(@PathVariable("id") int id){
		userService.delete(id);
		return "redirect:/users.html";
	}
	@Transactional
	@RequestMapping("/entry/remove/{id}")
	public String removeEntry(@PathVariable("id") int id){
		Entry entry = entryService.findOne(id);
		entryService.delete(entry);
		return "redirect:/users.html";
	}

	
}
