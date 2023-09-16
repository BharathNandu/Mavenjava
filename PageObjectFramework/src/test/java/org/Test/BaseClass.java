package org.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

	private static WebDriver driver;

	@BeforeTest
	public static void Browsersetup(String browsername) {

		if (browsername.equalsIgnoreCase("chrome"))  {
			String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);

		} else if (browsername.equalsIgnoreCase("edgebrowser")) {
			driver = new EdgeDriver();
			String path = "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\msedgedriver.exe";
			System.setProperty("webdriver.edgedriver.driver", path);
		} else {
			System.out.println("Browser is not invoked");
		}

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println("******Browser is callled once");
	}

	@AfterMethod
	public void teardownAfterTest() {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
