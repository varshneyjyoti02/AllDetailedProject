package com.cgi.mobilepurchase1.bean;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class PurchaseDetails {
       private int purchaseId;
       private String cName;
       private String mailId;
       private String phoneNo;
       private LocalDate purchaseDate;
	public PurchaseDetails() {
		super();
	}
	
	public PurchaseDetails(int purchaseId, String cName, String mailId, String phoneNo, LocalDate purchaseDate) {
		super();
		this.purchaseId = purchaseId;
		this.cName = cName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.purchaseDate = purchaseDate;
	}
	
	public int getPurchaseId() {
		return purchaseId;
	}
	
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public String getMailId() {
		return mailId;
	}
	
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setPurchaseDate(String purchaseDate) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate input=LocalDate.parse(purchaseDate, formatter);
		this.purchaseDate = input;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + cName + ", Mail Id="
				+ mailId + ", Phone No=" + phoneNo
				+ ", Date of Purchase=" + purchaseDate + "]";
	}
       
}
