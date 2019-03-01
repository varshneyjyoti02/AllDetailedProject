package com.capi.service;

import com.capi.beans.Account;
import com.capi.exception.AccountNoNotExist;
import com.capi.exception.DuplicateId;
import com.capi.exception.InsufficientBalanceExceptions;
import com.capi.exception.InsufficientOpeningBalanceExceptions;

public interface AccountService {
	
	Account createAccount(int accountNumber,int amount) throws  InsufficientOpeningBalanceExceptions, AccountNoNotExist, DuplicateId;
	int depositAccount(int accountNumber,int amount) throws AccountNoNotExist, InsufficientBalanceExceptions, DuplicateId ;
	int withdrawAmount(int accountNumber,int amount) throws AccountNoNotExist, InsufficientBalanceExceptions, DuplicateId ;


}
