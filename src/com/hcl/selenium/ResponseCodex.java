package com.hcl.selenium;

import java.io.IOException;

import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;
import com.hcl.utility.Constantx;
import com.hcl.utility.PropFileHandler;
import com.hcl.utility.Utils;

public class ResponseCodex extends AbstractBase {
  @Test
  public void linkValidation() throws InterruptedException, IOException {
	  
	  Utils ref = new Utils(driver);	  
	  ref.collectURL(PropFileHandler.fetchProp(Constantx.URL.URL));
  }
}
