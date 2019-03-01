package com.cg.mra.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exceptions.InvalidPhoneNoException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MobileTest {
	AccountService ac=new AccountServiceImpl();
	AccountDao ad=new AccountDaoImpl();

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.cg.mra.exceptions.InvalidPhoneNoException.class)
	public void test() throws InvalidPhoneNoException
	{
		ac.getAccountDetails("57697978");
		ac.rechargeAccount("57697978", 100);
	}
	
	@Test
	public void test2()
	{
		try {
			ac.getAccountDetails("7216779999");
			ac.rechargeAccount("7216779999", 100);
		} catch (InvalidPhoneNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
