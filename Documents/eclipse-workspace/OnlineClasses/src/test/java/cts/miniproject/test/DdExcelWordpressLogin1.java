	
	
package cts.miniproject.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cts.miniproject.utility.*;



public class DdExcelWordpressLogin1 {
	PageFactory_Browser_KD browserfactory=new PageFactory_Browser_KD();
	WebDriver driver;
	@Test(dataProvider="wordpress")
	public void loginToWordpress(String username,String password) throws Exception {
		ConfigReader insert=new ConfigReader();

		WebDriver driver=browserfactory.startBrowser("chrome",insert.getwordpressURL() );

		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();


		Assert.assertEquals(insert.getwordpressLoginURL(), driver.getCurrentUrl());

		System.out.println(driver.getCurrentUrl());
		System.out.println("User is able to login sucessfully");
	}
@AfterMethod
public void tearDown() {
driver.quit();
}

@DataProvider(name="wordpress")
public Object[][] passData() {

ExcelDataConfig configExcel=new ExcelDataConfig("C:\\Users\\akhildarling\\eclipse-workspace\\OnlineClasses\\src\\test\\resources\\Excel\\TestData.xlsx");
int noofrows=configExcel.getRowCount(0);
Object[][] data=new Object[noofrows][2];

for(int i=0;i<noofrows; i++) {
data[i][0]=configExcel.getData(0, i, 0);
data[i][1]=configExcel.getData(0, i, 1);
}

return data;
}

}