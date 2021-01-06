package com.testing.TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;

import com.jayway.restassured.response.Response;
import com.testing.ResponseValidation.ResponseValidation;
import com.testing.TestSteps.HTTPMethods;
import com.testing.utilities.JSONValueReplacement;
import com.testing.utilities.LoadPayLoad;
import com.testing.utilities.LoadProperties;
import com.testing.utilities.ParsingJsonUsingJsonPath;

public class TC1_PostRequest {
    static String idvalue;
	@Test
	public void testCase1() throws IOException {

		Random random= new Random();
		Integer value = random.nextInt();
		
    Properties p = LoadProperties.properties("../APIFW/URI.properties");
  String bodyData = LoadPayLoad.LoadPayLoadFile("../APIFW/src/test/java/com/testing/Resource/PayLoad.json");
  bodyData=JSONValueReplacement.ReplaceJSONValue(bodyData, "id", value.toString())	;
  HTTPMethods http = new HTTPMethods(p) ;
		Response res=http.postRequest(bodyData, "QA_URI");
    idvalue= ParsingJsonUsingJsonPath.ParsingJson(res, "id");
    System.out.println(idvalue);
   ResponseValidation.statusCodeValidation(201, res);
	}

}
