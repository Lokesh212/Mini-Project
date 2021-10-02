package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Confirmation {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement address_Checkout;

	public Address_Confirmation(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);		
	}

	public WebElement getAddress_Checkout() {
		return address_Checkout;
	}

}
