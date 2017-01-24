package com.hcl.selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.hcl.pages.AbstractBase;
import com.hcl.utility.Constantx;
import com.hcl.utility.PropFileHandler;
import com.hcl.utility.Utils;

public class DropDownListx extends AbstractBase {
  @Test(description="Select drop down list in gmail page")
  public void dropSelect() throws IOException, InterruptedException {
	  
	  // Open the browser with URL
	  driver.get(PropFileHandler.fetchProp(Constantx.URL.URL));
	  
	  //Select a list from drop down
	  List<WebElement> dropDownList=driver.findElements(By.xpath("//select[@id='lang-chooser']/option"));
	  int count=dropDownList.size();
	  System.out.println("No of lists:"+count);
	  for(int i=0;i<count;i++){
		  System.out.println(dropDownList.get(i).getText());
	  }
	  WebElement droplist=driver.findElement(By.xpath("//select[@id='lang-chooser']/option[54]"));  //*[@id="lang-chooser"]/option[54]
	  droplist.click();
	  Utils.setTimeOut(5000);
	  
	  // Visualize the landing page and get title of it
	  System.out.println("PageTitle:"+driver.getTitle());
  }
}
