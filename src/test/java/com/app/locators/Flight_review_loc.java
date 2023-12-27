package com.app.locators;

import org.openqa.selenium.WebElement;

import com.org.baseclass.Baseclass;

public class Flight_review_loc extends Book_Ticket_Locator {

	public static WebElement review_loc() {
		return Baseclass.findElementBy_xpath("//*[text()=\"Continue\"]");			
	}
}
