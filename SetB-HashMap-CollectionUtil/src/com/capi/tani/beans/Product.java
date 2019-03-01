package com.capi.tani.beans;

public class Product {
 private int id;
 private String name;
 private String category;
 private int price;
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int id, String name, String category, int i) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.price = i;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
