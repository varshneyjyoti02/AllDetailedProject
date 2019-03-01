package com.capi.beans;

public class Account {
	private int accountNo;
	private int ammount;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public Account(int accountNo, int ammount) {
		super();
		this.accountNo = accountNo;
		this.ammount = ammount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ammount=" + ammount + "]";
	}
	

}
