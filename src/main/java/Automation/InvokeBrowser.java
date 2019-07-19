package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvokeBrowser {

	WebDriver driver;
	
	@Test
	WebDriver InvokeBrowser() throws IOException
	{
		Properties pro = new Properties();
		FileInputStream fs = new FileInputStream("C:\\Users\\vaibhav.vijay.hatge\\Desktop\\Testing\\Estimator\\resources\\data.properties");
		pro.load(fs);
		if(pro.getProperty("Browser").equals("Chrome")) 
		{		
		System.setProperty("webdriver.chrome.driver", "C:/Users/vaibhav.vijay.hatge/Desktop/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		}
		if(pro.getProperty("Browser").equals("IE")) 
		{
			System.setProperty("webdriver.edge.driver", "C:/Users/vaibhav.vijay.hatge/Desktop/Testing/msedgedriver.exe");
			driver = new EdgeDriver();	
		}		
		
		String URL = pro.getProperty("URL");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		
		return driver;		
		
	}


}
