package com.app.bean;

public class Customer {

	private int custId;
	private String custName;
	private String emailAddress;
	private boolean isPrimeUser;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String emailAddress, boolean isPrimeUser) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.emailAddress = emailAddress;
		this.isPrimeUser = isPrimeUser;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public boolean isPrimeUser() {
		return isPrimeUser;
	}
	public void setPrimeUser(boolean isPrimeUser) {
		this.isPrimeUser = isPrimeUser;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", emailAddress=" + emailAddress
				+ ", isPrimeUser=" + isPrimeUser + "]";
	}
	
}
