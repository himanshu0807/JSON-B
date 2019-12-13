package com.app.bean;

import java.time.LocalDate;

public class Order {
	
	private OrderDetails orderDetails;
	private int orderId;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private Customer customer;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(OrderDetails orderDetails, int orderId, LocalDate orderDate, LocalDate deliveryDate,
			Customer customer) {
		super();
		this.orderDetails = orderDetails;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customer = customer;
	}
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderDetails=" + orderDetails + ", orderId=" + orderId + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", customer=" + customer + "]";
	}
	

}
