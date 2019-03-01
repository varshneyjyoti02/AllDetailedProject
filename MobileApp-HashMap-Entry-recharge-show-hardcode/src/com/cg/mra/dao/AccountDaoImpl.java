package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidPhoneNoException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class AccountDaoImpl implements AccountDao{
	Map<String,Account> accountEntry;
		

	public AccountDaoImpl() {
		accountEntry=new HashMap<>();
		accountEntry.put("7216779999",new Account("Prepaid","Vaishali",200));
		accountEntry.put("8992578365",new Account("Prepaid","Raj",100));
		accountEntry.put("9996779999",new Account("Prepaid","Tani",200));
		accountEntry.put("4516779999",new Account("Prepaid","Prashant",200));
		accountEntry.put("6786779999",new Account("Prepaid","Neha",200));
	}

	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidPhoneNoException {
		for(Entry<String, Account> entry : accountEntry.entrySet())
		{
			Account a=entry.getValue();
			if(entry.getKey().equals(mobileNo))
			{
				
				return a;
			}
		}
		
			throw new InvalidPhoneNoException();
					
	}

	@Override
	public int rechargeAccount(String mobileNo, int rechargeAccount) throws InvalidPhoneNoException {
		// TODO Auto-generated method stub
		//AccountService aci=new AccountServiceImpl();
		//Account account=aci.getAccountDetails(mobileNo);

		for(Entry<String, Account> entry : accountEntry.entrySet())
		{
			if(entry.getKey().equals(mobileNo))
			{
				//account.setAccountBalance(account.getAccountBalance() +rechargeAccount );
				// return rechargeAccount;
				Account a=entry.getValue();
				double rech= a.getAccountBalance()+rechargeAccount;
				return (int) rech;
				
			}
			
		
					

			}
				
	
		throw new InvalidPhoneNoException();

	}
}
