package com.capi.tani.bean;

import java.time.LocalDate;

public class Sales {

	private int saleId;
	private int prodCode;
	private String prodName;
	private String category;
	private LocalDate saleDate;
	private int quantity;
	private float lineTotal;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public Sales(int saleId, int prodCode, String prodName, String category, LocalDate saleDate, int quantity,
			float lineTotal, int price) {
		super();
		this.saleId = saleId;
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.category = category;
		this.saleDate = saleDate;
		this.quantity = quantity;
		this.lineTotal = lineTotal;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", prodCode=" + prodCode + ", prodName=" + prodName + ", category="
				+ category + ", saleDate=" + saleDate + ", quantity=" + quantity + ", lineTotal=" + lineTotal
				+ ", price=" + price + "]";
	}
		}
