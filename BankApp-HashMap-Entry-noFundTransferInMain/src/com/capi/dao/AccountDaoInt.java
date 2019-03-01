package com.capi.dao;

import com.capi.beans.Account;
import com.capi.exception.DuplicateId;

public interface AccountDaoInt {
	
	
	boolean save(Account account);
	Account searchAccount(int accountNumber) throws DuplicateId;

}
