package org.webfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownpractise {
	
	//staticdropdown practise
	@Test
	public void staticdropdown() throws Exception
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();	
		}

	
	
		
	}
	

}
