package com.testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.JSONValueReplacement;
import com.testing.utilities.LoadPayLoad;
import com.testing.utilities.LoadProperties;
import com.testing.utilities.ParsingJsonUsingJsonPath;

public class TC7_PostRequestEmployee {
	static String idValue;
	
	@Test
	public void testCase7() throws IOException
	{
		Random random = new Random();
		    Integer value= random.nextInt();
		
		Properties pr= LoadProperties.properties("../APIFW/URI.properties");
	String loadBody =	LoadPayLoad.LoadPayLoadFile("../APIFW/src/test/java/com/testing/Resource/PayLoadEmployee.json");
	loadBody = JSONValueReplacement.ReplaceJSONValue(loadBody, "id", value.toString());
	HTTPMethods http = new HTTPMethods(pr);
		Response res =http.postRequest(loadBody,"QA_URL");
	 idValue=ParsingJsonUsingJsonPath.ParsingJson(res, "id");
		System.out.println("id value is "+ idValue);
		System.out.println(" Status code of the post request is  "+res.statusCode());
		ResponseValidation.statusCodeValidation(201, res);
		//ResponseValidation.dataValidation("123", res, "data.salary");
		
	}

}
