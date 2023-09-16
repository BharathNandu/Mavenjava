package org.DemowebshopTestcases;

import org.Demowebshop.*;
import org.Demowebshopbase.Baseclass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class HomePageTest extends Baseclass {
	
	WebDriver driver;
	//RegisterPage objectrepo;

	@Test
	public void ResisterClick()
	{
		driver.get("https://demowebshop.tricentis.com/");
		Homepage landingpage = new Homepage(driver);
		landingpage.clickRegisterlink();		
		landingpage.clickLoginlink();
		//landingpage.Register_link;
		landingpage.isElementDisplayed(landingpage.Register_link);
		
		
		
	}
	
	

}
