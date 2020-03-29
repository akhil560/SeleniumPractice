package cts.miniproject.test;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cts.miniproject.utility.ConfigReader;
import cts.miniproject.utility.Screenshot;

public class ExtentReportScreenshot {
	ConfigReader cr = new ConfigReader();
	WebDriver driver;
	ExtentReports extent;
	ExtentTest ext_test;
	
	@BeforeMethod
	public void setupReport() {
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("./Report/extenthtmlreport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		ext_test = extent.createTest("LoginTest" , "Description");
		
	}
	
	@AfterMethod
	public void tearDownReport(ITestResult result) throws Exception {
		if (result.getStatus()==ITestResult.FAILURE) {
			Screenshot sc = new Screenshot();
			String path = sc.getScreenshot(driver);
			
			ext_test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			
		}
		extent.flush();
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", cr.getchromepath());
		driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("akhil"));
	}
}
