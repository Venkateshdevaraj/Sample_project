package com.org.execution;

import com.app.locators.Purchase_loctor;
import com.org.baseclass.Baseclass;

public class Purchase_exectuion extends Flight_review_exe {
	public static void Adult1_fristname(String name) {
		Baseclass.senddata(Purchase_loctor.firsname1_loc(), name);
	}
	public static void Adult1_lastname(String name) {
		Baseclass.senddata(Purchase_loctor.lastName1_loc(), name);
	}
	public static void Adult1_gender(String name) {
		Baseclass.senddata(Purchase_loctor.gender1_loc(), name);
	}
	public static void Adult1_suffix(String name) {
		Baseclass.dropdown(Purchase_loctor.suff_1_loc(), name);
	}
	public static void Adult1_dobdate(String name) {
		Baseclass.senddata(Purchase_loctor.day1_loc(), name);
	}
	public static void Adult1_dobyear(String name) {
		Baseclass.senddata(Purchase_loctor.year1_loc(), name);
	}
	public static void Adult1_dobmonth(String name) {
		Baseclass.dropdown(Purchase_loctor.dobMonth1_loc(), name);
	}
	
	
	public static void Adult2_fristname(String name) {
		Baseclass.senddata(Purchase_loctor.firsname2_loc(), name);
	}
	public static void Adult2_lastname(String name) {
		Baseclass.senddata(Purchase_loctor.lastName2_loc(), name);
	}
	public static void Adult2_gender(String name) {
		Baseclass.senddata(Purchase_loctor.gender2_loc(), name);
	}
	public static void Adult2_suffix(String name) {
		Baseclass.dropdown(Purchase_loctor.suff_2_loc(), name);
	}
	public static void Adult2_dobdate(String name) {
		Baseclass.senddata(Purchase_loctor.day2_loc(), name);
	}
	public static void Adult2_dobyear(String name) {
		Baseclass.senddata(Purchase_loctor.year2_loc(), name);
	}
	public static void Adult2_dobmonth(String name) {
		Baseclass.dropdown(Purchase_loctor.dobMonth2_loc(), name);
	}
	
	public static void senior_fristname(String name) {
		Baseclass.senddata(Purchase_loctor.firsname3_loc(), name);
	}
	public static void senior_lastname(String name) {
		Baseclass.senddata(Purchase_loctor.lastName3_loc(), name);
	}
	public static void senior_gender(String name) {
		Baseclass.senddata(Purchase_loctor.gender3_loc(), name);
	}
	public static void senior_suffix(String name) {
		Baseclass.dropdown(Purchase_loctor.suff_3_loc(), name);
	}
	public static void senior_dobdate(String name) {
		Baseclass.senddata(Purchase_loctor.day3_loc(), name);
	}
	public static void senior_dobyear(String name) {
		Baseclass.senddata(Purchase_loctor.year3_loc(), name);
	}
	public static void senior_dobmonth(String name) {
		Baseclass.dropdown(Purchase_loctor.dobMonth3_loc(), name);
	}
	
	public static void children_fristname(String name) {
		Baseclass.senddata(Purchase_loctor.firsname4_loc(), name);
	}
	public static void children_lastname(String name) {
		Baseclass.senddata(Purchase_loctor.lastName4_loc(), name);
	}
	public static void children_gender(String name) {
		Baseclass.senddata(Purchase_loctor.gender4_loc(), name);
	}
	public static void children_suffix(String name) {
		Baseclass.dropdown(Purchase_loctor.suff_4_loc(), name);
	}
	public static void childrenr_dobdate(String name) {
		Baseclass.senddata(Purchase_loctor.day4_loc(), name);
	}
	public static void children_dobyear(String name) {
		Baseclass.senddata(Purchase_loctor.year4_loc(), name);
	}
	public static void children_dobmonth(String name) {
		Baseclass.dropdown(Purchase_loctor.dobMonth4_loc(), name);
	}
	
	public static void creadit_card(String name) {
		Baseclass.senddata(Purchase_loctor.creadit_loc(), name);
	}
	public static void Expire_month(String name) {
		Baseclass.dropdown(Purchase_loctor.expire_month_loc(), name);
	}
	public static void Expire_year(String name) {
		Baseclass.dropdown(Purchase_loctor.expire_year_loc(), name);
	}
	public static void cvv(String name) {
		Baseclass.senddata(Purchase_loctor.cvv_loc(), name);
	}
	public static void cardholder(String name) {
		Baseclass.senddata(Purchase_loctor.card_holder_name_loc(), name);
	}
	public static void country(String name) {
		Baseclass.dropdown(Purchase_loctor.country_loc(), name);
	}
	public static void billingaddress(String name) {
		Baseclass.senddata(Purchase_loctor.adress_loc(), name);
	}
	public static void city(String name) {
		Baseclass.senddata(Purchase_loctor.city_loc(), name);
	}
	public static void state(String name) {
		Baseclass.dropdown(Purchase_loctor.state_loc(), name);
	}
	public static void zipcode(String name) {
		Baseclass.senddata(Purchase_loctor.Zipcode_loc(), name);
	}
	public static void phone(String name) {
		Baseclass.senddata(Purchase_loctor.mobilenumber_loc(), name);
	}
	public static void email(String name) {
		Baseclass.senddata(Purchase_loctor.email_loc(), name);
	}
}
