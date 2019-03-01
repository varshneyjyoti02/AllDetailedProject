package com.capi.test;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.capi.beans.Trainer;
import com.capi.dao.FeedBackDao;
import com.capi.dao.FeedBackDaoImpl;
import com.capi.exception.NameIsNumeric;
import com.capi.service.FeedBackService;
import com.capi.service.FeedBackServiceImpl;

public class TrainerTest {

	FeedBackDao fd=new FeedBackDaoImpl();
	
	FeedBackService fs=new FeedBackServiceImpl();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.capi.exception.NameIsNumeric.class)
	public void test() throws NameIsNumeric {
		
		fs.addFeedback(new Trainer("Jyoti123",  "java", LocalDate.of(2016, 10, 11), LocalDate.of(2016, 10, 11), 4));
		
	}

}
