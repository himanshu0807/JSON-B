package com.app.tests;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class TestJsonProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are using Json-P processing api to create a JSON Object
		
		JsonObject jsonObject = Json.createObjectBuilder().add("name", "Himanshu").add("age", 26).build();
		
		Jsonb jsonb = JsonbBuilder.create();
		System.out.println(jsonb.toJson(jsonObject));

	}

}
