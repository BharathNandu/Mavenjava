package org.rahulsheety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelintroTest {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke the browser
		
		WebDriver driver =new ChromeDriver();
		String path= "C:\\Users\\Bharath\\Rahulshetty\\Mavenjava\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver.get("https://demowebshop.tricentis.com/");
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
		
		
		
		
	}

}
