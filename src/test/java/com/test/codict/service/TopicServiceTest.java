package com.test.codict.service;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codict.entity.Category;
import com.codict.entity.Topic;
import com.codict.service.TopicService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"})
@Transactional
public class TopicServiceTest {
	
	@Autowired
	TopicService topicService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindOneString() {
		Topic topic = topicService.findOne("java");
		assertEquals(topic.getTitle(), "java");
		assertEquals(topic.getCategory().getName(), "Programming");

	}

	@Test
	public void testFindOneWithEntries() {
		Topic topic = topicService.findOneWithEntries(1);
		assertEquals(topic.getEntries().size(), 3);
	}

	@Test
	public void testSave() {
		Category category = new Category();
		category.setName("Programming");
		
		Topic topic= new Topic();
		topic.setTitle("C Sharp");
		topic.setCategory(category);
		
		Topic r_topic = topicService.save(topic);
		assertEquals(r_topic.getTitle(), "c sharp");

	}

}
