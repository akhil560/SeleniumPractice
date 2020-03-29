package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cts.miniproject.utility.ConfigReader;

public class TestSeleniumInChrome {
	ConfigReader cr;
  @Test
  public void setup() {
	  cr = new ConfigReader();
	  System.setProperty("webdriver.chrome.driver", cr.getchromepath());
		System.out.println("Setup Success");
		
  }
  
  @Test
  public void testchrome() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get(cr.geturl());
	  
		
  }
}
