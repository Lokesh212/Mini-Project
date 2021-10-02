package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	
	public WebDriver driver;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement image;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout1;

	public AddToCart(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCheckout1() {
		return checkout1;
	}
	

}
