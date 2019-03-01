package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exceptions.InvalidPhoneNoException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	AccountDao ad=new AccountDaoImpl();
	AccountService aci=new AccountServiceImpl();
	public static void main(String[] args)// throws InvalidPhoneNoException
	{
		
		AccountDao ad=new AccountDaoImpl();
		AccountService aci=new AccountServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter mobile No");
			String mn=sc.next();
			Account a;
			try {
				a = aci.getAccountDetails(mn);
				System.out.println("Current Balance is"+a.getAccountBalance());
			} catch (InvalidPhoneNoException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1);
			}
			
			
			
			break;
			
		case 2:
			System.out.println("Enter mobile No");
			String mn1=sc.next();
			System.out.println("Enter amount");
			int rc=sc.nextInt();
			try {
				if(aci.getAccountDetails(mn1) == null)
				{
					
				}
				else
				{
				System.out.println("Account Recharged Successfully");
				System.out.println("Hello"+aci.getAccountDetails(mn1).getCustomerName()+"Available Balance is"+aci.rechargeAccount(mn1,rc));
				//System.out.println("Amount is"+aci.rechargeAccount(mn1,rc));
				}
			} catch (InvalidPhoneNoException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
					
			break;
		case 3:
			System.exit(0);
			break;
			
		}
		
				
		
	}

}
}