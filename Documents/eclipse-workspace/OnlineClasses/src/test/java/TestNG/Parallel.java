package TestNG;

import org.testng.annotations.Test;

public class Parallel {

	@Test
	public void test1() {
		System.out.println("test 1 :" +Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("test 2 :" +Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("test 3 :" +Thread.currentThread().getId());
	}
}
