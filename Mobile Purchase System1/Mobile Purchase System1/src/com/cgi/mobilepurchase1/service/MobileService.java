package com.cgi.mobilepurchase1.service;

import java.util.*;
import com.cgi.mobilepurchase1.bean.*;
import com.cgi.mobilepurchase1.exception.MobilePurchaseException;

public interface MobileService {
    public Map<Integer,PurchaseDetails> insertDetails(int mobileid) throws MobilePurchaseException;
    public List<Mobile> updateMobilesList(int mobileid)  throws MobilePurchaseException;
    public List<Mobile> displayMobilesList()  throws MobilePurchaseException;
    public List<Mobile> deleteMobile(int mobileId)  throws MobilePurchaseException;
    public List<Mobile> searchMobilesList(int lowRange,int highRange)  throws MobilePurchaseException;
}
