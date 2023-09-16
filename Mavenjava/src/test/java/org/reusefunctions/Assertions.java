/**
 * 
 */
package org.reusefunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author Bharath this method is used for the Assertions
 */
public class Assertions {

	private WebDriver driver;

	public Assertions(WebDriver driver) {
		this.driver = driver;

	}

	// method to display wheather Element is displayed or not
	public boolean isElementDisplayed(WebElement element) {

		try {
			return element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// method to display if Element is enabled or not
	public boolean isElementenabled(WebElement element) {
		try {
			return element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/*
	 * public WebElement isElementclciked(WebElement element) { try { return
	 * element.click(); }catch(Exception e){ return ((Object)
	 * element).isnotclicked();
	 * 
	 * }
	 */
	// method to display if element is Selected or not
	public boolean isSelected(WebElement element) {
		try {
			return element.isSelected();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
		
	// Method to display if element is compared with actual and Expected
		
	public boolean compareElementText(String errortext, Object object) {
		try{
			String actualtext= errortext.trim();
			return actualtext.equals(object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean compareStringText(String actualText, String expectedText) {
		try{
			String actualtext= actualText.trim();
			return actualtext.equals(expectedText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	/*
	 * public void clickElement(By locator){ try { WebElement element =
	 * wait.until(ExpectedConditions.elementToBeClickable(locator));
	 * element.click(); System.out.println("Clicked element with " +
	 * locator.toString()); } catch (Exception e) {
	 * 
	 * return false; System.out.println("Failed to click element with " +
	 * locator.toString() + ". Error: " + e.getMessage()); }
	 */

}

