package org.webfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	@Test
	public void staticdropdown() throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement currency = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		
	}

}
