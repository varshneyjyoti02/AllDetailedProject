package com.capi.service;

import java.util.HashMap;

import com.capi.beans.Trainer;
import com.capi.dao.FeedBackDao;
import com.capi.dao.FeedBackDaoImpl;

import com.capi.exception.TrainerNotFoundException;

public class FeedBackServiceImpl implements FeedBackService {

	FeedBackDao fd = new FeedBackDaoImpl();

	@Override
	public void addFeedback(Trainer trainer)  {
		// TODO Auto-generated method stub
		fd.addFeedback(trainer);

	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rating) throws TrainerNotFoundException {

		HashMap<Integer, Trainer> h = fd.getTrainerList(rating);
		if (h.size() == 0) {
			throw new TrainerNotFoundException();
		}
		return h;
	}

}
