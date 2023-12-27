package com.org.runner;

import com.org.baseclass.Baseclass;
import com.org.execution.HomePage_execution;

public class Exec {

	 public static void main(String[] args) throws Exception {
		Baseclass.Browserlauch();
		Baseclass.getUrl("https://www.cheapair.com/");
		HomePage_execution.from_location();
		Thread.sleep(2000);
		HomePage_execution.to_location();
		Thread.sleep(2000);
		HomePage_execution.departure_Date();
		HomePage_execution.return_Date();
		HomePage_execution.adult();
		HomePage_execution.senior();
		HomePage_execution.children();
		HomePage_execution.submit_data();
		 Baseclass.findElementById("email").sendKeys("venkatesh@gamil.com");
		Baseclass.findElementBy_xpath("//*[text()=\"Get Deals\"]").click();
	}
}
