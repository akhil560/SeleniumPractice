package cts.miniproject.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageFactory_Browser_KD {
	ConfigReader cr1 =new ConfigReader();
	public WebDriver driver;
	public WebDriver startBrowser(String browserName,String url) {
	if(browserName.equalsIgnoreCase("chrome")) {

	System.setProperty("webdriver.chrome.driver", cr1.getchromepath());
	driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", cr1.getfirefoxpath());
	driver=new FirefoxDriver();
	}

	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}
}
