package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class EdgeBrowser {

	public static void main(String[] args) {		
				WebDriver driver =new EdgeDriver();
				
				String path= "C:\\Users\\Bharath\\Rahulshetty\\Learning\\src\\test\\resources\\msedgedriver.exe";
				System.setProperty("webdriver.edgedriver.driver", path);
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				String title = driver.getTitle();
				String current = driver.getCurrentUrl();
				
				driver.close();
				
	

	}

}
