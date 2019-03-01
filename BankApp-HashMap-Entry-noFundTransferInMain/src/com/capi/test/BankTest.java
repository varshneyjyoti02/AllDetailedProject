package com.capi.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capi.beans.Account;
import com.capi.dao.AccountDao;
import com.capi.dao.AccountDaoInt;
import com.capi.exception.AccountNoNotExist;
import com.capi.exception.DuplicateId;
import com.capi.exception.InsufficientBalanceExceptions;
import com.capi.exception.InsufficientOpeningBalanceExceptions;
import com.capi.service.AccountService;
import com.capi.service.AccountServiceImpl;

public class BankTest {

	
	AccountDaoInt ad=new AccountDao();
	AccountService as=new AccountServiceImpl(ad);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.capi.exception.DuplicateId.class)
	public void test() throws DuplicateId, InsufficientOpeningBalanceExceptions, AccountNoNotExist
	{
		as.createAccount(1001, 600);
		as.createAccount(1001, 500);
	}
	
	@Test(expected=com.capi.exception.AccountNoNotExist.class)
	public void test1() throws DuplicateId, InsufficientOpeningBalanceExceptions, AccountNoNotExist, InsufficientBalanceExceptions
	{
		as.depositAccount(1001, 700);
	}
	
	@Test(expected=com.capi.exception.InsufficientBalanceExceptions.class)
	public void test2() throws DuplicateId, InsufficientOpeningBalanceExceptions, AccountNoNotExist, InsufficientBalanceExceptions
	{
		as.createAccount(1001, 600);
		as.withdrawAmount(1001, 900);
	}

	
	@Test(expected=com.capi.exception.InsufficientOpeningBalanceExceptions.class)
	public void test3() throws DuplicateId, InsufficientOpeningBalanceExceptions, AccountNoNotExist
	{
		as.createAccount(1001, 300);
	}
	
	@Test
	public void test4() throws DuplicateId, InsufficientOpeningBalanceExceptions, AccountNoNotExist
	{
		as.createAccount(1001, 700);
	}
	
	
	
}
