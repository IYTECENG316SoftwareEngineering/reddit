package com.test.codict.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

import com.codict.entity.PrivateMessage;
import com.codict.entity.PrivateMessageConversation;
import com.codict.entity.User;
import com.codict.service.MessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/applicationContext.xml" })
@Transactional
public class MessageServiceTest {

	@Autowired
	MessageService messageService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreatePrivateMessageConversation() {

		User sender = new User();
		sender.setName("admin");

		User reciver = new User();
		reciver.setName("user");

		PrivateMessageConversation pmc = new PrivateMessageConversation();
		pmc.setSenderUser(sender);
		pmc.setReceiverUser(reciver);

		pmc = messageService.save(pmc);

		assertEquals(messageService.findOne(pmc.getId()).getReceiverUser()
				.getName(), "user");
		assertEquals(messageService.findOne(pmc.getId()).getSenderUser()
				.getName(), "admin");

	}

	@Test
	public void testCreateMessage() {

		User sender = new User();
		sender.setName("admin");

		PrivateMessage pm = new PrivateMessage();
		pm.setMessage("Merhaba");
		pm.setUser(sender);

		pm = messageService.save(pm);

		assertEquals(pm.getUser().getName(), "admin");
		assertEquals(pm.getMessage(), "merhaba");

	}

	@Test
	public void testSendMessage() {

		User sender = new User();
		sender.setName("admin");

		User reciver = new User();
		reciver.setName("user");

		PrivateMessage pm = new PrivateMessage();
		pm.setMessage("Merhaba");
		pm.setUser(sender);
		List<PrivateMessage> pms = new ArrayList<PrivateMessage>();
		pms.add(pm);

		PrivateMessageConversation pmc = new PrivateMessageConversation();
		pmc.setSenderUser(sender);
		pmc.setReceiverUser(reciver);
		pmc.setMessages(pms);

		pmc = messageService.save(pmc);

		assertEquals(messageService.findOne(pmc.getId()).getMessages().size(),
				1);
		assertEquals(messageService.findOne(pmc.getId()).getMessages().get(0)
				.getMessage(), "merhaba");

	}


}
