package org.rahulsheety;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsTest {

	@Test
	public void OpenBrowser() throws Exception {

		WebDriver driver = new ChromeDriver();
		String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		String URL = "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(URL);
		driver.findElement(By.id("inputUsername")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@type ='submit']")).click();
		Thread.sleep(5000);
		String errortext = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errortext);

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("abcd");
	}

}
