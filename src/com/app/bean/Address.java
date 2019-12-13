package com.app.bean;

public class Address {

	private String street;
	private String city;
	private String country;
	private int zipcode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String street, String city, String country, int zipcode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode + "]";
	}
		
}
