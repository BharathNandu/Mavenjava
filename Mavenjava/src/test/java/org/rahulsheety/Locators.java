package org.rahulsheety;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.reusefunctions.Assertions;
import org.testng.annotations.Test;

public class Locators extends Assertions {

	public Locators(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void OpenBrowser()  throws Exception {
		String emailid ="abcd@gmail.com";
		String password ="Test@1234";
		WebDriver driver = new ChromeDriver();
		String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		String URL = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(URL);
		driver.findElement(By.id("inputUsername")).sendKeys(emailid);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type ='submit']")).click();
		Thread.sleep(5000);
		String errortext = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errortext);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("abcd");
	}

}
