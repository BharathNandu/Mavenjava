package org.rahulsheety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirefoxTest {
	
	WebDriver driver =new FirefoxDriver();
	@Test
	public  void OpenBrowser() {
		// TODO Auto-generated method stub
		
		String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		String current = driver.getCurrentUrl();
		Assert.assertEquals(title,"GreenKart - veg and fruits kart");
		
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
