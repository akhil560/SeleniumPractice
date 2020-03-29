package JUnit;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;

public class HandligJUnit {
	@Test
	public void ab1() {
		Assert.assertEquals("akhil", "akhil");
	}

	@Test
	public void ab2() {
		Assert.assertEquals("akhil", "Akhil");
	}
	
	@Ignore
	public void ab3() {
		Assert.assertEquals("akhil", "sai");
	}
}
