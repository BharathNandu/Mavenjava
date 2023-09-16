package org.testpacks;

import org.Objects.Spicejet;
import org.Test.BaseClass;
import org.functions.Webfunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Verify the user is able to select the dropdown based on the visible text

public class TC1   {
	
	WebDriver driver;
	public Webfunctions obj1;
	public BaseClass baseclass;
	public Spicejet spicejet;
	
	@Test
	public void staticdropdown() throws Exception {
		spicejet = new Spicejet(driver);
		baseclass = new BaseClass();
		obj1 = new 	Webfunctions(driver);
		//WebElement drop =  spicejet.selectdropdown(driver);
		obj1.staticdropdownbyText(drop, "AED" );
		
	
	

}
}
