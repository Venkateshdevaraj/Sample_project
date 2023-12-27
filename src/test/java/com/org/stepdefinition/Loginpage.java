package com.org.stepdefinition;
import java.util.Set;

import org.openqa.selenium.WebElement;

import com.app.locators.Book_Ticket_Locator;
import com.org.baseclass.Baseclass;
import com.org.execution.Book_ticket_exe;
import com.org.execution.Flight_review_exe;
import com.org.execution.HomePage_execution;
import com.org.execution.Purchase_exectuion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage extends Purchase_exectuion {
	@When("enter the From location {string}")
	public void enter_the_from_location(String user) throws Exception {
		
	   HomePage_execution.from_location(user);
	}
	@When("enter the To location {string}")
	public void enter_the_to_location(String pass) throws Exception {
		
		HomePage_execution.to_location(pass);
		
	
	}
	@When("select the Departure date")
	public void select_the_departure_date() {
		HomePage_execution.departure_Date();
	}
	@When("select the Return date")
	public void select_the_return_date() {
		HomePage_execution.return_Date();
	}
	@When("choose the travelling person")
	public void choose_the_travelling_person() throws Exception {
		
		HomePage_execution.adult();
		HomePage_execution.children();
		HomePage_execution.senior();
	}
	@When("select the coach {string}")
	public void select_the_coach(String string) throws Exception {
		
	    HomePage_execution.select_coach(string);
	}

	@When("Click the Search flight")
	public void click_the_search_flight() throws Exception {
		
		HomePage_execution.submit_data();
	}
	
	@When("Validate the homepage")
	public void validate_the_homepage() {
		Book_ticket_exe.next_page();
	   System.out.println("Successfully landed into the Flight booking page");
	}
	
	@When("Enter the email id in the popup")
	public void enter_the_email_id_in_the_popup() {
		Book_ticket_exe.popup();
	 
	}
	@When("click the Getdeal button")
	public void click_the_getdeal_button() throws Exception {
		Book_ticket_exe.GetDeal();	
		Book_ticket_exe.flight();
		
	}
	@When("select the low cost flight")
	public void select_the_low_cost_flight() throws Exception {
		
		Book_ticket_exe.arrow();	
	    Book_ticket_exe.departure();
	    
	}
	@When("select the return flight")
	public void select_the_return_flight() {
		Book_ticket_exe.return_flight();
	}
	@When("Review the flight details and click continue")
	public void review_the_flight_details_and_click_continue() {
	    Flight_review_exe.flight_review_continue();
	}
	
	@When("Enter the Firstname of Adult1 {string}")
	public void enter_the_firstname_of_adult1(String string) {
	    Purchase_exectuion.Adult1_fristname(string);
	}
	@When("enter the lastname of Adult1 {string}")
	public void enter_the_lastname_of_adult1(String string) {
		Purchase_exectuion.Adult1_lastname(string);
	}
	@When("select the suffix of Adult1 {string}")
	public void select_the_suffix_of_adult1(String string) {
		Purchase_exectuion.Adult1_suffix(string);
	}
	@When("select the gender of Adult1 {string}")
	public void select_the_gender_of_adult1(String string) {
		Purchase_exectuion.Adult1_gender(string);
	}
	@When("select the DOB month of Adult1 {string}")
	public void select_the_dob_month_of_adult1(String string) {
		Purchase_exectuion.Adult1_dobmonth(string);
	}
	@When("Enter the DOB day of Adult1 {string}")
	public void enter_the_dob_day_of_adult1(String string) {
		Purchase_exectuion.Adult1_dobdate(string);
	}
	@When("Enter the DOB year of Adult1 {string}")
	public void enter_the_dob_year_of_adult1(String string) {
		Purchase_exectuion.Adult1_dobyear(string);
	}
	@When("Enter the Firstname of Adult2 {string}")
	public void enter_the_firstname_of_adult2(String string) {
		Purchase_exectuion.Adult2_fristname(string);
	}
	@When("enter the lastname of Adult2 {string}")
	public void enter_the_lastname_of_adult2(String string) {
		Purchase_exectuion.Adult2_lastname(string);
	}
	@When("select the suffix of Adult2  {string}")
	public void select_the_suffix_of_adult2(String string) {
		Purchase_exectuion.Adult2_suffix(string);
	}
	@When("select the gender of Adult2 {string}")
	public void select_the_gender_of_adult2(String string) {
		Purchase_exectuion.Adult2_gender(string);
	}
	@When("select the DOB month of Adult2 {string}")
	public void select_the_dob_month_of_adult2(String string) {
		Purchase_exectuion.Adult2_dobmonth(string);
	}
	@When("Enter the DOB day of Adult2 {string}")
	public void enter_the_dob_day_of_adult2(String string) {
		Purchase_exectuion.Adult2_dobdate(string);
	}
	@When("Enter the DOB year of Adult2 {string}")
	public void enter_the_dob_year_of_adult2(String string) {
		Purchase_exectuion.Adult2_dobyear(string);
	}
	@When("Enter the Firstname of senior {string}")
	public void enter_the_firstname_of_senior(String string) {
		Purchase_exectuion.senior_fristname(string);
	}
	@When("enter the lastname of senior {string}")
	public void enter_the_lastname_of_senior(String string) {
		Purchase_exectuion.senior_lastname(string);
	}
	@When("select the suffix of senior {string}")
	public void select_the_suffix_of_senior(String string) {
		Purchase_exectuion.senior_suffix(string);
	}
	@When("select the gender of senior {string}")
	public void select_the_gender_of_senior(String string) {
		Purchase_exectuion.senior_gender(string);
	}
	@When("select the DOB month of senior {string}")
	public void select_the_dob_month_of_senior(String string) {
		Purchase_exectuion.senior_dobmonth(string);
	}
	@When("Enter the DOB day of senior {string}")
	public void enter_the_dob_day_of_senior(String string) {
		Purchase_exectuion.senior_dobdate(string);
	}
	@When("Enter the DOB year of senior {string}")
	public void enter_the_dob_year_of_senior(String string) {
		Purchase_exectuion.senior_dobyear(string);
	}
	@When("Enter the Firstname of children {string}")
	public void enter_the_firstname_of_children(String string) {
		Purchase_exectuion.children_fristname(string);
	}
	@When("enter the lastname of children {string}")
	public void enter_the_lastname_of_children(String string) {
		Purchase_exectuion.children_lastname(string);
	}
	@When("select the suffix of children {string}")
	public void select_the_suffix_of_children(String string) {
		Purchase_exectuion.children_suffix(string);
	}
	@When("select the gender of children {string}")
	public void select_the_gender_of_children(String string) {
		Purchase_exectuion.children_gender(string);
	}
	@When("select the DOB month of children {string}")
	public void select_the_dob_month_of_children(String string) {
		Purchase_exectuion.children_dobmonth(string);
	}
	@When("Enter the DOB day of children {string}")
	public void enter_the_dob_day_of_children(String string) {
		Purchase_exectuion.childrenr_dobdate(string);
	}
	@When("Enter the DOB year of children {string}")
	public void enter_the_dob_year_of_children(String string) {
		Purchase_exectuion.children_dobyear(string);
	}
	
	@When("Enter the credit card number {string}")
	public void enter_the_credit_card_number(String string) {
	    Purchase_exectuion.creadit_card(string);
	}
	@When("Select the Expires month in credit card {string}")
	public void select_the_expires_month_in_credit_card(String string) {
	  Purchase_exectuion.Expire_month(string);
	}
	@When("Select the Expires year in credit card {string}")
	public void select_the_expires_year_in_credit_card(String string) {
		Purchase_exectuion.Expire_year(string);
	}
	@When("Enter the CVV number {string}")
	public void enter_the_cvv_number(String string) {
		Purchase_exectuion.cvv(string);
	}
	@When("Enter the cardholder name {string}")
	public void enter_the_cardholder_name(String string) {
		Purchase_exectuion.cardholder(string);
	}
	@When("select the country {string}")
	public void select_the_country(String string) {
		Purchase_exectuion.country(string);
	}
	@When("Enter the Billing Address {string}")
	public void enter_the_billing_address(String string) {
		Purchase_exectuion.billingaddress(string);
	}
	@When("Enter the city {string}")
	public void enter_the_city(String string) {
		Purchase_exectuion.city(string);
	}
	@When("Enter the phone number {string}")
	public void enter_the_phone_number(String string) {
		Purchase_exectuion.phone(string);
	}
	@When("Enter the Email ID {string}")
	public void enter_the_email_id(String string) {
		Purchase_exectuion.email(string);
	}
	@Then("click the purchase button")
	public void click_the_purchase_button() {
	    System.out.println("Successfully purchased the flight ticket");
	}






}
