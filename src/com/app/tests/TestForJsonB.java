package com.app.tests;

import java.util.Date;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.bean.User;

public class TestForJsonB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(101);
		user.setName("Himanshu");
		user.setEmail("himanshu@gmail.com");
		user.setDateOfBirth(new Date(123));
		Jsonb jsonb = JsonbBuilder.create();
		String jsonValue = jsonb.toJson(user);
		System.out.println("result : " +jsonValue);
		Jsonb jsonb2 = JsonbBuilder.create();
		//to convert back into the object from jSon it is important to have default constructor
		System.out.println(jsonb2.fromJson(jsonValue, User.class));
	}

}
