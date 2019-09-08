package com.leafBot.testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TestCase_CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName= "CreateLead";
		testcaseName="Login";
		testcaseDec="CreateLead";
		author="Divya";
		category="smoke";
	}
	
 @Test(dataProvider="fetchData")
 public void CreateLeadTesCase(String userName, String password,String companyName, String firstName, String lastName) {
	 new com.leafBot.pages.LoginPage().enterUserName(userName)
	                .enterPassword(password)
	                .clickLogin()
	                .ClickCRMSFALink()
	                .clickLeads()
	                .ClickCreateLead()
	                .enterCompanyName(companyName)
	                .enterFirstName(firstName)
	                .enterLastName(lastName);
 }
}
