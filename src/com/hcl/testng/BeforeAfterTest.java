package com.hcl.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest {
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test is executed..");
  }
  
  @Test
  public void login() {
	  System.out.println("Login is executed..");
  }
  
  @Test
  public void logout() {
	  System.out.println("Logout is executed..");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test is executed..");
  }

}
