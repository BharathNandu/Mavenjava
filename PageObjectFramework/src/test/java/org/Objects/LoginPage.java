package org.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver = null;
	
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	By Username_editbox = By.id("inputUsername");
	By Password_editbox = By.name("inputPassword");
	By login_button = By.xpath("//*[contains(@type,'submit')]");
	By checkbox1 =By.id("chkboxOne");
	By checkbox2 =By.id("chkboxTwo");
	By Forget_your_password_link = By.tagName("Forgot your password?");
	
	public void clickSignin()
	{
		driver.findElement(login_button).click();
	}
	public void enterUsername(String username)
	{
		driver.findElement(Username_editbox).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		
		driver.findElement(Password_editbox).sendKeys(password);
	}
	
	public void checkboxcheck()
	{
		driver.findElement(checkbox1).click();
		driver.findElement(checkbox2).click();
	}
	public void clickForget_your_password()
	{
		driver.findElement(Forget_your_password_link).click();
	}
}
