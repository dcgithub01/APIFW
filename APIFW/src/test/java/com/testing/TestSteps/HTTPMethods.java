package com.testing.TestSteps;
import static com.jayway.restassured.RestAssured.given;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response getRequest(String uriKey,String id)
	{
		String uri = pr.getProperty(uriKey)+"/"+ id;
	 Response res =given().contentType(ContentType.JSON).
			       when().get(uri);
System.out.println("Status code of the get request is   "+ res.getStatusCode());
System.out.println("Details of the request are   "+res.asString());
return res;
	}
	public Response getRequest(String uriKey)
	{
		//String uri = pr.getProperty(uriKey);
	 Response res =given().contentType(ContentType.JSON).
			       when().get(pr.getProperty(uriKey));
System.out.println("Status code of the get request is   "+ res.getStatusCode());
System.out.println("All Details of the request are   "+res.asString());
return res;
	}

	public Response postRequest(String body, String uriKey)
	{

		Response res= given().contentType(ContentType.JSON).body(body).
				      when().post(pr.getProperty(uriKey));
System.out.println("Status for the post request is  "+ res.statusCode());
return res;
		
}
	public Response putRequest(String data,String uriKey,String idValue)
	{ 
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		
		Response res = given().contentType(ContentType.JSON).body(data).when().put(uri);
		System.out.println("Record updated successfully and status returned by the put request is " + res.statusCode());
		return res;
		
	}
	public Response postRequest(String data,String uriKey,String idValue)
	{ 
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		System.out.println(uri);
		
		Response res = given().contentType(ContentType.JSON).body(data).when().post(uri);
		System.out.println("Record created successfully and status returned by the post request is " + res.statusCode());
		return res;
		
	}
	public Response deleteRequest(String uriKey, String idValue)
	{
		String uri = pr.getProperty(uriKey)+"/"+idValue;
		Response res = given().contentType(ContentType.JSON).when().delete(uri);
		System.out.println("Record deleted successfully");
		return res;
	}
}