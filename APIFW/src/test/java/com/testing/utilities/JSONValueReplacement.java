package com.testing.utilities;

import java.util.Random;
import java.util.regex.Pattern;

public class JSONValueReplacement {
	
	public static String ReplaceJSONValue(String body, String variableName, String variableValue )
	{
		
		
 body = body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
return body;		
	  

}
}
