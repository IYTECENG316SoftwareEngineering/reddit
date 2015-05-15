package com.codict.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import com.codict.entity.PrivateMessage;
import com.codict.entity.PrivateMessageConversation;
import com.codict.entity.Topic;
import com.codict.entity.User;
import com.codict.helper.Settings;
import com.codict.service.CategoryService;
import com.codict.service.EntryService;
import com.codict.service.MessageService;
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

	@Autowired
	private MessageService messageService;

	private int pageCapacity = Settings.PAGE_CAPACITY;

	// private static final Logger logger = Logger.getLogger("Ender");

	@ModelAttribute("privateMessage")
	public PrivateMessage constructPrivateMessage() {
		return new PrivateMessage();
	}

	@ModelAttribute("privateMessageConversation")
	public PrivateMessageConversation constructPrivateMessageConversation() {
		return new PrivateMessageConversation();
	}

	@ModelAttribute("topic")
	public Topic contructTopic() {
		return new Topic();
	}

	@ModelAttribute("entry")
	public Entry contructEntry() {
		return new Entry();
	}

	@ModelAttribute("user")
	public User contructUser() {
		return new User();
	}

	@RequestMapping("/account")
	public String account(Model model, Principal principal) {
		String name = principal.getName();
		User user = userService.findOne(name);
		model.addAttribute("user", userService.findOneWithEntries(name));
		model.addAttribute("categoryList", Arrays.asList("Science",
				"Programming", "Human", "Politics", "Health", "Religion"));
		model.addAttribute("lastEntries",
				entryService.getLastEntriesByUser(user));
		model.addAttribute("mostVoted",
				entryService.getMostUpVotedEntriesByUser(user));
		model.addAttribute("favorites", entryService.getFavoritesByUser(user));

		return "account";
	}

	@RequestMapping("/profile/{id}")
	public String profile(Model model, @PathVariable("id") int id) {
		User user = userService.findOne(id);

		model.addAttribute("user", userService.findOneWithEntries(id));
		model.addAttribute("categoryList", Arrays.asList("Science",
				"Programming", "Human", "Politics", "Health", "Religion"));
		model.addAttribute("lastEntries",
				entryService.getLastEntriesByUser(user));
		model.addAttribute("mostVoted",
				entryService.getMostUpVotedEntriesByUser(user));
		model.addAttribute("favorites", entryService.getFavoritesByUser(user));

		return "profile";
	}

	@RequestMapping(value = "/account", method = RequestMethod.POST)
	public String doAddNewTopic(Model model,
			@Valid @ModelAttribute("topic") Topic topic,
			BindingResult resultTopic, Principal principal,
			@Valid @ModelAttribute("entry") Entry entry,
			BindingResult resultEntry,
			@RequestParam("topic_category") String category_string) {
		System.out.println(principal.getName() + " " + category_string + " "
				+ topic.getTitle() + " " + entry.getDescription());

		if (resultTopic.hasErrors()) {
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

	@RequestMapping(value = "/vote/up", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> doUpvoteEntry(
			@RequestParam String id_str, Principal principal) {
		return voteHelper(id_str, principal, "up");
	}

	@RequestMapping(value = "/vote/down", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> doDownvoteEntry(
			@RequestParam String id_str, Principal principal) {
		return voteHelper(id_str, principal, "down");
	}

	public ResponseEntity voteHelper(String id_str, Principal principal,
			String upOrDown) {
		int id = Integer.valueOf(id_str);
		Entry entry = entryService.findOne(id);
		String name = principal.getName();
		User user = userService.findOne(name);
		System.out.println(id);
		if (!user.getVotedEntries().contains(id)) {
			if (upOrDown.equals("up")) {
				entry.addUpVote();
			} else if (upOrDown.equals("down")) {
				entry.addDownVote();
			}
			entryService.save(entry);

			user.addVotedEntry(id);
			userService.update(user);
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/favorite", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> favorite(
			@RequestParam String id_str, Principal principal) {

		User user = userService.findOneWithFavorites(principal.getName());
		Entry entry = entryService.findOne(Integer.parseInt(id_str));
		Set<Integer> favoritedUserIDs = entryService.getFavoritedUsersID(user
				.getId());

		if (!favoritedUserIDs.contains(entry.getId())) {

			user.addFavorite(entry);
			user = userService.update(user);
			return new ResponseEntity<String>(HttpStatus.OK);

		}

		return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/profile/{id}", method = RequestMethod.POST)
	public String doCreateConversation(
			Model model,
			@Valid @ModelAttribute("privateMessage") PrivateMessage privateMessage,
			BindingResult resultTopic,
			Principal principal,
			@Valid @ModelAttribute("privateMessageConversation") PrivateMessageConversation privateMessageConversation,
			BindingResult resultEntry, @PathVariable("id") int id) {

		if (resultTopic.hasErrors()) {
			return profile(model, id);
		}
		if (resultEntry.hasErrors()) {
			return profile(model, id);
		}

		String name = principal.getName();

		User receiverUser = userService.findOne(id);
		User senderUser = userService.findOne(name);

		System.out.println("msg:" + privateMessage.getId());
		System.out.println("msgCon" + privateMessageConversation.getId());

		PrivateMessageConversation conversation = new PrivateMessageConversation();
		conversation.setSenderUser(senderUser);
		conversation.setReceiverUser(receiverUser);
		conversation.setSubject(privateMessageConversation.getSubject());
		messageService.save(conversation);

		PrivateMessage message = new PrivateMessage();
		message.setUser(senderUser);
		message.setPrivateMessageConversation(conversation);
		message.setMessage(privateMessage.getMessage());
		messageService.save(message);

		return "redirect:/profile/{id}.html";
	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String doSearch(Model model,
			@RequestParam("criteria") String criteria) {

		model.addAttribute("searchResults",
				topicService.findTopicByCriteria(criteria));

		// logger.info("Results are shown for" + criteria);

		return "search";
	}

	@RequestMapping(value = "/category/{category}", method = RequestMethod.GET)
	public String topicByCategory(Model model,
			@PathVariable("category") String category,
			@RequestParam(value = "p", required = false) Integer p) {
		Category categoryObj = categoryService.findByName(category);
		List<Topic> topicByCategory;

		if (p == null) {
			topicByCategory = topicService.findByCategory(categoryObj, 0);

		} else {
			topicByCategory = topicService.findByCategory(categoryObj, p - 1);
		}
		model.addAttribute("categoryResults", topicByCategory);
		model.addAttribute("totalPageCount",
				calculatePageCount(categoryObj.getId(), pageCapacity));

		return "category";
	}

	@RequestMapping(value = "/category/{category}/{page}", method = RequestMethod.GET)
	public String topicByCategoryPage(Model model,
			@PathVariable("category") String category,
			@PathVariable("page") int page) {

		Category categoryObj = categoryService.findByName(category);
		List<Topic> topicByCategory;

		topicByCategory = topicService.findByCategory(categoryObj, page - 1);

		model.addAttribute("totalPageCount",
				calculatePageCount(categoryObj.getId(), pageCapacity));

		model.addAttribute("categoryResults", topicByCategory);

		return "category";
	}

	@RequestMapping(value = "/profile/edit", method = RequestMethod.GET)
	public String topicByCategoryPage() {
		return "editProfile";
	}

	@RequestMapping(value = "/profile/edit", method = RequestMethod.POST)
	public String topicByCategoryPage(@ModelAttribute("user") User user,
			Principal principal) {
		User userPrincable = userService.findOne(principal.getName());
		userPrincable.setEmail(user.getEmail());
		return "editProfile";
	}

	public int calculatePageCount(int id, int pageSize) {

		long pagecount = topicService.getCategoryTotalPageCount(id);

		return (int) ((pagecount % pageSize == 0) ? pagecount / pageSize
				: (pagecount / pageSize) + 1);
	}

}
