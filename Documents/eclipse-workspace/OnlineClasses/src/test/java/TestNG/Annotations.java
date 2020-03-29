package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	@AfterClass
	public void afterclass() {
		System.out.println("executed after class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("executed before method");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("executed before class");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("executed after method");
	}
	
	@Test
	public void test1() {
		System.out.println("executed test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("executed test 2");
	}
}
