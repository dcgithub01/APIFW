package com.testing.TestScripts;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadProperties;

public class TC3_GetRequestAllData {
	@Test
	public void testCase3() throws IOException
	{
	Properties p = LoadProperties.properties("../APIFW/URI.properties");
	HTTPMethods http = new HTTPMethods(p);
	Response res = http.getRequest("QA_URI");
	ResponseValidation.statusCodeValidation(200, res);
	//ResponseValidation.dataValidation("hhabra", res, "StudentDetails[31].LastName");
	
	}

}
