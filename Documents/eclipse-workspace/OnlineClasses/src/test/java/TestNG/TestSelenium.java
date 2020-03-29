package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSelenium {
	@Test
	public void testconfig() throws Exception {
		File src = new File("./Configuration/Config.property");
		FileInputStream fis = new FileInputStream(src);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String chromepath = prop.getProperty("chromeDriver");
		
		System.out.println(chromepath);
	}
}
