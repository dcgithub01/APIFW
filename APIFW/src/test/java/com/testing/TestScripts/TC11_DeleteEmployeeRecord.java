package com.testing.TestScripts;


import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadProperties;

public class TC11_DeleteEmployeeRecord {
	@Test
	public void deleteRecord() throws IOException
	{
		Properties pr = LoadProperties.properties("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res= http.deleteRequest("QA_URL", TC7_PostRequestEmployee.idValue);
		System.out.println("Record deleted successfully  " + res.asString());
		System.out.println("Status code of delete request is " + res.statusCode());
		ResponseValidation.statusCodeValidation(200, res);
		
		
	}
}
