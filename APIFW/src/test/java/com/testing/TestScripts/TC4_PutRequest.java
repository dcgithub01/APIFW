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

public class TC4_PutRequest {
	@Test
	public void putRequest() throws IOException
	{
		JSONObject obj = new JSONObject();
		obj.put("firstName", "DeepakC");
		obj.put("lastName", "hhabra");
		obj.put("id", TC1_PostRequest.idvalue);
		//obj.put("Designation", "Sr Test Lead");
		
		 Properties p = LoadProperties.properties("../APIFW/URI.properties");
		 HTTPMethods http = new HTTPMethods(p);
		 Response res= http.putRequest(obj.toString(), "QA_URI", TC1_PostRequest.idvalue);
		 System.out.println("Status returned using put request is " +res.statusCode());
		 ResponseValidation.statusCodeValidation(200, res);
		 System.out.println(res.asString());
		// ResponseValidation.dataValidation("hhabra", res, jsonPath);
	}

}
