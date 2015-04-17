package com.codict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codict.service.EntryService;

@Controller
public class EntryController {

	@Autowired
	private EntryService entryService;
	
	@RequestMapping("/entry/{id}")
	public String topicIndex(@PathVariable("id") int id, Model model) {
		model.addAttribute("entry", entryService.findOne(id));
		return "entry";
	}
}
