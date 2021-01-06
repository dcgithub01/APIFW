package com.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadProperties;

public class TC9_GetSingleEmployeeDetails {
	@Test
	public void getSingleRecordDetails() throws IOException
	{
	
	Properties pr= LoadProperties.properties("../APIFW/URI.properties");
	HTTPMethods http = new HTTPMethods(pr);
Response res =	http.getRequest("QA_URL", TC7_PostRequestEmployee.idValue);
	ResponseValidation.statusCodeValidation(200, res);
	System.out.println("Details of the record are  " + res.asString());
	
}
}
