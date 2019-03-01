package com.capi.ui;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.capi.beans.Trainer;
import com.capi.dao.FeedBackDao;
import com.capi.dao.FeedBackDaoImpl;
import com.capi.exception.NameIsNumeric;
import com.capi.exception.NoSuchTypeRating;
import com.capi.service.FeedBackService;
import com.capi.service.FeedBackServiceImpl;
import com.capi.util.DBUtil;

public class FeedBackMain {

	public static void main(String[] args) throws NameIsNumeric {
		// TODO Auto-generated method stub
		FeedBackDao fd=new FeedBackDaoImpl();
		
		FeedBackService fs=new FeedBackServiceImpl();
		
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true)

		{
			System.out.println("Enter choice");
			System.out.println("1.Enter Details");
			System.out.println("2.Display Details");
			int ch=sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter nmae");
				String name=sc.nextLine();
				if(Pattern.compile("[0-9]").matcher(name).find())
				{
					try {
						throw new NameIsNumeric();
					} catch (NameIsNumeric e) {
						// TODO Auto-generated catch block
						System.out.println(e);
						break;
					}
				}
				System.out.println("Enter course");
				String courseName=sc.nextLine();
				System.out.println("Enter start date");
				String sDate=sc.nextLine();
				System.out.println("Enter end date");
				String eDate=sc.nextLine();
				LocalDate startDate=LocalDate.parse(sDate);
			LocalDate endDate=LocalDate.parse(eDate);
			System.out.println("Enter rating");
				int rating =sc.nextInt();	
				sc.nextLine();
				
				Trainer t=new Trainer();
				
				t.setName(name);
				t.setCourseName(courseName);
				t.setStartDate(startDate);
				t.setEndDate(endDate);
				t.setRating(rating);
				System.out.println("Hi");
				fs.addFeedback(t);
				System.out.println(fs.getTrainerList(rating));
				
				break;
			case 2:
				int rating1 =sc.nextInt();				
				System.out.println(fs.getTrainerList(rating1));
				
				
				
				break;
			}
		}
		
	}

}
