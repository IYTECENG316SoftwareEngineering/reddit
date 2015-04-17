package com.codict.controller;

import java.security.Principal;
import java.util.Arrays;

import javax.validation.Valid;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codict.entity.Category;
import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.entity.formModal.NewTopic;
import com.codict.service.CategoryService;
import com.codict.service.EntryService;
import com.codict.service.TopicService;
import com.codict.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private EntryService entryService;

	@Autowired
	private TopicService topicService;

	@Autowired
	private CategoryService categoryService;

	@ModelAttribute("topic")
	public Topic contructTopic() {
		return new Topic();
	}
	
	@ModelAttribute("entry")
	public Entry contructEntry() {
		return new Entry();
	}

	@ModelAttribute("newTopic")
	public NewTopic contructNewTopic() {
		return new NewTopic();
	}

	@RequestMapping("/account")
	public String account(Model model, Principal principal) {
		String name = principal.getName();
		model.addAttribute("user", userService.findOneWithEntries(name));
		model.addAttribute("categoryList", Arrays.asList("Science",
				"Programming", "Human", "Politics", "Health", "Religion"));
		return "account";
	}

//	@RequestMapping(value = "/account", method = RequestMethod.POST, params = "button1")
//	public String doAddNewTopic(Model model,
//			@Valid @ModelAttribute("newTopic") NewTopic newTopic,
//			BindingResult result, Principal principal) {
//		
//		if (result.hasErrors()) {
//			return account(model, principal);
//		}
//
//		String name = principal.getName();
//
//		Category categorty = categoryService.findByName(newTopic.category);
//		Topic topic = new Topic();
//		topic.setTitle(newTopic.getTopicTitle());
//		topic.setCategory(categorty);
//		topicService.save(topic);
//
//		Entry entry = new Entry();
//		entry.setDescription(newTopic.getFirstEntry());
//		entry.setTopic(topic);
//		entry.setPublishedDate(new LocalDateTime());
//		entryService.save(entry, name);
//
//		return "redirect:/topic/" + topic.getId() + ".html";
//	}
	
	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public String doAddNewTopic(Model model,
			@Valid @ModelAttribute("topic") Topic topic,
			BindingResult resultTopic, Principal principal, @Valid @ModelAttribute("entry") Entry entry,
			BindingResult resultEntry, @RequestParam("topic_category") String category_string) {
		System.out.println(principal.getName() + " " + category_string + " " + topic.getTitle() + " "+ entry.getDescription());

		if (resultTopic.hasErrors()) {
			System.out.println("Hata topic "+ resultTopic.toString());
			return account(model, principal);
		}
		if (resultEntry.hasErrors()) {
			return account(model, principal);
		}

		String name = principal.getName();
		
		
		
		Category category = categoryService.findByName(category_string);
		topic.setCategory(category);
		topicService.save(topic);


		entry.setTopic(topic);
		entry.setPublishedDate(new LocalDateTime());
		entryService.save(entry, name);

		return "redirect:/topic/" + topic.getId() + ".html";
	}

}
