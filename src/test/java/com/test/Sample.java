package com.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {
	public static void main(String[] args) {
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body("{\r\n" + 
				"    \"name\": \"Vignesh\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}");
		Response response = reqspec.post("https://reqres.in/api/users");
		int statusCode = response.statusCode();
		if(statusCode==201) {
			System.out.println("Passed");
		}
		System.out.println(statusCode);
		String asString = response.asString();
		System.out.println(asString);
		String asPrettyString = response.asPrettyString();
		System.out.println(asPrettyString);
	}

}
