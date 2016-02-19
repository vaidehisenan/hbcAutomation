package com.hbcAutomation.pages;

import com.automation.framework.web.PageElement;
import com.automation.framework.web.PageElement.LocatorType;

public class HomePage extends Page {
	
	PageElement Sears_Logo=new PageElement("Logo", "//div[@id='logo']", LocatorType.XPATH);
	

	public HomePage(){
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage goToHomePage(){
		command().goTo("http://sears.com/");
		return this;
	}
	
	public HomePage verifyHomePage(){
		command().click(Sears_Logo);
		return this;
	}
}
