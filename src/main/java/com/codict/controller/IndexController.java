package com.codict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codict.service.EntryService;

@Controller
public class IndexController {

	@Autowired
	private EntryService entryService;
	
	
//	returns a String that is location of view template in my cases jsp file
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("entries", entryService.getEntries());
		return "index";
	}

}
