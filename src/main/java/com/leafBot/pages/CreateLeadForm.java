package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadForm extends ProjectSpecificMethods{
	public CreateLeadForm() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="createLeadForm_companyName") WebElement eleCompanyName;
 public CreateLeadForm enterCompanyName(String companyName) {
	 clearAndType(eleCompanyName, companyName);
	 return this;
 }
 @FindBy(id="createLeadForm_firstName") WebElement eleFirstName;
 public CreateLeadForm enterFirstName(String firstName) {
	 clearAndType(eleFirstName, firstName);
	 return this;
 }
 @FindBy(id="createLeadForm_lastName") WebElement eleLastName;
 public CreateLeadForm enterLastName(String lastName) {
	 clearAndType(eleLastName, lastName);
	 return this;
 }
 @FindBy(xpath="//input[@value='Create Lead']") WebElement eleClick;
 public CreateLeadForm clickCreateLead() {
	 click(eleClick);
	 return this;
 }


}
