package com.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import com.testing.utilities.LoadPayLoad;
import com.testing.utilities.LoadProperties;
import com.testing.utilities.ParsingJsonUsingOrgJson;

public class TC6_GetDetailsUsingOrgJson {
	public void TC6() throws IOException
	{
	Properties p = LoadProperties.properties("../APIFW/URI.properties");
	  String bodyData = LoadPayLoad.LoadPayLoadFile("../APIFW/src/test/java/com/testing/Resource/DummyJson.json");
	  String value =ParsingJsonUsingOrgJson.parsingJsonUsingOrg(bodyData, "type");
}
}