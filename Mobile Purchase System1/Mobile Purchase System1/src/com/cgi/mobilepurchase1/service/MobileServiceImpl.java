package com.cgi.mobilepurchase1.service;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cgi.mobilepurchase1.bean.*;
import com.cgi.mobilepurchase1.dao.MobilePurchaseDao;
import com.cgi.mobilepurchase1.dao.MobilePurchaseDaoImpl;
import com.cgi.mobilepurchase1.exception.MobilePurchaseException;
import com.cgi.mobilepurchase1.util.MobileRepository;
public class MobileServiceImpl implements MobileService{
	MobilePurchaseDao mobilepurchase;
	
      public Map<Integer,PurchaseDetails> insertDetails(int mobileid) throws MobilePurchaseException{
    	  mobilepurchase=new MobilePurchaseDaoImpl();
    	  Map<Integer, PurchaseDetails> purchase=new HashMap<Integer, PurchaseDetails>();
    	  purchase=mobilepurchase.insertDetails(mobileid);
    	  return purchase;
      }
      
      public List<Mobile> updateMobilesList(int mobileid) throws MobilePurchaseException{
    	  mobilepurchase=new MobilePurchaseDaoImpl();
    	  List<Mobile> updateList=null;
    	  updateList=mobilepurchase.updateMobilesList(mobileid);
    	  return updateList;
      }
      
      public List<Mobile> displayMobilesList() throws MobilePurchaseException{
    	  mobilepurchase=new MobilePurchaseDaoImpl();
    	  List<Mobile> viewList=null;
    	  viewList=mobilepurchase.displayMobilesList();
    	  return viewList;
      }
      
      public List<Mobile> deleteMobile(int mobileid) throws MobilePurchaseException{
    	  mobilepurchase=new MobilePurchaseDaoImpl();
    	  List<Mobile> deleteList=null;
    	  deleteList=mobilepurchase.deleteMobile(mobileid);;
    	  return deleteList;
      }
      
      public List<Mobile> searchMobilesList(int lowRange,int highRange) throws MobilePurchaseException{
    	  mobilepurchase=new MobilePurchaseDaoImpl();
    	  List<Mobile> searchList=null;
    	  searchList=mobilepurchase.searchMobilesList(lowRange, highRange);
    	  return searchList;
      }
  		
  		public static boolean isValidName(String cName){
  			Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
  			Matcher nameMatcher=namePattern.matcher(cName);
  			return nameMatcher.matches();
  		}
  		public static boolean isValidEmailid(String emailId){
  			return (emailId.length() > 5);
  				
  		}
  		
  		public static boolean isValidPhoneNumber(String phoneNumber){
  			Pattern phonePattern=Pattern.compile("^[7-9]{1}[0-9]{9}$");
  			Matcher phoneMatcher=phonePattern.matcher(phoneNumber);
  			return phoneMatcher.matches();
  			
  		}
  		
  		public static boolean validatePurchaseId(int purchaseid) {
  			int count=0;
  			for(int i=0;i<10;i++) {
  				Mobile mobile=MobileRepository.getMobilesList().get(i);
  			    if(purchaseid==mobile.getMobileId())
  			    	count=1;
  			}
  		   if(count==1)
  			   return true;
  		   else
  			   return false;
      }
}
