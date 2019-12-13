package com.app.bean;

import java.util.List;

public class OrderDetails {

	private List<Product> products;
	private Address shippingAddress;
	private int totalAmt;
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(List<Product> products, Address shippingAddress, int totalAmt) {
		super();
		this.products = products;
		this.shippingAddress = shippingAddress;
		this.totalAmt = totalAmt;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public int getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}
	@Override
	public String toString() {
		return "OrderDetails [products=" + products + ", shippingAddress=" + shippingAddress + ", totalAmt=" + totalAmt
				+ "]";
	}
	
	
}
