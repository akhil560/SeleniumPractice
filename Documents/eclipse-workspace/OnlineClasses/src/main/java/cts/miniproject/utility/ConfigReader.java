package cts.miniproject.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	
	public ConfigReader() {
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);
			
			prop = new Properties();
			prop.load(fis);
		    } 
		catch (Exception e) {
			System.out.println(e.getMessage());
			} 
	}	
		
	public String getchromepath() {
		
		String path = prop.getProperty("chromeDriver");
		return path;
	}
	
public String getfirefoxpath() {
		
		String path = prop.getProperty("firefoxDriver");
		return path;
	}

	public String geturl() {
		String url = prop.getProperty("URL");
		return url;
	}
	
	public String getPageFactoryurl() {
		String url = prop.getProperty("PageFactory_URL");
		return url;
	}
	
	public String getPageFactoryloginsuccessURL() {
		String url = prop.getProperty("PageFactoryloginsuccessURL");
		return url;
	}

	public String getwordpressURL() {
		return prop.getProperty("WordPressURl");
	}

	public String getwordpressLoginURL() {
		return prop.getProperty("WordPressLoginURL");
		}
	

}
