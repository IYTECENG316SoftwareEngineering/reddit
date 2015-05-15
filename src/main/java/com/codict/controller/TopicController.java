package com.codict.controller;

import java.security.Principal;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import net.sf.ehcache.CacheManager;

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

import com.codict.entity.Category;
import com.codict.entity.Entry;
import com.codict.entity.Topic;
import com.codict.helper.Settings;
import com.codict.service.CategoryService;
import com.codict.service.EntryService;
import com.codict.service.TopicService;

@Controller
public class TopicController {

	@Autowired
	private TopicService topicService;

	@Autowired
	private EntryService entryService;

	@Autowired
	private CategoryService categoryService;

	private int pageCapacity = Settings.PAGE_CAPACITY;

	@ModelAttribute("entry")
	public Entry constructEntry() {
		return new Entry();
	}

	@RequestMapping("/topic/{id}/{page}")
	public String topicIndex(@PathVariable("id") int id,
			@PathVariable("page") int page, Model model) {

		Topic oneTopic = topicService.findOneWithEntries(id, page - 1,
				"publishedDate");
		model.addAttribute("topic", oneTopic);
		model.addAttribute("totalPageCount",
				calculatePageCount(id, pageCapacity));

		return "topic";
	}

	@RequestMapping(value = "/topic/{id}")
	public String topicIndex(@PathVariable("id") int id, Model model,
			@RequestParam(value = "p", required = false) Integer p,
			@RequestParam(value = "sort", required = false) String sort) {
		Topic oneTopic;
		if (sort == null && p == null) {
			oneTopic = topicService.findOneWithEntries(id, 0, "publishedDate");
			model.addAttribute("page", 1);
		} else if (p == null) {
			oneTopic = topicService.findOneWithEntries(id, 0, sort);
			model.addAttribute("page", 1);
		} else if (sort == null) {
			oneTopic = topicService.findOneWithEntries(id, p - 1,
					"publishedDate");
			model.addAttribute("page", p);
		} else {
			oneTopic = topicService.findOneWithEntries(id, p - 1, sort);
			model.addAttribute("page", p);
		}

		model.addAttribute("topic", oneTopic);
		model.addAttribute("totalPageCount",
				calculatePageCount(id, pageCapacity));
		System.out.println("Page number is" + p);
		return "topic";
	}

	// WILL BE THOUGHT DIFFERENT WAY //
	@RequestMapping(value = { "/topic/{id}", "/topic/{id}/{page}" }, method = RequestMethod.POST, params = "addEntry")
	public String doAddEntry(Model model, @PathVariable("id") int id,
			@Valid @ModelAttribute("entry") Entry entry, BindingResult result,
			Principal principal) {
		if (result.hasErrors()) {
			// return topicIndex(id, model,1,);
		}
		Entry newEntry = new Entry();
		newEntry.setDescription(entry.getDescription());
		String name = principal.getName();
		Topic foundTopic = topicService.findOne(id);
		foundTopic.increaseOneDailyEntryCount();
		topicService.save(foundTopic);
		entryService.save(newEntry, name, foundTopic);

		int count = calculatePageCount(id, pageCapacity);
		return "redirect:/topic/{id}/" + count + ".html";
	}

	@RequestMapping("/topic/available")
	@ResponseBody
	public String available(@RequestParam String title) {
		Boolean available = topicService.findOne(title) == null;
		return available.toString();
	}

	@RequestMapping(value = { "/topic/{id}", "/topic/{id}/{page}" }, method = RequestMethod.POST, params = "edit")
	public String editEntryRequest(@ModelAttribute("entry") Entry entry) {

		Entry old_entry = entryService.findOne(entry.getId());
		old_entry.setDescription(entry.getDescription());
		entryService.save(old_entry);

		return "redirect:/entry/{id}.html";
	}

	@RequestMapping(value = "/topic/populars", method = RequestMethod.GET)
	public @ResponseBody String getPopularTopics() {
		List<Topic> topics = topicService.findAll();
		// To-do: Think Lazy-Initialize
		JSONArray topics_array = new JSONArray();

		for (Topic topic : topics) {
			JSONObject obj = new JSONObject();
			obj.put("id", topic.getId());
			obj.put("title", topic.getTitle());
			obj.put("dailyEntryCount", topic.getDailyEntryCount());
			topics_array.add(obj);
		}

		return topics_array.toJSONString();
	}

	public int calculatePageCount(int id, int pageSize) {
		long pagecount = topicService.getTopicTotalPageCount(id);

		return (int) ((pagecount % pageSize == 0) ? pagecount / pageSize
				: (pagecount / pageSize) + 1);
	}

	@RequestMapping("/topic/{id}/edit")
	public String changeTitle(@PathVariable int id,
			@RequestParam String newTitle) {
		Topic topic = topicService.findOne(id);
		topic.setTitle(newTitle);
		topicService.save(topic);
		return "redirect:/topic/{id}.html";
	}

	@RequestMapping(value = "/category/list", method = RequestMethod.GET)
	public @ResponseBody String getCategoryLists() {
		List<Category> categories = categoryService.findAll();
		// To-do: Think Lazy-Initialize
		JSONArray category_array = new JSONArray();

		for (Category category : categories) {
			JSONObject obj = new JSONObject();
			obj.put("name", category.getName());
			category_array.add(obj);
		}
		return category_array.toJSONString();
	}

}
