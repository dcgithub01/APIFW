package com.testing.utilities;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParsingJsonUsingOrgJson {
	
	public static String parsingJsonUsingOrg(String body, String variableName)
	{
		JSONArray js = new JSONArray(body);
		JSONObject ob1 = js.getJSONObject(0);
		JSONObject ob2 = js.getJSONObject(1);
		 Set<String>innerKeys1 = ob1.keySet();
		 Set<String>innerKeys2 = ob2.keySet();
		 for(String key1:innerKeys1)
		 {
		try
		{ if(key1.equalsIgnoreCase(variableName))
		{
			JSONArray arr = new JSONArray(ob1.get(key1).toString());
			System.out.println("Key is "+key1 + " and value is "+ arr);
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Key is "+ key1 + " value is " + ob1.get(key1).toString());
		}
		 for(String key2:innerKeys2)
		 {
		try
		{ if(key2.equalsIgnoreCase(variableName))
		{
			JSONArray arr = new JSONArray(ob2.get(key2).toString());
			System.out.println("Key is "+key2 + " and value is "+ arr);
		}
		}
		catch(Exception e)
		{
			System.out.println("Key is "+ key2 + " value is " + ob2.get(key2).toString());
		}
		

			}

		
	}
		return variableName;

}}
