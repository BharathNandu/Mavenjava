/**
 * 
 */
package org.Demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Bharath
 * this page consists of Page object related to Homepage
 */
public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) 
	{
	this.driver = driver;	
	}
	
	//By Register_link = By.linkText("Register");
	@FindBy(linkText=("Register"))		
	public WebElement Register_link;
	By login_link =By.linkText("Log in");
	
	//topview xpaths
	By Books_link =By.xpath("//*[@class='top-menu']/li[1]");
	By Computers_link =By.xpath("//*[@class='top-menu']/li[2]");
	public void clickRegisterlink()
	{
		Register_link.click();
	}
	
	public void clickLoginlink()
	{
		driver.findElement(login_link).click();
	}
	public boolean isElementDisplayed(WebElement element) {

		try {
			return element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
