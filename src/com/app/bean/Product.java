package com.app.bean;

public class Product {
	
	private int id;
	private String name;
	private String manufacture;
	private String shippingCompany;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, String manufacture, String shippingCompany, double price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacture = manufacture;
		this.shippingCompany = shippingCompany;
		this.price = price;
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
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getShippingCompany() {
		return shippingCompany;
	}
	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacture=" + manufacture + ", shippingCompany="
				+ shippingCompany + ", price=" + price + "]";
	}

}
