package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement accept_Terms;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement checkout;

	public Shipping(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccept_Terms() {
		return accept_Terms;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
}
