package com.org.stepdefinition;

import com.org.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before
	public void browserlauch() {
		Baseclass.Browserlauch();
		Baseclass.getUrl("https://www.cheapair.com/");
	}
	
	@After
	public void screenshot() {
		Baseclass.takescreenshot();
	}

}
