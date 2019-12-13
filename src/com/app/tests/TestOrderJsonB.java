package com.app.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbException;

import com.app.bean.Order;
import com.app.util.DataGenerator;

public class TestOrderJsonB {
	
	public static void main(String[] args) {
		
		Order order = DataGenerator.getData();
		System.out.println("Order Value : " +order);
		Jsonb jsonb = JsonbBuilder.create();
		String jsonValue = jsonb.toJson(order);
		System.out.println("convert ---> Json : "+jsonValue);
		try(Writer writer = new FileWriter(new File("order.txt"))){
			writer.write(jsonb.toJson(order));
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Order desirializeOrder;
			try {
				desirializeOrder = jsonb.fromJson(new FileReader(new File("order.txt")), Order.class);
				System.out.println(desirializeOrder); 
			} catch (JsonbException | FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
