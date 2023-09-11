package org.rahulsheety;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulTest {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

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
		String inboxtext ="";
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("//input[placeholder='Email']")).sendKeys("bhh@rsa.com");
		driver.findElement(By.xpath("//*[@placeholder='Phone Number']")).getAttribute(inboxtext);
		System.out.println(inboxtext);
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567");
		driver.findElement(By.linkText("Reset Login")).click();
		
		String tempPassword =driver.findElement(By.xpath("//form/p[1]")).getText();
		System.out.println(tempPassword);
	}

}
