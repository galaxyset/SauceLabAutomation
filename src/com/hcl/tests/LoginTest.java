package com.hcl.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;
import com.hcl.pages.LoginPage;
import com.hcl.utility.Constantx;
import com.hcl.utility.PropFileHandler;
import com.hcl.utility.Utils;


public class LoginTest extends AbstractBase {
  
  @Test(description="Login with valid credentials")
  public void loginScenario() throws IOException, InterruptedException {
	  
	  LoginPage objLogin = new LoginPage(driver);
	  
	  	  //Open the Login page URL
	  driver.get(PropFileHandler.fetchProp(Constantx.URL.URL));
	  
	  // Enter the Username or Email in login page
	  objLogin.setUsername(PropFileHandler.fetchProp(Constantx.Credentials.Username));
	  
	  //Click the Next button on username login page
	  objLogin.ClickNxtUname();
	  
	  Utils.setTimeOut(5000);
	  
	  //Enter the Password in login page
	  objLogin.setPassword(PropFileHandler.fetchProp(Constantx.Credentials.Password));
	  
	  //Click the Sign In Button on login page
	  objLogin.clickSignInBtn();
	  
  }
}
