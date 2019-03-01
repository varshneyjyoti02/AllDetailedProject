package com.capi.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import com.capi.beans.Trainer;
import com.capi.exception.NameIsNumeric;
import com.capi.util.DBUtil;

public class FeedBackDaoImpl implements FeedBackDao {
	
	HashMap<Integer,Trainer> hm=new HashMap<>();

	DBUtil db=new DBUtil();
	
	@Override
	public void addFeedback(Trainer trainer) throws NameIsNumeric {
		// TODO Auto-generated method stub
		
		
		if(Pattern.compile("[0-9]").matcher(trainer.getName()).find())
		{
			
				throw new NameIsNumeric();
			
			}
		hm.put((int)DBUtil.generateId(), trainer);

		
		
	}

	@Override
	public HashMap<Integer, Trainer> getTrainerList(int rating) {
		// TODO Auto-generated method stub
		HashMap<Integer,Trainer> hm1=new HashMap<Integer,Trainer>();
		for(Map.Entry<Integer, Trainer> entry : hm.entrySet())
		{
			
			if(entry.getValue().getRating()==rating)
			{
				hm1.put(entry.getKey(), entry.getValue());
			}
		}
		return hm1;
		
		
	}

	
}
