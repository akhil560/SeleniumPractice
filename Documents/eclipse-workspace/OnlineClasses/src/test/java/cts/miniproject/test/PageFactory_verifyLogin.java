package cts.miniproject.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.*;
import cts.miniproject.utility.*;

public class PageFactory_verifyLogin {
	@Test
	public void checkValidUser() throws InterruptedException {
	//This will Launch browser and specific url
	Pagefactory_Browser browserfactory=new Pagefactory_Browser();
	WebDriver driver=browserfactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

	//Create pageObject using PageFactory
	PageFactory_Login loginpage=PageFactory.initElements(driver, PageFactory_Login.class);
	loginpage.typeUserNameAndPassword("admin", "demo123");
	loginpage.clickOnLoginButton();
	Thread.sleep(3000);
	String url=driver.getCurrentUrl();
	Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);
	
	driver.close();
	}
}
