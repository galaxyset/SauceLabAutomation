package com.hcl.testng;

import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;

public class OpenURL extends AbstractBase {
  @Test()
  public void f() {
	    driver.get("http://www.gmail.com");
  }
}
