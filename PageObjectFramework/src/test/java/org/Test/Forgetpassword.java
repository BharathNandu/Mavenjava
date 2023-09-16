package org.Test;

import org.Objects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Forgetpassword {
	
	WebDriver driver;
	LoginPage obj1;
	@BeforeTest
	public void Browsersetup()
	{
		
		String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void forgetpassword(WebDriver driver) throws Exception
	{
		obj1 = new LoginPage(driver);
		obj1.enterUsername("Bharath");
		Thread.sleep(2000);
		//System.out.println("****");
		obj1.enterPassword("Test@1234");
		//System.out.println("****");
		obj1.checkboxcheck();
		obj1.clickForget_your_password();
	}
	@AfterMethod
	public void tearDown() {
	    // Close the WebDriver session when done
	    if (driver != null) {
	        driver.quit();
	    }
	}
	

}
