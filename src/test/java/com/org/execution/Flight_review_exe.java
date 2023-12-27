package com.org.execution;

import com.app.locators.Flight_review_loc;
import com.org.baseclass.Baseclass;

public class Flight_review_exe extends Book_ticket_exe {
	public static void flight_review_continue() {
		Baseclass.click(Flight_review_loc.review_loc());
	}

}
