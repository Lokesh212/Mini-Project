package com.Automation_Practice;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart;
import com.pom.Address_Confirmation;
import com.pom.Dress_Selection;
import com.pom.Home_Page;
import com.pom.Order_Confirmation;
import com.pom.Order_Summary;
import com.pom.Shipping;
import com.pom.Signin_Page;
import com.sdp.Page_Object_Manager;

import helper.File_Reader_Manager;

public class Mini_Project extends Base_Class {

	public static WebDriver driver = getBrowser("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		geturl(url);
		sleep(3000);

		clickOnElement(pom.getHomePage().getSigin_Btn());
		sleep(2000);

		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
		inputvalues(pom.getSigninPage().getUsername(), username);

		// String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();

		String password = particular_Data_from_Excel(
				"C:\\Users\\DELL\\eclipse-workspace\\Automation_Practice\\Test Data\\Automation Practice-TestCases.xlsx",
				7, 5);
		inputvalues(pom.getSigninPage().getPassword(), password);
		clickOnElement(pom.getSigninPage().getSignin_Button());
		sleep(2000);

		mouseActions(pom.getDressSelection().getDresses(), "moveToElement");
		clickOnElement(pom.getDressSelection().getEvening_Dresses());
		sleep(2000);

		mouseActions(pom.getCart().getImage(), "moveToElement");
		clickOnElement(pom.getCart().getAddToCart());
		sleep(2000);
		clickOnElement(pom.getCart().getCheckout1());
		sleep(2000);

		clickOnElement(pom.getOrderSummary().getAddQuantity());
		clickOnElement(pom.getOrderSummary().getAddQuantity());
		clickOnElement(pom.getOrderSummary().getCheckout2());
		sleep(2000);

		clickOnElement(pom.getAccountConfirmation().getAddress_Checkout());
		sleep(2000);

		clickOnElement(pom.getShipping().getAccept_Terms());
		clickOnElement(pom.getShipping().getCheckout());
		sleep(2000);

		clickOnElement(pom.getOrderConfirmation().getPayment_Confirmation());
		clickOnElement(pom.getOrderConfirmation().getConfirm_order());
		sleep(3000);
		close();
		System.exit(0);

	}

}
