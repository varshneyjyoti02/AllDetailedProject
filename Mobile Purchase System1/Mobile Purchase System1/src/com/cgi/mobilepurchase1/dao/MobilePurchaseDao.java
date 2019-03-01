package com.cgi.mobilepurchase1.dao;
import java.util.List;
import java.util.Map;
import com.cgi.mobilepurchase1.bean.*;
import com.cgi.mobilepurchase1.exception.MobilePurchaseException;


public interface MobilePurchaseDao {
	    public Map<Integer,PurchaseDetails> insertDetails(int mobileid);
	    public List<Mobile> updateMobilesList(int mobileid) throws MobilePurchaseException;
	    public List<Mobile> displayMobilesList() throws MobilePurchaseException;
	    public List<Mobile> deleteMobile(int mobileid);
	    public List<Mobile> searchMobilesList(int lowRange,int highRange) throws MobilePurchaseException;
}
