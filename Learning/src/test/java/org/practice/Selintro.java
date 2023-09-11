package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoking Chrome Browser
		String path ="C:\\Users\\Bharath\\Rahulshetty\\Learning\\src\\test\\resources\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		String tittle =driver.getTitle();
		System.out.println(tittle);
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
