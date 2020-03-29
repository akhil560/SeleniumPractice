package JUnit;

import org.junit.Test;
import org.testng.Assert;

public class setupANDteardown {
	protected int a,b;
	
	public void setUp() {
		a=5;b=3;
	}
	
	@Test
	public void add() {
		int c=a+b;
		System.out.println(a+" "+b);
		Assert.assertEquals(c, 8);
	}
	
	public void tearDown() {
		System.out.println("after method");
	}
	
}
