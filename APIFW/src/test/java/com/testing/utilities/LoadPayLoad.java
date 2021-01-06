package com.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadPayLoad {

	public static String LoadPayLoadFile(String path) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject ob = new JSONObject(js);
		return ob.toString();
		
		
	}
}
