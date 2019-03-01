package com.capi.dao;

import java.util.HashMap;

import com.capi.beans.Trainer;

public interface FeedBackDao {

	public void addFeedback(Trainer trainer) ;

	public HashMap<Integer, Trainer> getTrainerList(int rating);

}
