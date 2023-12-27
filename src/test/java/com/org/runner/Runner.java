package com.org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\"
		+ "Oct_cucumber_cheapair\\src\\test\\java\\com\\org\\feature",glue="com.org.stepdefinition",
		dryRun=false,
		publish=true,
		monochrome=true
		//plugin= {"pretty","html:target/cucumber_reports"}
		)
public class Runner {

}
