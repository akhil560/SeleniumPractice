package cts.miniproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageFactory_Login {
	WebDriver driver;

	@FindBy(how=How.ID,using="user_login")
	@CacheLookup
	WebElement username;

	@FindBy(how=How.XPATH,using="//input[@id='user_pass']")
	@CacheLookup
	WebElement password;

	@FindBy(how=How.XPATH,using="//input[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button;

	public PageFactory_Login(WebDriver driver) {
	this.driver=driver;
	}

	public void typeUserNameAndPassword(String userid,String pass) {
	username.sendKeys(userid);
	password.sendKeys(pass);
	}

	public void clickOnLoginButton() {
	submit_button.click();
	}
}
