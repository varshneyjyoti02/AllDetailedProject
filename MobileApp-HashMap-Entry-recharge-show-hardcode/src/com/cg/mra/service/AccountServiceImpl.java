package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exceptions.InvalidPhoneNoException;

public class AccountServiceImpl implements AccountService {
  AccountDao ad=new AccountDaoImpl();
	@Override
	public Account getAccountDetails(String mobileNo) throws InvalidPhoneNoException {
		// TODO Auto-generated method stub
	
		return ad.getAccountDetails(mobileNo);
	}

	@Override
	public int rechargeAccount(String mobileNo, int rechargeAccount)  
	{try 
		{
			// TODO Auto-generated method stub
			return ad.rechargeAccount(mobileNo, rechargeAccount);
		}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return 0;
}
}