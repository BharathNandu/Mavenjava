package org.Test;

import org.functions.Webfunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Updateddropdown {
	 Webfunctions obj1;
	 

	WebDriver driver;

	@BeforeTest
	public void Browsersetup() {

		String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

	}

	@Test

	public void updateddropdown() throws Exception {
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hrefIncAdt")).click();
		obj1 = new Webfunctions(driver);
		
	}

}
