package com.testing.utilities;

import com.jayway.restassured.response.Response;

public class ParsingJsonUsingJsonPath {
 
 
	public static String ParsingJson(Response res, String jsonPath)
	{
		String value=res.jsonPath().get(jsonPath);
		return value;
		
	}
}
