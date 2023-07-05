package org.rahulsheety;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginDemoTest {
	
	WebDriver driver =new ChromeDriver();
	@Test
	public  void OpenBrowser() {
		// TODO Auto-generated method stub
		
		driver.manage().deleteAllCookies();
		String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		String URL = "https://demowebshop.tricentis.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		String current = driver.getCurrentUrl();
		Assert.assertEquals(title,"Demo Web Shop");
		
		WebElement Login =driver.findElement(By.linkText("Log in"));
		Login.click();
		WebElement Shoppingcart = driver.findElement(By.partialLinkText("Shopping cart"));
		Shoppingcart.click();
		
		String currentURL =driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String currentPageSource = driver.getPageSource();
		System.out.println(currentPageSource);
		
		driver.navigate().back();
		currentURL =driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "https://demowebshop.tricentis.com/login");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		// abcd@test.com invalid creds
		// qwe@test.com valid creds
		WebElement Email =driver.findElement(By.xpath("//*[@id='Email']"));
		Email.sendKeys("abcd@test.com");
		WebElement Password = driver.findElement(By.xpath("//*[@name ='Password']"));
		Password.sendKeys("Test@1234");
		WebElement Login2 =driver.findElement(By.xpath("//*[@type='submit']"));
		Login2.click();
		Alert alert =driver.switchTo().alert();
		alert.accept();
		Login2.click();
		String ExpectedErrorText = "Login was unsuccessful. Please correct the errors and try again.";
		WebElement Errortext =driver.findElement(By.xpath("//*[@xpath='1']"));
		Errortext.getText();
		Assert.assertEquals(Errortext, ExpectedErrorText);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
