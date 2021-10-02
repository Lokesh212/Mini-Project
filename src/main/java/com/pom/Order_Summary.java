package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Add']")
	private WebElement addQuantity;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout2;

	public Order_Summary(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddQuantity() {
		return addQuantity;
	}

	public WebElement getCheckout2() {
		return checkout2;
	}

}
