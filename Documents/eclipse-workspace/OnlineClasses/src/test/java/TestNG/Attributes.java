package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attributes {
	@Test
	public void Test1() {
		Assert.assertEquals("ab", "expected");
	}
	@Test
	public void Test2() {
		Assert.assertEquals("123", "123");
	}
	@Test(priority = 1)
	public void Test3() {
		Assert.assertEquals("abc", "abc");
	}
}
