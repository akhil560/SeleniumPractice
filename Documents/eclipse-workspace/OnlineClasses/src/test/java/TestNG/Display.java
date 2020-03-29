package TestNG;

import org.testng.annotations.Test;

public class Display {
	
	//attribute groups
	
	@Test (groups = {"vendor"})
	public void vendor1() {
		System.out.println("vendor 1");
	}
	
	@Test (groups = {"vendor"})
	public void vendor2() {
		System.out.println("vendor 2");
	}
	
	@Test (groups = {"vendor"})
	public void vendor3() {
		System.out.println("vendor 3");
	}
	
	@Test (groups = {"customer"})
	public void customer1() {
		System.out.println("customer 1");
	}
	
	@Test (groups = {"customer"})
	public void customer2() {
		System.out.println("customer 2");
	}
	
	@Test (groups = {"customer"})
	public void customer3() {
		System.out.println("customer 3");
	}
	
	@Test (groups = {"vendor","customer"})
	public void admin1() {
		System.out.println("admin 1");
	}
	
	@Test (groups = {"vendor", "customer"})
	public void admin2() {
		System.out.println("admin 2");
	}

}
