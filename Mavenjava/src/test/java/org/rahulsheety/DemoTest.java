package org.rahulsheety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {
	

	WebDriver driver =new ChromeDriver();
	@Test
	public  void OpenBrowser() {
		// TODO Auto-generated method stub
		
		String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		String URL = "https://demowebshop.tricentis.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		String current = driver.getCurrentUrl();
		Assert.assertEquals(title,"Demo Web Shop");
		
		WebElement Register =driver.findElement(By.linkText("Register"));
		
		Register.click();
		String title2 = driver.getTitle();
		Assert.assertEquals(title2,"Demo Web Shop. Register");
		
		WebElement Firstname =driver.findElement(By.id("FirstName"));
		Firstname.sendKeys("Bharath");
		
		WebElement LastName = driver.findElement(By.id("LastName"));
		LastName.sendKeys("Test");
		
		WebElement Email = driver.findElement(By.id("Email"));
		Email.sendKeys("abcd@test.com");
		
		WebElement Password =driver.findElement(By.id("Password"));
		Password.sendKeys("Test@1234");
		
		WebElement ConfirmPassword =driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassword.sendKeys("Test@1234");
		
		WebElement Register1 =driver.findElement(By.id("register-button"));
		Register1.click();
		
		String ExpectedErrortext ="The specified email already exists";
		String ActualErrortext =driver.findElement(By.xpath("//*[@class='message-error']/div/ul/li")).getText();
		
		Assert.assertEquals(ActualErrortext, ExpectedErrortext);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
