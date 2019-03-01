package com.cgi.mobilepurchase1.ui;
import com.cgi.mobilepurchase1.bean.Mobile;
import com.cgi.mobilepurchase1.bean.PurchaseDetails;
import com.cgi.mobilepurchase1.exception.MobilePurchaseException;
import com.cgi.mobilepurchase1.service.*;
import java.util.*;
public class MobilePurchaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mobileid;
		int choice;
		MobileServiceImpl mobileserviceimpl=new MobileServiceImpl();
		List<Mobile> mobile=new ArrayList<Mobile>();
		while(true) {
		      System.out.println("Enter your choice: ");
	          System.out.println("1- Insert customer and purchase details into database.");
	          System.out.println("2- View details of all mobiles available in the shop.");
	          System.out.println("3- Delete a mobile detail.");
	          System.out.println("4- Search mobiles.");
	    
	          Scanner scan=new Scanner(System.in);
	          try {
	              choice=scan.nextInt();
       
                  switch(choice) {
                        case 1: System.out.println("Enter the mobileid of the mobile you want to purchase");
                                mobileid=scan.nextInt();
                                while (true) {
            						if (MobileServiceImpl.validatePurchaseId(mobileid)) {
            							break;
            						} else {
            							System.err.println("Please enter valid mobile id only, try again");
            							mobileid = scan.nextInt();
            						}
            					}
                                try {
    	                       Map<Integer,PurchaseDetails> customer=mobileserviceimpl.insertDetails(mobileid);
    	                       for(Integer c:customer.keySet()) {
    	               			System.out.println(c+":"+customer.get(c));
    	               		}
                                }catch(MobilePurchaseException mpe) {
                                	System.out.println("Error: "+mpe.getMessage());
                                }
                                try {
                                mobile=mobileserviceimpl.updateMobilesList(mobileid);	
                                mobile.forEach(System.out::println);
                                }catch(MobilePurchaseException mpe) {
                                	System.out.println("Error: "+mpe.getMessage());
                                }
                                break;
                        case 2: System.out.println("Mobiles List:");
                        	    try {
                        	    
                        	    mobileserviceimpl.displayMobilesList().forEach(System.out::println);
                                }catch(MobilePurchaseException mpe) {
                                	System.out.println("Error: "+mpe.getMessage());
                                }
                                break;
                        case 3: System.out.println("Enter the mobile id of the mobile you want to delete!");
                                mobileid=scan.nextInt();
                                try {
                                System.out.println("List after deletion!");
                                mobile=mobileserviceimpl.deleteMobile(mobileid);
    	                       mobile.forEach(System.out::println);
                                }catch(MobilePurchaseException mpe) {
                                	System.out.println("Error: "+mpe.getMessage());
                                }
    	                        break;
                        case 4: System.out.println("Enter the low range and high range:");
                                int lowRange=scan.nextInt();
                                int highRange=scan.nextInt();
                                try {
                                System.out.println("Mobiles in the given range are:");
    	                        mobileserviceimpl.searchMobilesList(lowRange,highRange).forEach(System.out::println);
                                }catch(MobilePurchaseException mpe) {
                                	System.out.println("Error: "+mpe.getMessage());
                                }
    	                        break;
      
	          }
	          }catch (InputMismatchException e) {
					scan.nextLine();
					System.err.println("Please enter a valid value, try again");
				}
	          
		}
}
}
