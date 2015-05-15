package com.codict.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.codict.entity.Category;
import com.codict.entity.Entry;
import com.codict.entity.PrivateMessage;
import com.codict.entity.PrivateMessageConversation;
import com.codict.entity.Role;
import com.codict.entity.Topic;
import com.codict.entity.User;
import com.codict.repository.CategoryRepository;
import com.codict.repository.EntryRepository;
import com.codict.repository.PrivateMessageConversationRepository;
import com.codict.repository.PrivateMessageRepository;
import com.codict.repository.RoleRepository;
import com.codict.repository.TopicRepository;
import com.codict.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	// RoleRepository is an interface, here is not instance of interface, here
	// is
	// instance of the some classes that will be generated and implement
	// repository interface.

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EntryRepository entryRepository;

	@Autowired
	private TopicRepository topicRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private PrivateMessageRepository privateMessageRepository;

	@Autowired
	private PrivateMessageConversationRepository privateMessageConversationRepository;

	// it is created after the spring context creation that is created during
	// application startup.
	// any method that is postconstruct calls automaticly.

	@PostConstruct
	public void init() {
		if (roleRepository.findByName("ROLE_ADMIN") == null) {
			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);

			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);

			User userAdmin = new User();
			userAdmin.setEnabled(true);
			userAdmin.setName("admin");
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			userAdmin.setPassword(encoder.encode("admin"));
			userAdmin.setEmail("admin@gmail.com");
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleUser);
			roles.add(roleAdmin);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);

			User user = new User();
			user.setEnabled(true);
			user.setName("user");
			BCryptPasswordEncoder encoder2 = new BCryptPasswordEncoder();
			user.setPassword(encoder2.encode("user"));
			user.setEmail("user@gmail.com");
			List<Role> userroles = new ArrayList<Role>();
			userroles.add(roleUser);
			user.setRoles(userroles);
			userRepository.save(user);

			Category category = new Category();
			category.setName("Programming");
			categoryRepository.save(category);

			Category category2 = new Category();
			category2.setName("Politics");
			categoryRepository.save(category2);

			Category category3 = new Category();
			category3.setName("Health");
			categoryRepository.save(category3);

			Category category4 = new Category();
			category4.setName("Religion");
			categoryRepository.save(category4);

			Category category5 = new Category();
			category5.setName("Human");
			categoryRepository.save(category5);

			Category category6 = new Category();
			category6.setName("Science");
			categoryRepository.save(category6);
			
			Category category7 = new Category();
			category7.setName("Game");
			categoryRepository.save(category7);

			Topic topic = new Topic();
			topic.setTitle("Java Economic");
			topic.setCategory(category);
			topicRepository.save(topic);

			Entry entry1 = new Entry();
			entry1.setTopic(topic);
			entry1.setUser(userAdmin);
			entry1.setPublishedDate(new LocalDateTime());
			entry1.setUpVoteCount(3);
			entry1.setDescription("A good robust scalable object oriented programming language.");
			entryRepository.save(entry1);

			Entry entry2 = new Entry();
			entry2.setTopic(topic);
			entry2.setUser(userAdmin);
			entry2.setPublishedDate(new LocalDateTime());
			entry1.setUpVoteCount(2);
			entry2.setDescription("It's a programming language primarily utilized for making enterprise level applications.");
			entryRepository.save(entry2);

			Entry entry3 = new Entry();
			entry3.setTopic(topic);
			entry3.setUser(user);
			entry3.setPublishedDate(new LocalDateTime());
			entry3.setDescription("Spelled like that, coffee.");
			entry3.setUpVoteCount(5);
			entryRepository.save(entry3);

			Topic topic2 = new Topic();
			topic2.setTitle("Economic crisis");
			topic2.setCategory(category2);
			topicRepository.save(topic2);

			Entry entry4 = new Entry();
			entry4.setTopic(topic2);
			entry4.setUser(user);
			entry4.setPublishedDate(new LocalDateTime());
			entry4.setDescription("People are hurt unnecessarily because they remember only good times and are not prepared for bad times. ");
			entryRepository.save(entry4);

			Entry entry5 = new Entry();
			entry5.setTopic(topic2);
			entry5.setUser(user);
			entry5.setPublishedDate(new LocalDateTime());
			entry5.setDescription("When there are 2 consecutive quarters (6 months) of Negative GDP growth it is called recession.");
			entryRepository.save(entry5);

			PrivateMessageConversation pmc = new PrivateMessageConversation();
			pmc.setReceiverUser(user);
			pmc.setSenderUser(userAdmin);
			pmc.setSubject("Admin bana ulaþ");
			privateMessageConversationRepository.save(pmc);

			PrivateMessage msg1 = new PrivateMessage();
			msg1.setMessage("My first message");
			msg1.setUser(user);
			msg1.setPrivateMessageConversation(pmc);
			privateMessageRepository.save(msg1);

			PrivateMessage msg2 = new PrivateMessage();
			msg2.setMessage("My second message");
			msg2.setUser(userAdmin);
			msg2.setPrivateMessageConversation(pmc);
			privateMessageRepository.save(msg2);

			PrivateMessageConversation pmc2 = new PrivateMessageConversation();
			pmc2.setReceiverUser(userAdmin);
			pmc2.setSenderUser(user);
			pmc2.setSubject("Admin sana nasýl ulaþabilirim");
			privateMessageConversationRepository.save(pmc2);

			PrivateMessage msg3 = new PrivateMessage();
			msg3.setMessage("My third message");
			msg3.setUser(userAdmin);
			msg3.setPrivateMessageConversation(pmc2);

			privateMessageRepository.save(msg3);

			PrivateMessage msg4 = new PrivateMessage();
			msg4.setMessage("My fourth message");
			msg4.setUser(user);
			msg4.setPrivateMessageConversation(pmc2);

			privateMessageRepository.save(msg4);

			List<PrivateMessageConversation> asd = privateMessageConversationRepository
					.findBySenderUserOrReceiverUser(userAdmin, userAdmin);
			System.out.println(asd.size()
					+ asd.get(0).getSenderUser().getName()
					+ asd.get(0).getReceiverUser().getName());

			PrivateMessageConversation privateMessageConversation = privateMessageConversationRepository
					.findOne(1);
			List<PrivateMessage> messagesss = privateMessageRepository
					.findByPrivateMessageConversation(privateMessageConversation);
			privateMessageConversation.setMessages(messagesss);
			System.out.println("Message size is:" + messagesss.size());

			PrivateMessage ads = privateMessageRepository.findOne(3);
			System.out
					.println(ads.getPrivateMessageConversation().getSubject());

			List<Topic> topicsByCriteria = topicRepository
					.findByTitleContainingIgnoreCase("econ");
			System.out.println(topicsByCriteria.size());

			long size = topicRepository.countWithTopic(1);
			System.out.println(size);
			size = topicRepository.countWithTopic(2);
			System.out.println(size);

			List<Entry> niceList = entryRepository.findByTopic(topic,
					new PageRequest(0, 2, Direction.DESC, "upVoteCount"));

			for (Entry entry : niceList) {
				System.out.println(entry.getDescription());
			}

		}
	}
}
