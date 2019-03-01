package com.capi.service;

import com.capi.beans.Account;
import com.capi.dao.AccountDao;
import com.capi.dao.AccountDaoInt;
import com.capi.exception.AccountNoNotExist;
import com.capi.exception.DuplicateId;
import com.capi.exception.InsufficientBalanceExceptions;
import com.capi.exception.InsufficientOpeningBalanceExceptions;

public class AccountServiceImpl implements AccountService {

	AccountDaoInt ad=new AccountDao();
	
	
	
	public AccountServiceImpl(AccountDaoInt ad) {
		// TODO Auto-generated constructor stub
		this.ad=ad;
	}

	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientOpeningBalanceExceptions, AccountNoNotExist, DuplicateId {
		// TODO Auto-generated method stub
		
		
		
		if(ad.searchAccount(accountNumber)!=null)
		{
			throw new DuplicateId();
		}
		Account acc=new Account();
		acc.setAccountNo(accountNumber);
		
		
		
		if(amount<500)
		{
			throw new InsufficientOpeningBalanceExceptions();
		}
		acc.setAmmount(amount);
		if((ad.save(acc)) )
		{
			return acc;
		}
		
			
		throw new AccountNoNotExist();
		
	}

	@Override
	public int depositAccount(int accountNumber, int amount) throws AccountNoNotExist, InsufficientBalanceExceptions, DuplicateId {
		// TODO Auto-generated method stub
		Account acc=ad.searchAccount(accountNumber);
		if(acc==null)
		{
			throw new AccountNoNotExist();
		}
		if(acc.getAmmount()<amount)
		{
			throw new InsufficientBalanceExceptions();
		}
		acc.setAmmount(acc.getAmmount()+amount);
		ad.save(acc);
		
		return acc.getAmmount();
	}

	@Override
	public int withdrawAmount(int accountNumber, int amount) throws AccountNoNotExist, InsufficientBalanceExceptions, DuplicateId {
		// TODO Auto-generated method stub
		
		Account acc=ad.searchAccount(accountNumber);
		if(acc==null)
		{
			throw new AccountNoNotExist();
		}
		if(acc.getAmmount()<amount)
		{
			throw new InsufficientBalanceExceptions();
		}
		acc.setAmmount(acc.getAmmount()-amount);
		ad.save(acc);
		
		return acc.getAmmount();
	}

}
