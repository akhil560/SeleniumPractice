package TestNG;

import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void test11() {
		System.out.println("test 11 :" +Thread.currentThread().getId());
	}
	
	@Test
	public void test12() {
		System.out.println("test 12 :" +Thread.currentThread().getId());
	}
	
	@Test
	public void test13() {
		System.out.println("test 13 :" +Thread.currentThread().getId());
	}
}
