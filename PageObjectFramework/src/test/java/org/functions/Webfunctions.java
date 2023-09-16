package org.functions;

import java.util.List;

import org.Objects.Spicejet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Webfunctions {

	WebDriver driver;

	public Spicejet spicejet;

	// constructor initialization

	public Webfunctions(WebDriver driver) {
		this.driver = driver;

	}

	// select the option if it is not selected by value

	public void staticdropdownbyText(WebElement element, String Name) {

		Select dropdown = new Select(element);
		dropdown.selectByValue(Name);

	}

	public void staticdropdownbyindex(WebElement element, int index) {

		Select dropdown = new Select(element);
		dropdown.selectByIndex(index);

	}

	public void staticdropdownbyvalue(WebElement element, String Name) {

		Select dropdown = new Select(element);
		dropdown.selectByValue(Name);

	}

}
