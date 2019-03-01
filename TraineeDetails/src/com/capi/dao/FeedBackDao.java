package com.capi.dao;

import java.util.HashMap;

import com.capi.beans.Trainer;
import com.capi.exception.NameIsNumeric;

public interface FeedBackDao {

	public void addFeedback(Trainer trainer) throws NameIsNumeric;
	public HashMap<Integer,Trainer> getTrainerList(int rating);
}
