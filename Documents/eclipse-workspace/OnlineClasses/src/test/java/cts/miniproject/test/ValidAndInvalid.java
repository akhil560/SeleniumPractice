package cts.miniproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import cts.miniproject.utility.BaseClass_Login;

public class ValidAndInvalid extends BaseClass_Login{
	
  @Test (priority=1)
  public void validlogin() {
	  
	  	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", driver.getCurrentUrl());
  }
  
  @Test (priority=2)
  public void invalidlogin() {
	  
	  	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin560");
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
		
  }
}
