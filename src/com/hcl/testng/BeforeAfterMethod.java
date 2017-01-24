package com.hcl.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method is invoked..");
  }
  
  @Test(priority=1,groups="Smoke")
  public void register() {
	  int i=10;
	  int j=20;
	  Assert.assertEquals(j>i, i>j);
	  System.out.println("Registration is executed..");
  }
  
  @Test(dependsOnMethods="register", groups="Smoke")
  public void login() {
	  System.out.println("Login is executed..");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method is executed..");
  }

}
