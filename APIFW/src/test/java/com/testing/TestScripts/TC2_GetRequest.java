package com.testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadProperties;

public class TC2_GetRequest {

	@Test
	public void testCase2() throws IOException {
		// TODO Auto-generated method stub
Properties p = LoadProperties.properties("../APIFW/URI.properties");
HTTPMethods http = new HTTPMethods(p);
Response res =http.getRequest("QA_URI",TC1_PostRequest.idvalue);
ResponseValidation.statusCodeValidation(200, res);
	}

}
