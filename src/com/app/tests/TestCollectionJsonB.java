package com.app.tests;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import com.app.bean.Order;
import com.app.bean.Product;

public class TestCollectionJsonB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List nonGeneric = new ArrayList<>();
		nonGeneric.add(123);
		nonGeneric.add("Abhinav");
		nonGeneric.add(new Order());
		 
		System.out.println(JsonbBuilder.create().toJson(nonGeneric));
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Iphone", "Apple", "BlueDart", 18000));
		products.add(new Product(2, "Hedphone", "Boss", "Flipkart", 10000));
		products.add(new Product(3 , "fitbit", "fitbit", "first flight", 13000));
		products.add(new Product(4, "Running Shoe", "Nike", null , 3000));
		products.add(null);
		
		System.out.println(JsonbBuilder.create().toJson(products));
		String jsonValue = JsonbBuilder.create().toJson(products);
		List<Product> genericList = JsonbBuilder.create().fromJson(jsonValue, new ArrayList<Product>(){}.getClass().getGenericSuperclass());
		System.out.println("Generic Collection----> Product Class :" +genericList);
		
	}

}
