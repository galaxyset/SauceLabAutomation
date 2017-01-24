package com.hcl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractBase {
	
	public   WebDriver driver;
	
	public  By UserEmail		= By.xpath("//input[@type='email']");
	public  By UsernameNxtBtn	= By.xpath("//input[@id='next']");
	public  By FindMyAccount	= By.xpath("//div[@id='gaia_firstform']/div/a");
	public  By CreateAccount 	= By.xpath("//span[@id='link-signup']/a");
	public  By PwdField		= By.xpath("//input[@id='Passwd']");
	public  By SignInBtn		= By.xpath("//input[@id='signIn']");
	public  By ForgotPwdLink	= By.xpath("//a[@id='link-forgot-passwd']");
	public  By SignInDiffUser	= By.xpath("//*[@id='link-signin-different']/a");
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	public  void setUsername(String username){
		driver.findElement(UserEmail).clear();
		driver.findElement(UserEmail).sendKeys(username);
	}
	
	public  void ClickNxtUname(){
		 driver.findElement(UsernameNxtBtn).isDisplayed();
		 driver.findElement(UsernameNxtBtn).click();
	}
	
	public  void setPassword(String password){
		driver.findElement(PwdField).clear();
		driver.findElement(PwdField).sendKeys(password);
		
	}
	
	public  void clickSignInBtn(){
		 driver.findElement(SignInBtn).isDisplayed();
		 driver.findElement(SignInBtn).click();
	}
	
	
	
	
	
	

}
