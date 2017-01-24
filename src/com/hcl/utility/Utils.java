package com.hcl.utility;


import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hcl.pages.AbstractBase;

public class Utils extends AbstractBase {
	
	public static WebDriver driver;
	
	public Utils(WebDriver driver){
		this.driver=driver;
	}
	
	
	public  void openURL(String URL){
		driver.get(URL);
	}
	
	public static void setTimeOut(int seconds) throws InterruptedException{
		Thread.sleep(seconds);
	}
	
	public static void collectURL(String URL) throws InterruptedException{
		//Open URL
		driver.get(URL);
		setTimeOut(5000);
		
		//Collect no of urls using tagname and storing it in list
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		//Get the count of links and print it
		int count = allLinks.size();
		System.out.println("No of Links:"+count);
		
		//display all the url based on the count captured above.
		for(int i=0;i<count;i++){
			System.out.println(allLinks.get(i).getAttribute("href"));
			checkResponse(allLinks.get(i).getAttribute("href"));
		}
	}
		
		public static boolean checkResponse(String url){
			try {
		           int response_code= Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		           System.out.println(response_code);
		           if(response_code==200)
		        	   return true;
		           else{
		        	   return false;
		           }
		           
				} catch (Exception e) {
		            return false;
		        }
			
			  }
		
		public static byte[] pwdEncrypt(String Password){
			byte[] pwd = Password.getBytes();
			byte[] encodedPwd = Base64.encodeBase64(pwd);
			System.out.println("Password encrypted:"+new String(encodedPwd));
			return encodedPwd;
			
		}
		
		public static byte[] pwdDecrypt(String Password){
			byte[] pwd = Password.getBytes();
			byte[] decodedPwd = Base64.decodeBase64(pwd);
			System.out.println("Password encrypted:"+new String(decodedPwd));
			return decodedPwd;
			
		}


}
