package com.hcl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	/*String name; // Non global variable
	static int a; // static global variable
*/	
	public WebDriver driver;
	
	
	public void browserHandle(String browser){
		
		switch(browser){
		
		case "Firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			
		case "Chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
					
		case "IE":
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
			
		default:
			System.out.println("Browser value does not match...");
		
		}
		
	}
	
	
	public void closeBrowser(){
		driver.quit();
	}

}
