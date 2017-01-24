package com.hcl.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.hcl.tests.DataTestProv;

public class DataHandler {
  
 @Test(testName="signIn",dataProviderClass=DataTestProv.class,dataProvider="register")
  public void signIn(String username, String pwd) {
	 System.out.println("Username:"+username+"<---->"+"Password:"+pwd);
  }

 
  
  /*@DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "rsonica", "test123" },
      new Object[] { "tualsi", "tul123" },
      new Object[] { "sowmy", "sow123" },
    };
  }*/
}
