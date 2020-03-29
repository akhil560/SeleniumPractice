package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.WordpressLoginPage;

public class VerifyWordPressLogin {
	@Test
	public void verifyValidLogin() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\OnlineClasses\\src\\test\\resources\\binaries\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("http://demosite.center/wordpress/wp-login.php");
	driver.manage().window().maximize();

	WordpressLoginPage login=new WordpressLoginPage(driver);

	login.typeUserName();
	login.typePassword();
	login.clickOnLoginButton();


	String url=driver.getCurrentUrl();
	Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);
	}
}
