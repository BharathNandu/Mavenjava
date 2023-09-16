package org.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Spicejet {
	

	
	private WebDriver driver = null;
	
	
	public Spicejet(WebDriver driver) {
		this.driver =driver;
		
	}
		
	//method to interact with the webelement
	public static By dropdown =By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']");
	
	public void  selectdropdown() {
		driver.findElement(dropdown).isDisplayed();
		//return ;
		
	}
	
}

