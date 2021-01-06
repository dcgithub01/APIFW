package com.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadProperties;

public class TC10_PutRequestEmployee {
	@Test
	public void putRequest() throws IOException
	{
		JSONObject obj = new JSONObject();
		obj.put("Salary","100000");
		obj.put("Employee Name", "DCName");
		obj.put("id", TC7_PostRequestEmployee.idValue);
		Properties p = LoadProperties.properties("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.putRequest(obj.toString(), "QA_URL", TC7_PostRequestEmployee.idValue);
		System.out.println("Details of the put request are  " + res.asString());
		ResponseValidation.statusCodeValidation(200, res);
	}



}
