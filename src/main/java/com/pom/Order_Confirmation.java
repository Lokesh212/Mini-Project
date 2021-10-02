package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation {
	
	public WebDriver driver;
	
	@FindBy(className="bankwire")
	private WebElement payment_Confirmation;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirm_order;

	public Order_Confirmation(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPayment_Confirmation() {
		return payment_Confirmation;
	}

	public WebElement getConfirm_order() {
		return confirm_order;
	}

}
