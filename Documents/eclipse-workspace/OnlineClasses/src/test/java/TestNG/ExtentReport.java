package TestNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	@Test
	public void loginTest() throws Exception {
		Assert.assertEquals("akhil", "akhil");
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("./Report/extenthtmlreport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		ExtentTest ext_test = extent.createTest("LoginTest" , "Description");
		ext_test.log(Status.INFO , "Login to Facebook");
		ext_test.log(Status.PASS , "Login Success");
		
		ExtentTest ext_test1 = extent.createTest("LogOutTest" , "Description");
		ext_test.log(Status.INFO , "Logout to Facebook");
		ext_test.log(Status.FAIL , "Logout failed");
		
		ext_test.fail("logout failed", MediaEntityBuilder.createScreenCaptureFromPath("E:\\20200308_180642_1.jpg").build());
		
		extent.flush();
		
	}
}
