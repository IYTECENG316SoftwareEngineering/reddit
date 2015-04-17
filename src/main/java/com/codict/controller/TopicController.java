package com.codict.controller;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.service.EntryService;
import com.codict.service.TopicService;

@Controller
public class TopicController {

	@Autowired
	private TopicService topicService;

	@Autowired
	private EntryService entryService;

	@ModelAttribute("entry")
	public Entry constructEntry() {
		return new Entry();
	}

	@RequestMapping("/topic/{id}")
	public String topicIndex(@PathVariable("id") int id, Model model) {
		model.addAttribute("topic", topicService.findOneWithEntries(id));
		return "topic";
	}

	// WILL BE THOUGHT DIFFERENT WAY //
	@RequestMapping(value = "/topic/{id}", method = RequestMethod.POST, params = "addEntry")
	public String doAddEntry(Model model, @PathVariable("id") int id,
			@Valid @ModelAttribute("entry") Entry entry, BindingResult result,
			Principal principal) {
		if (result.hasErrors()) {
			return topicIndex(id, model);
		}
		Entry newEntry = new Entry();
		newEntry.setDescription(entry.getDescription());
		String name = principal.getName();
		entryService.save(newEntry, name, topicService.findOne(id));
		return "redirect:/topic/{id}.html";
	}
	
	@RequestMapping("/topic/available")
	@ResponseBody
	public String available(@RequestParam String title) {
		Boolean available = topicService.findOne(title) == null;
		return available.toString();
	}

	@RequestMapping(value = "/topic/{id}", method = RequestMethod.POST, params = "edit")
	public String editEntryRequest(@ModelAttribute("entry") Entry entry) {

		Entry old_entry = entryService.findOne(entry.getId());
		old_entry.setDescription(entry.getDescription());
		entryService.save(old_entry);

		return "redirect:/topic/{id}.html";
	}

	@RequestMapping(value = "/topic/populars", method = RequestMethod.GET)
	public @ResponseBody String getPopularTopic() {
		List<Topic> topics = topicService.findAll();
		// To-do: Think Lazy-Initialize
		JSONArray topics_array = new JSONArray();

		for (Topic topic : topics) {
			JSONObject obj = new JSONObject();
			obj.put("id", topic.getId());
			obj.put("title", topic.getTitle());
			topics_array.add(obj);
		}

		return topics_array.toJSONString();
	}

}
