package org.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Spicejet {
	

	
	public WebDriver driver ;
	
	
	public Spicejet(WebDriver driver) {
		this.driver =driver;
		
	}
	
	@FindBy(xpath="//*[@id='ctl00_mainContent_DropDownListCurrency']") 
	public WebElement dropdown;
	//method to interact with the webelement
	
	
}

