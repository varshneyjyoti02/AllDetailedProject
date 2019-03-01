package com.capi.ui;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.capi.beans.Trainer;

import com.capi.exception.TrainerNotFoundException;
import com.capi.service.FeedBackService;
import com.capi.service.FeedBackServiceImpl;

public class FeedBackMain {

	public static void main(String[] args) {
		FeedBackService fs = new FeedBackServiceImpl();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1. Enter Details\n2. Display Details");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter Name");
				String name = sc.nextLine();

				while (Pattern.compile("[0-9]").matcher(name).find()) {
					System.out.println("Invalid Name");
					System.out.println("Enter Name");
					name = sc.nextLine();
					
				}

				// sc.nextLine();
				System.out.println("Enter course Name");
				String courseName = sc.nextLine();
				// sc.nextLine();
				
				while (Pattern.compile("[0-9]").matcher(courseName).find()) {
					System.out.println("Invalid Name");
					System.out.println("Enter course Name");
					courseName = sc.nextLine();
					
				}

				System.out.println("Enter start date in (yyyy-mm-dd) format");
				String sDate = sc.nextLine();
				while(!validateDate(sDate))
				{
					System.out.println("Please Enter a valid Date");
					sDate = sc.nextLine();
				}
				
				
				System.out.println("Enter end date in (yyyy-mm-dd) format");
				String eDate = sc.nextLine();
				while(!validateDate(eDate))
				{
					System.out.println("Please Enter a valid Date");
					eDate = sc.nextLine();
				}
				
				LocalDate startDate = LocalDate.parse(sDate);
				LocalDate endDate = LocalDate.parse(eDate);
				System.out.println("Enter rating from 0 to 10");
				int rating = sc.nextInt();
				sc.nextLine();
				
				while(rating<0||rating>10)
				{
					System.out.println("Invalid rating");
					System.out.println("Enter rating from 0 to 10");
					rating = sc.nextInt();
					
				}
				

				Trainer t = new Trainer();

				t.setName(name);
				t.setCourseName(courseName);
				t.setStartDate(startDate);
				t.setEndDate(endDate);
				t.setRating(rating);

				
					fs.addFeedback(t);
					System.out.println("FeedBack added successfully");
				

				try {
					System.out.println(fs.getTrainerList(rating));
				} catch (TrainerNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 2:
				System.out.println("Enter rating");
				int rating1 = sc.nextInt();
				sc.nextLine();

				HashMap<Integer, Trainer> hm;

				try {
					System.out.println("---------------------------Details-----------------------\n");
					hm = fs.getTrainerList(rating1);
					int i=1;
					for(Map.Entry<Integer, Trainer> entry : hm.entrySet()) {
						
						System.out.println("Trainer "+i +":" );
						System.out.print("Sales ID: ");
						System.out.println(entry.getKey());
						System.out.println("Name:" + entry.getValue().getName());
						System.out.println("Course Name:" + entry.getValue().getCourseName());
						System.out.println("start date:" + entry.getValue().getStartDate());
						System.out.println("end date:" + entry.getValue().getEndDate());
						System.out.println("rating:" + entry.getValue().getRating());
						System.out.println("\n");
						i++;
					}
				} catch (TrainerNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:
				System.exit(0);
				break;
				default:
					System.out.println("Enter valid choice");
			}
		}

	}
	
	
	public static boolean validateDate(String date)
	{
		try 
		{
			LocalDate.parse(date);
			return true;
		}catch(Exception e)
		{
			return false;
		}
		
	}

}
