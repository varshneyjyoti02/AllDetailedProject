package com.capi.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.capi.beans.Account;

public class AccountDao implements AccountDaoInt {

	HashMap<Integer,Account> hm=new HashMap<>();
	
	@Override
	public boolean save(Account account) {
		// TODO Auto-generated method stub
		hm.put(account.getAccountNo(), account);
		return true;
		
	}

	@Override
	public Account searchAccount(int accountNumber) {
		// TODO Auto-generated method stub
		
		//HashMap<Integer,Account> hm1=new HashMap<>();
//		Iterator it=hm.keySet().iterator();
//		while(it.hasNext())
//		{
//			Account a=(Account) it.next();
//			if(a.getAccountNo()==accountNumber)
//			{
//				return a;
//			}
//		}
		
		for(Entry<Integer, Account> entry : hm.entrySet())
		{
			
			Account a=entry.getValue();
			if(entry.getKey()==accountNumber)
			{
				
				return a;
			}
		}
		
		return null;
	}
	

}
