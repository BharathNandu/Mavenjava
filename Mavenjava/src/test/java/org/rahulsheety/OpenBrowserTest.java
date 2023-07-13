package org.rahulsheety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.*;

public class OpenBrowserTest {

	WebDriver driver =new ChromeDriver();
	@BeforeTest
	public  void OpenBrowser() {
		// TODO Auto-generated method stub
		
		String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		String current = driver.getCurrentUrl();
		Assert.assertEquals(title,"GreenKart - veg and fruits kart");
		
		
	}
	
	//validation of the the empty cart

	@Test(enabled = true)
	public void emptycart() throws Exception {
		Thread.sleep(6000);
		WebElement AddtoCart = driver.findElement(By.xpath("//*[@alt='Cart']"));
		AddtoCart.click();
		WebElement Emptycart =driver.findElement(By.xpath("//*[@class=\"empty-cart\"]/h2"));
		String Actual=Emptycart.getText();
		System.out.println(Actual);
		String Expected ="You cart is empty!";
		Assert.assertEquals(Actual, Expected);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
}
