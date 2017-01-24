package com.hcl.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;
import com.hcl.utility.Constantx;
import com.hcl.utility.PropFileHandler;

public class SeleniumMethods extends AbstractBase {
  
 @Test
  public void selMethods() throws IOException {
	 
	 // get methods- Opening a URL
	  driver.get(PropFileHandler.fetchProp(Constantx.URL.URL));
	  
	 // get the title of the page
	  String ExpTitle=driver.getTitle();
	  String ActTitle="Gmail";
	  if(ActTitle.equals(ExpTitle)){
		System.out.println("Title matches:-"+ExpTitle);  
	  }else{
		  System.out.println("Title mismatch.....");
	  }
	  
	  
	  //Get the current url of the page
	  System.out.println("Current Page URL:"+driver.getCurrentUrl());
	  
	  //Get the page source content
	  System.out.println(driver.getPageSource());
  }
}
