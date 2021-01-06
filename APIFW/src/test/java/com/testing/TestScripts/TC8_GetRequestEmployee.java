package com.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadPayLoad;
import com.testing.utilities.LoadProperties;

public class TC8_GetRequestEmployee {
	@Test
public void getRequest() throws IOException {
	Properties pr = LoadProperties.properties("../APIFW/URI.properties");
	HTTPMethods http = new HTTPMethods(pr);
	Response res =http.getRequest("QA_URL");
	System.out.println("get request response is " + res.asString());
	System.out.println("status code for the get request is" + res.getStatusCode());
	ResponseValidation.statusCodeValidation(200, res);
	
	
}

}
