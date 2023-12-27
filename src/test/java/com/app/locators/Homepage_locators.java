package com.app.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.Baseclass;

public class Homepage_locators extends Baseclass {
	
	public static WebElement fromloc() {
		return Baseclass.explicitlyWait(50, By.id("from1"));
				//Baseclass.findElementById("from1") ;	
	}
	public static WebElement toloc() {
		return Baseclass.explicitlyWait(50, By.id("to1"));
				//Baseclass.findElementById("to1") ;	
	}
	public static WebElement date_Departuer() {
		return Baseclass.findElementBy_xpath("(//*[text()=\"28\"])[2]") ;	
	}
	public static WebElement date_Return() {
		return Baseclass.findElementBy_xpath("(//*[text()=\"30\"])[2]") ;	
	}
	public static WebElement adultmember() {
		return Baseclass.findElementBy_xpath("(//button[@data-trav-type=\"adults\"])[2]");	
	}
	public static WebElement childeren_member() {
		return Baseclass.findElementBy_xpath("(//button[@data-trav-type=\"children\"])[2]");	
	}
	public static WebElement seniormember() {
		return Baseclass.findElementBy_xpath("(//button[@data-trav-type=\"seniors\"])[2]");	
	}
	public static WebElement select_coach() {
		 WebElement findElementById = Baseclass.findElementById("cabin");
		return findElementById;
	}
	public static WebElement submit() {
		return Baseclass.explicitlyWait(50, By.xpath("(//button[@type=\"submit\"])[1]"));
				//Baseclass.findElementBy_xpath("(//button[@type=\"submit\"])[1]");	
	}
	
	
	
//	public static WebElement windowhandle() {
//		return Baseclass.windowhandle(element);	
//	}
}
