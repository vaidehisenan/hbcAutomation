package com.hbcAutomation.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;

import com.hbcAutomation.pages.Page;


public class NavigationSteps extends Page {


	@Given("User lands on home page")
	public void gotoHomePage(){
		homePage().goToHomePage();
	}

	@Then(value="Verify user on home page")
	public void verifyOnHomePage(){
		homePage().verifyHomePage();
	}
	
}
