package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads") WebElement eleClick;
	public MyLeadsPage clickLeads() {
		click(eleClick);
		return new MyLeadsPage();
	}

}
