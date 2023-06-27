package org.rahulsheety;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;


public class IncognitoTest {
	
	public static void main(String[] args)
	{
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver = new ChromeDriver();
	}
	

	

}
