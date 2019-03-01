package com.capi.util;

import java.time.LocalDate;
import java.util.HashMap;

import com.capi.beans.Trainer;

public class DBUtil {

	static HashMap<Integer, Trainer> feedbackList = new HashMap<>();

	static {
		feedbackList.put(411, new Trainer("jyoti", "java", LocalDate.of(2016, 10, 11), LocalDate.of(2016, 10, 11), 4));
		feedbackList.put(222, new Trainer("Smitha", "Java", LocalDate.of(2016, 10, 11), LocalDate.of(2016, 10, 11), 4));
		feedbackList.put(433, new Trainer("Smitha", "Java", LocalDate.of(2016, 10, 11), LocalDate.of(2016, 10, 11), 3));

	}

	public static double getId() {
		return (Math.random()) * 1000;

	}

	public static HashMap<Integer, Trainer> getFeedbackList() {
		return feedbackList;
	}

}
