package org.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaticDropdown {

	

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

	public void staticdropdown() {

		WebElement currency = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));

		Select dropdown = new Select(currency);
		// driver selects the index select
		dropdown.selectByIndex(0);
		//System.out.println(dropdown.getFirstSelectedOption());
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println("******");
		dropdown.selectByValue("AED");

	}
	
}
