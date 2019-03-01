package com.capi.ui;

import java.util.Scanner;

import com.capi.beans.Account;
import com.capi.dao.AccountDao;
import com.capi.dao.AccountDaoInt;
import com.capi.exception.AccountNoNotExist;
import com.capi.exception.DuplicateId;
import com.capi.exception.InsufficientBalanceExceptions;
import com.capi.exception.InsufficientOpeningBalanceExceptions;
import com.capi.service.AccountService;
import com.capi.service.AccountServiceImpl;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountDaoInt ad=new AccountDao();
		AccountService as=new AccountServiceImpl(ad);
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter Choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Account No");
				int accNo=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Amount");
				int amount=sc.nextInt();
				sc.nextLine();
				
				try {
					Account acc = as.createAccount(accNo, amount);
				
				//Account acc= new Account(accNo,amount);
				System.out.println("Account no: "+acc.getAccountNo());
				System.out.println("Amount :"+acc.getAmmount());
				}
				catch (InsufficientOpeningBalanceExceptions e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				} catch (AccountNoNotExist e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				} catch (DuplicateId e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("Enter Account No");
				int accNo1=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Amount");
				int amount1=sc.nextInt();
				sc.nextLine();
				
				try {
					System.out.println("Now amount is :"+as.depositAccount(accNo1, amount1));
				} catch (AccountNoNotExist e) {
					// TODO Auto-generated catch block
					System.out.println(e);}
					catch (DuplicateId e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				catch (InsufficientBalanceExceptions e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				} 
				
				
				
				break;
			case 3:
				System.out.println("Enter Account No");
				int accNo2=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Amount");
				int amount2=sc.nextInt();
				sc.nextLine();
				
				try {
					System.out.println("Now amount is :"+as.withdrawAmount(accNo2, amount2));
				} catch (AccountNoNotExist e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				} catch (InsufficientBalanceExceptions e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				} catch (DuplicateId e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
			case 4:
				System.exit(0);
				break;
			 default:
				 System.out.println("Wrong choice");
				
			
		}}
		}
		
	}


