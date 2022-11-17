package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver webDriver;
	@BeforeTest
	void before() {
		//WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
				
				 System.out.println("the eeb1"+webDriver);
				
		         webDriver = new ChromeDriver();
					
				
	}
	 @Test(dataProvider = "dp")
	  public void f( String s) throws Exception{
		   webDriver.get("d:\\codespace\\k.html");
		  // webDriver.get("https://www.google.com");
		  // webDriver.navigate().to("https://www.google.com");
		   WebElement  element = webDriver.findElement(By.xpath("//td[text()='"
				   					+s+"']/preceding-sibling::td/a"));
		   System.out.println(element.getText());
		   element.click();
		 //  webDriver.wait(100);
		   //webDriver.close();
	  }
  
  @Test
  public void f1() {
	 Assert.fail();
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Selenium IDE" },
      new Object[] { "Selenium Webdrivers" },
      new Object[] { "Selenium Grid" },
      new Object[] { "Selenium RC" },
    };
  }
}
