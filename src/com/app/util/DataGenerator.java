package com.app.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Address;
import com.app.bean.Customer;
import com.app.bean.Order;
import com.app.bean.OrderDetails;
import com.app.bean.Product;

public class DataGenerator {

	public static Order getData(){
		
		Address address = new Address();
		address.setCity("Delhi");
		address.setStreet("chandni chowk");
		address.setCountry("India");
		address.setZipcode(110006);
		
		List<Product> products = new ArrayList<>();
		products.add(new Product(1, "Iphone", "Apple", "BlueDart", 18000));
		products.add(new Product(2, "Hedphone", "Boss", "Flipkart", 10000));
		products.add(new Product(3 , "fitbit", "fitbit", "first flight", 13000));
		products.add(new Product(4, "Running Shoe", "Nike", null , 3000));
		products.add(null);
		
		OrderDetails  orderDetails = new OrderDetails(products, address, 41000);
		
		Customer customer = new Customer(123, "Rachel green", "rachel.green@gmail.com", true);
		
		Order order = new Order(orderDetails, 199, LocalDate.parse("2019-12-13"), LocalDate.parse("2019-12-17"), customer);
		//System.out.println("Order Value :" +order);
		return order;
	}
}
