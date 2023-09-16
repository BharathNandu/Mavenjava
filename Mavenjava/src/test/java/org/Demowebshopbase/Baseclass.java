package org.Demowebshopbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Baseclass {
	
	WebDriver driver ;
	@BeforeTest
	public void OpenBrowser()
	{
		String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		
	}
	// method to display wheather Element is displayed or not


}
