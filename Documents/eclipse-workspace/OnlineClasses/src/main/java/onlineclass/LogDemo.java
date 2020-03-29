package onlineclass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhildarling\\Documents\\eclipse-workspace\\SeleniumCaseStudy1\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		logger.info("chrome opened");
		driver.get("https://facebook.com");
		
		logger.info("Navigated to facebook");
		
		driver.close();
		
	}
}
