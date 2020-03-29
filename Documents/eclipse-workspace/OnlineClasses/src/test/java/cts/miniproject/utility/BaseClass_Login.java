package cts.miniproject.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass_Login {
	public WebDriver driver;
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\SeleniumCaseStudy1\\src\\test\\resources\\binaries\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Reporter.log("Application started",true);
  }

  @AfterMethod
  public void teardown() {
	  driver.quit();
	  Reporter.log("Session ended", true);
  }
}
