package com.app.bean;

import java.util.Date;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class User {

	private int id;
	private String name;
	private String email;
	private Date dateOfBirth;
	public Long creditCard; 
	public final String USER_TYPE= "Admin";
	public static int count =0;
	public transient boolean flag = true;
	
	
	public User() {
		super();
	}
	
	public User(int id, String name, String email, Date dateOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		//JSON only pick up public getter setter & public fields
		User user = new User(11, "Himanshu", "0807@gmail.com", new Date());
		user.creditCard=654664876L;
		Jsonb jsonb = JsonbBuilder.create();
		String jsonValue = jsonb.toJson(user);
		System.out.println("result : " +jsonValue);
		}
	
}
