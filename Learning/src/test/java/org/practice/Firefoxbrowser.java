package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefoxbrowser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		// invoking FireFox Browser
		//String path ="C:\\Users\\Bharath\\Rahulshetty\\Learning\\src\\test\\resources\\geckodriver.exe";
		
		try {
			//System.setProperty("webdriver.gecko.driver", path);
			Thread.sleep(1000);
			driver.get("https://www.geeksforgeeks.org/");
			String tittle =driver.getTitle();
			System.out.println(tittle);
			driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Caught message " + e.getMessage());
		    driver.close();  
		}
		
		

	}

}


