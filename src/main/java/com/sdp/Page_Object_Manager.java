package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.AddToCart;
import com.pom.Address_Confirmation;
import com.pom.Dress_Selection;
import com.pom.Home_Page;
import com.pom.Order_Confirmation;
import com.pom.Order_Summary;
import com.pom.Shipping;
import com.pom.Signin_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Home_Page hp;
	private Signin_Page sp;
	private Dress_Selection ds;
	private AddToCart cart;
	private Order_Summary os;
	private Address_Confirmation ac;
	private Shipping sh;
	private Order_Confirmation confirm;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	public Home_Page getHomePage() {
		hp = new Home_Page(driver);
		return hp;
	}
	public Signin_Page getSigninPage() {
		sp = new Signin_Page(driver);
		return sp;
	}
	public Dress_Selection getDressSelection() {
		ds = new Dress_Selection(driver);
		return ds;
	}
	public AddToCart getCart() {
		cart = new AddToCart(driver);
		return cart;
		
	}
	public Order_Summary getOrderSummary() {
		os = new Order_Summary(driver);
		return os;
	}
	public Address_Confirmation getAccountConfirmation() {
		ac = new Address_Confirmation(driver);
		return ac;
	}
	public Shipping getShipping() {
		sh = new Shipping(driver);
		return sh;
	}
	public Order_Confirmation getOrderConfirmation() {
		confirm = new Order_Confirmation(driver);
		return confirm;
	}
	
}
