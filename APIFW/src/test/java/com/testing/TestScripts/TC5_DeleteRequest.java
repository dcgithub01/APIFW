package com.testing.TestScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.LoadProperties;

public class TC5_DeleteRequest {
	@Test
	public void deleteRecordRequest() throws IOException {
		Properties pr = LoadProperties.properties("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
	Response res=	http.deleteRequest("QA_URI", TC1_PostRequest.idvalue);
		System.out.println("Delete Request status code is " + res.statusCode());
		System.out.println("delete request response is " + res.asString());
	}

}
