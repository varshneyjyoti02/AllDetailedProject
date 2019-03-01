package com.capi.test;


import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.capi.beans.Trainer;

import com.capi.exception.TrainerNotFoundException;
import com.capi.service.FeedBackService;
import com.capi.service.FeedBackServiceImpl;

public class MainTest {
	FeedBackService fs = new FeedBackServiceImpl();

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = com.capi.exception.TrainerNotFoundException.class)
	public void test() throws TrainerNotFoundException {

		fs.getTrainerList(new Trainer().getRating());
	}

	@Test
	public void test2() throws TrainerNotFoundException {
		Trainer t = new Trainer("Jyoti", "java", LocalDate.of(2016, 10, 11), LocalDate.of(2016, 10, 11), 4);
		fs.addFeedback(t);
		fs.getTrainerList(t.getRating());
	}

	
}
