package com.capi.dao;

import java.util.HashMap;
import java.util.Map;


import com.capi.beans.Trainer;

import com.capi.util.DBUtil;

public class FeedBackDaoImpl implements FeedBackDao {

	HashMap<Integer, Trainer> hm = DBUtil.getFeedbackList();

	@Override
	public void addFeedback(Trainer trainer)  {
		// TODO Auto-generated method stub
		// if(Pattern.compile("[0-9]").matcher(trainer.getName()).find())
		// {
		// throw new NameIsNumeric();
		// }
		int key = (int) DBUtil.getId();
		
		if (!hm.containsKey(key)) {
			hm.put(key, trainer);
		}

	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rating) {
		// TODO Auto-generated method stub
		HashMap<Integer, Trainer> hm1 = new HashMap<>();

		for (Map.Entry<Integer, Trainer> entry : hm.entrySet()) {
			if (entry.getValue().getRating() == rating) {
				hm1.put(entry.getKey(), entry.getValue());
			}

		}

		return hm1;
	}

}
