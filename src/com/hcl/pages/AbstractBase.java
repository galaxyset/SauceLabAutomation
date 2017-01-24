package com.hcl.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AbstractBase {

	public WebDriver driver;
	public DesiredCapabilities cap;
	public Proxy proxy;

	@Parameters({ "browser" })
	@BeforeClass
	public void browserConfig(String browser) {

		switch (browser) {

		case "Firefox":
			proxy = new Proxy();
			proxy.setProxyAutoconfigUrl("http://free-proxyserver.com/");
			cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.PROXY, proxy);
			cap.setJavascriptEnabled(true);
			driver = new FirefoxDriver(cap);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;

		case "Chrome":
			cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setJavascriptEnabled(true);
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
			driver = new ChromeDriver(cap);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;

		case "IE":
			cap = new DesiredCapabilities();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setJavascriptEnabled(true);
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")
							+ "\\Lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(cap);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;

		default:
			System.out.println("Browser value does not match...");

		}
	}

	@AfterClass
	public void closeBrowser() {
		//driver.quit();
	}

}
