package com.hcl.tests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataTestProv {
  
	@DataProvider
	  public static Object[][] login() {
	    return new Object[][] {
	      new Object[] { "rsonica", "test123" },
	      new Object[] { "tualsi", "tul123" },
	      new Object[] { "sowmy", "sow123" },
	    };
	  }
	
	@DataProvider(name="register")
	  public static Object[][] register() {
	    return new Object[][] {
	      new Object[] { "mani", "test123" },
	      new Object[] { "softgen", "tul123" },
	      new Object[] { "sample", "sow123" },
	    };
	  }
}
