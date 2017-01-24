package com.hcl.testng;

import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;

public class GoogleTest extends AbstractBase {
  @Test(testName="OpenGoogle",groups="smoke")
  public void f() {
	  driver.get("http://www.google.com");
  }
}
