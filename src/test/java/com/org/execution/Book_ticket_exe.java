package com.org.execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.app.locators.Book_Ticket_Locator;
import com.org.baseclass.Baseclass;

public class Book_ticket_exe extends HomePage_execution {
	public static void next_page() {
		Baseclass.window();
	}
	
	public static void popup() {
		Baseclass.senddata(Book_Ticket_Locator.popup_email(), "venkatesh@gmail.com");
	}
	
	public static void GetDeal() {
		Baseclass.click(Book_Ticket_Locator.get_deal());
	}
	public static void flight() {
		Baseclass.click(Book_Ticket_Locator.click_flight());
	}
	public static void arrow() throws Exception {
		Baseclass.waits();
		Baseclass.click(Book_Ticket_Locator.category());
		Robot r=new Robot();
		    r.keyPress(KeyEvent.VK_DOWN);
		    r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Baseclass.click(Book_Ticket_Locator.price_loc());
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
	}
//	public static void price_click() {
//		Baseclass.click(Book_Ticket_Locator.category());
//	}
	public static void departure() {
		Baseclass.click(Book_Ticket_Locator.pickup());
	}
	public static void return_flight() {
		driver.navigate().refresh();
		Baseclass.click(Book_Ticket_Locator.drop());
	}

}
