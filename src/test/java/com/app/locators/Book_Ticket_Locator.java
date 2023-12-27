package com.app.locators;


import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.org.baseclass.Baseclass;

public class Book_Ticket_Locator extends Homepage_locators{

	public static WebElement popup_email() {
		return Baseclass.findElementById("email");
		
	}
	public static WebElement get_deal() {
		return Baseclass.findElementBy_xpath("//*[text()=\"Get Deals\"]");
		
	}
	public static WebElement click_flight() {
		return Baseclass.findElementBy_xpath("//*[text()=\"View Flight Options\"]");

	}
//	public static WebElement arrow_loctor() {
//		return Baseclass.explicitlyWait(50, By.xpath("//*[@d=\"M4.76,6.78l7.3,7.3,7.29-7.3a1.72,1.72,0,1,1,2.43,2.44l-8.51,8.51a1.73,1.73,0,0,1-.72.43l-.16,0a1.84,1.84,0,0,1-.33,0,1.75,1.75,0,0,1-1.22-.5L2.33,9.22A1.72,1.72,0,0,1,4.76,6.78Z\"]"));
//				//Baseclass.findElementBy_xpath();
//
//	}
	public static WebElement category() {
		return Baseclass.findElementBy_xpath("//*[text()=\"Stops & Departure\"]");
		 
				
					
	}
	public static WebElement price_loc() {
		return Baseclass.explicitlyWait(50, By.xpath("//*[text()=\"Price\"]"));
		
	}
	
	public static WebElement pickup() {
		return Baseclass.findElementBy_xpath("(//*[text()=\"$307\"])[3]");
	}
	public static WebElement drop() {
		return Baseclass.findElementBy_xpath("(//*[text()=\"$307\"])[3]");
				//Baseclass.explicitlyWait(50, By.xpath("(//*[text()=\"roundtrip\"])[1]"));				
	}
}
