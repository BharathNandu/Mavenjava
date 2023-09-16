package org.Commons;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebFunctions {
	WebDriver driver;
	public WebFunctions(WebDriver driver) {
		this.driver =driver;
		
	}
	
	// this method is used to select the drop down of static 
	public void staticdropdown(WebElement element,String Name) {
		
		Select dropdown = new Select(element);
		dropdown.selectByValue(Name);
		
		
	
	}

}
