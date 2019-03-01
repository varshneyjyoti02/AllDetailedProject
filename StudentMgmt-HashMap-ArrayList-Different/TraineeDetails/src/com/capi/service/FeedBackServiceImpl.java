package com.capi.service;

import java.util.HashMap;

import com.capi.beans.Trainer;
import com.capi.dao.FeedBackDao;
import com.capi.dao.FeedBackDaoImpl;
import com.capi.exception.NameIsNumeric;

public class FeedBackServiceImpl implements FeedBackService {

	FeedBackDao fd=new FeedBackDaoImpl();
	
	@Override
	public void addFeedback(Trainer trainer) throws NameIsNumeric {
		// TODO Auto-generated method stub
		fd.addFeedback(trainer);
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rating) {
		// TODO Auto-generated method stub
		return fd.getTrainerList(rating);
	}

}
