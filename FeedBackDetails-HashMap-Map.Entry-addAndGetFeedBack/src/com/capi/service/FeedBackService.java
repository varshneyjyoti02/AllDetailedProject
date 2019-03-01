package com.capi.service;

import java.util.HashMap;

import com.capi.beans.Trainer;

import com.capi.exception.TrainerNotFoundException;

public interface FeedBackService {

	public void addFeedback(Trainer trainer) ;

	public HashMap<Integer, Trainer> getTrainerList(int rating) throws TrainerNotFoundException;

}
