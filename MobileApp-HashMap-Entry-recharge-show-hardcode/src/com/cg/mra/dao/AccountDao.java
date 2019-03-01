package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidPhoneNoException;

public interface AccountDao {
	Account getAccountDetails(String mobileNo) throws InvalidPhoneNoException;
	int rechargeAccount(String mobileNo,int rechargeAccount) throws InvalidPhoneNoException;

}
