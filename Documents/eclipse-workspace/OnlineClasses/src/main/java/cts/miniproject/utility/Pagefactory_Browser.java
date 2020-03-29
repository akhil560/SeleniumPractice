package cts.miniproject.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pagefactory_Browser{
	public WebDriver driver;
	public WebDriver startBrowser(String browserName,String url) {
	if(browserName.equalsIgnoreCase("chrome")) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\OnlineClasses\\src\\test\\resources\\binaries\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\OnlineClasses\\src\\test\\resources\\binaries\\geckodriver.exe");
	driver=new FirefoxDriver();
	}

	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	}
}
