package com.org.execution;


import com.app.locators.Book_Ticket_Locator;
import com.app.locators.Homepage_locators;
import com.app.locators.Purchase_loctor;
import com.org.baseclass.Baseclass;

public class HomePage_execution extends Purchase_loctor  {
	
	public static void from_location(String user) throws Exception {
		Thread.sleep(3000);
		Baseclass.senddata(Homepage_locators.fromloc(), user);
	}
	public static void to_location(String pass) throws Exception {
		Baseclass.senddata(Homepage_locators.toloc(), pass);
		Thread.sleep(3000);
	}
	public static void departure_Date() {
		
		Baseclass.click(Homepage_locators.date_Departuer());
	}
	public static void return_Date() {
		Baseclass.waits();
		Baseclass.click(Homepage_locators.date_Return());
	}
	public static void adult() throws Exception {
		Thread.sleep(3000);
		Baseclass.click(Homepage_locators.adultmember());
	}
	public static void children() {
		Baseclass.click(Homepage_locators.childeren_member());
	}
	public static void senior() {
		Baseclass.click(Homepage_locators.seniormember());
	}
	public static void select_coach(String select) {
		Baseclass.dropdown(Homepage_locators.select_coach(), select);
	}
	public static void submit_data() throws Exception {
		Thread.sleep(3000);
		Baseclass.click(Homepage_locators.submit());
	}
}
