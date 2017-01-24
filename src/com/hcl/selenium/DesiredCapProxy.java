package com.hcl.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;
import com.hcl.utility.Constantx;
import com.hcl.utility.PropFileHandler;

public class DesiredCapProxy extends AbstractBase {
  @Test
  public void desiredCap() throws IOException {
	  
	  //All the desired cap is set on Abstract base class at browser level configuration.
	  driver.get(PropFileHandler.fetchProp(Constantx.URL.URL));
  }
}
