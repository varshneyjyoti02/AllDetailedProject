package com.cgi.mobilepurchase1.bean;

public class Mobile {
    private int mobileId;
    private String mobileName;
    private int price;
    private int quantity;
    
	public Mobile() {
		super();
	}
	
	public Mobile(int mobileId, String mobileName, int price, int quantity) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.price = price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getMobileId() {
		return mobileId;
	}


	public int getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Mobile [Id=" + mobileId + ", Name="
				+ mobileName + ", Price=" + price
				+ ", Quantity=" + quantity + "]";
	}
    
}
