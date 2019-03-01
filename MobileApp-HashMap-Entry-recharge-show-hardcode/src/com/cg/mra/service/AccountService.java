package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exceptions.InvalidPhoneNoException;

public interface AccountService {
	Account getAccountDetails(String mobileNo) throws InvalidPhoneNoException;
	int rechargeAccount(String mobileNo,int rechargeAccount) throws InvalidPhoneNoException;

	

}
