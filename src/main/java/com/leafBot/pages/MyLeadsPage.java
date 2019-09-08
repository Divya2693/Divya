package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Create Lead") WebElement eleClick;
	public CreateLeadForm ClickCreateLead() {
		click(eleClick);
		return new CreateLeadForm();
	}
	
	/*public FindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickMergeLeads() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadsPage();
	}*/

}
