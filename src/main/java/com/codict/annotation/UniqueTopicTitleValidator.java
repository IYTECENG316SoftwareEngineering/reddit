package com.codict.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.codict.repository.TopicRepository;

public class UniqueTopicTitleValidator implements ConstraintValidator<UniqueTopicTitle, String> {

	@Autowired
	private TopicRepository topicRepository;
	
	@Override
	public void initialize(UniqueTopicTitle constraintAnnotation) {	
	}

	@Override
	public boolean isValid(String title, ConstraintValidatorContext context) {
		if(topicRepository == null)
			return true;
		return topicRepository.findByTitle(title) == null;
	}

}
