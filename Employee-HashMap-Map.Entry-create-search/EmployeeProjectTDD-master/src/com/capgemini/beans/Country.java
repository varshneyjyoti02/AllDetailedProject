package com.capgemini.beans;

public class Country {
	private String name;
	@Override
	public String toString() {
		return "Country [name=" + name + ", city=" + city + "]";
	}
	private City city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Country(String name, City city) {
		super();
		this.name = name;
		this.city = city;
	}
	public Country() {
		super();
	}
	
	

}
