package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.PageFactory_Login_KD;
import cts.miniproject.utility.ConfigReader;
import cts.miniproject.utility.PageFactory_Browser_KD;


public class PageFactory_verifyLogin_KD {
	ConfigReader cr1 = new ConfigReader();
	@Test
	public void checkValidUser() throws InterruptedException {
	//This will Launch browser and specific url
	PageFactory_Browser_KD browserfactory_kd=new PageFactory_Browser_KD();
	WebDriver driver=browserfactory_kd.startBrowser("chrome", cr1.getPageFactoryurl());

	//Create pageObject using PageFactory
	PageFactory_Login_KD loginpage=PageFactory.initElements(driver, PageFactory_Login_KD.class);
	loginpage.typeUserNameAndPassword("admin", "demo123");
	loginpage.clickOnLoginButton();
	Thread.sleep(3000);
	String url=driver.getCurrentUrl();
	Assert.assertEquals(cr1.getPageFactoryloginsuccessURL(), url);
	
	driver.close();
}
}