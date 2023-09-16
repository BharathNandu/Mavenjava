/**
 * 
 */
package org.reusefunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Bharath resuable code for the browsersteup
 */
public class browserSetup {

	static WebDriver driver;

	public browserSetup(String browser, String urltopen) {
		// TODO Auto-generated constructor stub
	}

	public static WebDriver openULR(String url,String browser)
	{
		switch(browser.toLowerCase()) {
		case "chrome":
		{
			String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			WebDriver driver =new ChromeDriver();
			break;
		}
		case "edgebrowser":
		{
			String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\msedgedriver.exe";
			System.setProperty("webdriver.edgedriver.driver", path);
			WebDriver driver =new EdgeDriver();
			break;
		}
		case "firefox":
		{
			String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			WebDriver driver =new FirefoxDriver();
			break;
		}
		default:
		{
			throw new IllegalArgumentException("Invalid browser specified. Supported options are 'chrome' and 'firefox'.");
	}
	}
		driver.get(url);
		return driver;

	}
}


