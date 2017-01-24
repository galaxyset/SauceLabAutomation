package com.hcl.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropFileHandler {
	
	public static String Filepath = System.getProperty("user.dir")+"\\OR.properties";
	public  static Properties prop;
	public  static InputStream input;
	
	
	public static String fetchProp(String Key) throws IOException{
		
		prop= new Properties();
		input= new FileInputStream(Filepath);
		prop.load(input);
		
		//Supply the key and store the value to return
		
		String value = prop.getProperty(Key);
		return value;
		
	}
	

}
