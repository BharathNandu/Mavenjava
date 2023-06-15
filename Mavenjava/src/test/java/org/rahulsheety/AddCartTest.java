package org.rahulsheety;
import org.openqa.selenium.By;
import org.testng.annotations.*;


public class AddCartTest extends OpenBrowserTest {
	
	
	@Test
	public void AddCart() {
		
		OpenBrowserTest browser =new OpenBrowserTest();
		browser.OpenBrowser();
		browser.closeBrowser();
		
		driver.findElement(By.className(null));
	
		
		
	}

}
