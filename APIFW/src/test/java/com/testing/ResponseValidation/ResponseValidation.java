package com.testing.ResponseValidation;

import com.jayway.restassured.response.Response;
import com.testing.utilities.ParsingJsonUsingJsonPath;

public class ResponseValidation {
	
	public static void statusCodeValidation(int expectedStatusCode, Response res)
	{
		if(expectedStatusCode==res.statusCode())
		{
			System.out.println("Status code is matching");
		}
		else 
		{
			System.out.println("Status code doesnt match");
		}
		
	}
	public static void dataValidation(String expectedvalue,Response res, String jsonPath)
	{
	if(expectedvalue.equals(ParsingJsonUsingJsonPath.ParsingJson(res, jsonPath)))
				 {
		          System.out.println("Data is matching");
				 }
	else {
		System.out.println("data is not matching");
	}
		
	}


}