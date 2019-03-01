package com.cgi.mobilepurchase1.dao;

import java.util.*;
import java.util.stream.Collectors;
import com.cgi.mobilepurchase1.service.*;
import com.cgi.mobilepurchase1.bean.*;
import com.cgi.mobilepurchase1.exception.MobilePurchaseException;
import com.cgi.mobilepurchase1.util.MobileRepository;

public class MobilePurchaseDaoImpl implements MobilePurchaseDao{
	Scanner scanner=new Scanner(System.in);
	PurchaseDetails purchasedetails=new PurchaseDetails();
	MobileServiceImpl mobileservice;
	Mobile mob=new Mobile();
	public Map<Integer,PurchaseDetails> insertDetails(int mobileid){
		Map<Integer, PurchaseDetails> purchase=new HashMap<Integer, PurchaseDetails>();
        //try {
  	        purchasedetails.setPurchaseId(mobileid);
  	        System.out.println("Enter the name of the customer");
  	        purchasedetails.setcName(scanner.nextLine());
  	        while(true) {
  	          if(MobileServiceImpl.isValidName(purchasedetails.getcName())) {
  	        	break;
  	          }
  	          else {
  	        	System.err.println(" Customer Name Should Be In Alphabets and minimum 3 characters long ! \n");
  	        	  purchasedetails.setcName(scanner.nextLine());
  	        	  
  	          }
  	        }
  	        System.out.println("Enter the email id of the customer");
  	        purchasedetails.setMailId(scanner.nextLine());
  	      while(true) {
  	        if(MobileServiceImpl.isValidEmailid(purchasedetails.getMailId())){
    			break;
  	        }
  	        else {
  	        	 System.err.println("\n MailID should be valid! \n");
  	        	purchasedetails.setMailId(scanner.nextLine());
	        	 
  	        }
    		}
  	        System.out.println("Enter the phone number of the customer");
  	        purchasedetails.setPhoneNo(scanner.nextLine());
  	        while(true) {
  	        if(MobileServiceImpl.isValidPhoneNumber(purchasedetails.getPhoneNo())){
    			break;
  	        }
  	        else {
  	        	System.err.println("\n Phone Number Should be in 10 digit! \n");
  	        	purchasedetails.setPhoneNo(scanner.nextLine());
	        	  
  	        }
    		}
  	        System.out.println("Enter the date of purchase");
  	        purchasedetails.setPurchaseDate(scanner.nextLine());
  	        purchase.put(mobileid, purchasedetails);
  	        System.out.println("Customer Details after Insertion!");
        //}
       /* catch(Exception e) {
        	throw new MobilePurchaseException("Error Occurred in Inserting customer details!");
        }*/
        if(purchase.isEmpty())
        	return Collections.emptyMap(); 
        else
  	           return purchase;
		
	}
	 public List<Mobile> updateMobilesList(int mobileid) throws MobilePurchaseException{
		 int count=0;
		 List<Mobile> mobiles=MobileRepository.getMobilesList();
		 try {
		   for(int i=0;i<10;i++) {
		     Mobile mobile=mobiles.get(i);
		     if(mobile.getMobileId()==mobileid) {
		    	 mobile.setQuantity(mobile.getQuantity()-1);
		    	 count=1;
		     }
		 }
		   System.out.println("Mobiles List after updating!");
		 }catch(Exception e) {
			 throw new MobilePurchaseException("Error Occured in updating mobile list!");
		 }
		 if(count==1)
			 return mobiles;
		 else
			 return Collections.emptyList();
		 }
		
	 public List<Mobile> displayMobilesList() throws MobilePurchaseException{
		 List<Mobile> mobiles=MobileRepository.getMobilesList();
		 try {
			 if(mobiles.isEmpty()) 
				 System.out.println("Error displaying Mobiles List!");
		 }catch(Exception e) {
			 throw new MobilePurchaseException("Error Occurred in dislpaying Mobiles List!");
		 }
		 if(!mobiles.isEmpty()) 
				 return mobiles;
		 else
			 return Collections.emptyList();
		
	 }
	 public List<Mobile> deleteMobile(int mobileid){
		 int count=0;
		 
		    for(int i=0;i<MobileRepository.getMobilesList().size();i++) {
		       Mobile mobile=MobileRepository.getMobilesList().get(i);
		       if(mobile.getMobileId()==mobileid) {
		    	  MobileRepository.getMobilesList().remove(i);
		    	  count=1;
		       }
		    }
		 if(count==1)
				 return MobileRepository.getMobilesList();
		 else
			 return Collections.emptyList();
		
	 }
	    public List<Mobile> searchMobilesList(int lowRange,int highRange) throws MobilePurchaseException{
	    	int count=0;
	    	List<Mobile> mobiles=new ArrayList<Mobile>();
			 try {
			    
			    	  mobiles=MobileRepository.getMobilesList().stream().filter((mob)->mob.getPrice()>=lowRange && mob.getPrice()<=highRange).collect(Collectors.toList());
			    	  if(!mobiles.isEmpty())
			    	     count=1;
			          else
			    	     System.out.println("No such Mobile Found!");
			 }catch(Exception e) {
				 throw new MobilePurchaseException("Error Occurred in searching Mobile information!");
			 }
			 if(count==1)
					 return mobiles;
			 else
				 return Collections.emptyList();
	    }
}
