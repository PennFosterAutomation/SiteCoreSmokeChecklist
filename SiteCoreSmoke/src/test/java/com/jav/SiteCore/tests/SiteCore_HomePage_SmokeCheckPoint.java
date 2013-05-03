package com.jav.SiteCore.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jav.SiteCore.fixture.ChatNowPageHeader_Fixture;
import com.jav.SiteCore.util.Utilities;

public class SiteCore_HomePage_SmokeCheckPoint {

	WebDriver driverTest;
	

	ChatNowPageHeader_Fixture test = new ChatNowPageHeader_Fixture();


	@BeforeClass
	public void initialsettings() {
		test.setUpDataFile("testData/integration_testData_SiteCore.yml");
		}
	
//	########################## Which Program is right for me test #############################
	
	@Test
	public void setup() {
		Reporter.log(Utilities.logOutputFile(" ########## SMOKE TESTS STARTS ###########"));
		
												
		test.startBrowserSession();
		Reporter.log(Utilities.logOutputFile(" ---------- Start browser session ----------"));
	}

	@Test(dependsOnMethods = "setup")
	public void launchHomePage() throws InterruptedException {
		test.launchUrl(test.getYamlVal("appurl"));
		Utilities.hardWait(4);
		Reporter.log(Utilities.logOutputFile(" ---------- Start Launch Home Page ----------"));
	}

	@Test(dependsOnMethods = "launchHomePage")
	public void homePageactions() {
		test.verifyHomepage();
		Reporter.log(Utilities.logOutputFile(" ---------- Verify Home Page ----------"));

	}
	
	@Test(dependsOnMethods = "homePageactions")
	public void verifyProgramChoiceOnHomePage() {
		Reporter.log(Utilities.logOutputFile(" ########## Start verify Program choice on Home Page STARTS ###########"));
		test.verifyProgramChoiceOnHomePage();
		Reporter.log(Utilities.logOutputFile(" ########## Start verify program choice on Home Page ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "verifyProgramChoiceOnHomePage")
	public void clickLevelOfEducationCompletedOnHomePage() {
		Reporter.log(Utilities.logOutputFile(" ########## Start click level of education completed on Home Page STARTS ###########"));
		test.clickLevelOfEducationCompletedOnHomePage();
		Reporter.log(Utilities.logOutputFile(" ########## Start click level of education completed on Home Page ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickLevelOfEducationCompletedOnHomePage")
	public void selectCompletedLevelOfEducation() {
		Reporter.log(Utilities.logOutputFile(" ########## Select completed level of education STARTS ###########"));
		test.selectCompletedLevelOfEducation();
		Reporter.log(Utilities.logOutputFile(" ########## Select completed level of education ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "selectCompletedLevelOfEducation")
	public void clickAreaOfInterestOnHomePage() {
		Reporter.log(Utilities.logOutputFile(" ########## Start click area of interest on Home Page STARTS ###########"));
		test.clickAreaOfInterestOnHomePage();
		Reporter.log(Utilities.logOutputFile(" ########## Start click area of interest on Home Page ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickAreaOfInterestOnHomePage")
	public void selectAreaOfInterest() {
		Reporter.log(Utilities.logOutputFile(" ########## Select area of interest STARTS ###########"));
		test.selectAreaOfInterest();
		Reporter.log(Utilities.logOutputFile(" ########## Select area of interest ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "selectAreaOfInterest")
	public void clickWhatInterestYouMostOnHomePage() {
		Reporter.log(Utilities.logOutputFile(" ########## Start click What Interest You Most O nHome Page STARTS ###########"));
		test.clickWhatInterestYouMostOnHomePage();
		Reporter.log(Utilities.logOutputFile(" ########## Start click What Interest You Most O nHome Page ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickWhatInterestYouMostOnHomePage")
	public void selectMostInerestedField() {
		Reporter.log(Utilities.logOutputFile(" ########## Select Most Inerested Field STARTS ###########"));
		test.selectMostInerestedField();
		Reporter.log(Utilities.logOutputFile(" ########## Select Most Inerested Field ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "selectMostInerestedField")
	public void clickCareerLifeGoalOnHomePage() {
		Reporter.log(Utilities.logOutputFile(" ########## Start click career life goal On Home Page STARTS ###########"));
		test.clickCareerLifeGoalOnHomePage();
		Reporter.log(Utilities.logOutputFile(" ########## Start click career life goal On Home Page ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickCareerLifeGoalOnHomePage")
	public void selectCareerLifeGoal() {
		Reporter.log(Utilities.logOutputFile(" ########## Select career life goal Field STARTS ###########"));
		test.selectCareerLifeGoal();
		Reporter.log(Utilities.logOutputFile(" ########## Select career life goal Field ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "selectCareerLifeGoal")
	public void clickFindOutNowbtn() {
		Reporter.log(Utilities.logOutputFile(" ########## Start click find out now button on Home Page STARTS ###########"));
		test.clickFindOutNowbtn();
		Reporter.log(Utilities.logOutputFile(" ########## Start click find out now button on Home Page ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickFindOutNowbtn")
	public void verifyProgramsFoundbasedonSearchCriteria() {
			Reporter.log(Utilities.logOutputFile(" ########## Start Verify programs found based on search criteria STARTS ###########"));
			test.verifyProgramsFound();
			Reporter.log(Utilities.logOutputFile(" ########## Start Verify programs found based on search criteria ENDS ###########"));	
	}
	

	
//	########################## SEARCH FUNCTIONALITY HOME PAGE test #############################
	
	@Test(dependsOnMethods = "verifyProgramsFoundbasedonSearchCriteria")
	public void clickSearchIcon() {
		Reporter.log(Utilities.logOutputFile(" ########## search icon clicked STARTS ###########"));
		test.clickSearchIcon();
		Reporter.log(Utilities.logOutputFile(" ########## search icon clicked ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickSearchIcon")
	public void clickSearchBox() {
		Reporter.log(Utilities.logOutputFile(" ########## search box clicked STARTS ###########"));
		test.clickSearchBox();
		Reporter.log(Utilities.logOutputFile(" ########## search box clicked ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickSearchBox")
	public void typeSearchTerm() {
		Reporter.log(Utilities.logOutputFile(" ########## search term entered STARTS ###########"));
		test.typeSearchTerm("computer");
		Reporter.log(Utilities.logOutputFile(" ########## search term entered ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "typeSearchTerm")
	public void clickSearchButton() {
		Utilities.hardWait(2);
		Reporter.log(Utilities.logOutputFile(" ########## search button clicked STARTS ###########"));
		test.clickSearchButton();
		Utilities.hardWait(2);
		Reporter.log(Utilities.logOutputFile(" ########## search button clicked ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "clickSearchButton")
	public void verifySearchResultPageDisplayed() {
		Utilities.hardWait(2);
		Reporter.log(Utilities.logOutputFile(" ########## search result page displayed STARTS ###########"));
		test.verifySearchResultPageDisplayed();
		Utilities.hardWait(2);
		Reporter.log(Utilities.logOutputFile(" ########## search result page displayed ENDS ###########"));
	}
	
	@Test(dependsOnMethods = "verifySearchResultPageDisplayed")
	public void verifySearchTermHeadingContainSearchTerm() {
		Utilities.hardWait(2);
		Reporter.log(Utilities.logOutputFile(" ########## verify Search term Heading Contain Search Term STARTS ###########"));
		test.verifySearchTermHeadingContainSearchTerm();
		Utilities.hardWait(2);
		Reporter.log(Utilities.logOutputFile(" ########## verify Search term Heading Contain Search Term ENDS ###########"));

	}
	
	@Test(dependsOnMethods = "verifySearchTermHeadingContainSearchTerm")
	public void verifySpecialSearchterm() {
		test.verifySpecialSearchTerm();
	}
//	########################## Search Module #############################
	
	@Test(dependsOnMethods = "verifySpecialSearchterm")
	public void verifySearchMultiple() {
		if(test.getYamlVal("SearchTerm.RunType").equalsIgnoreCase("Selected")){
			
			for(int i=1; i<Integer.parseInt(test.getYamlVal("SearchTerm.Count"))+1;i++){
				test.verifySearchMultiple(test.getYamlVal("SearchTerm.SearchTerm"+i));
			}
		}else{
			Reporter.log(Utilities.logOutputFile(" ########## there is no extended search term mentioned in Configuration file ###########"));

		}
		
	}

//	########################## Global Phone Number Module #############################

	@Test(dependsOnMethods = "verifySearchMultiple")
	public void verifyPhoneNumbersGlobal() {
		test.verifyPhoneNumbersGlobal();
	}

//	########################## College Phone Number Module #############################


	@Test(dependsOnMethods = "verifyPhoneNumbersGlobal")
	public void verifyPhoneNumbersCollege() {
		test.verifyPhoneNumbersCollege();
	}
	
//	########################## High School Phone Number Module #############################

	
	@Test(dependsOnMethods = "verifyPhoneNumbersCollege")
	public void verifyPhoneNumberHighSchool() {
		test.verifyPhoneNumberHighSchool();
	}
	
//	########################## Medical Assistant Phone Number Module #############################

	@Test(dependsOnMethods = "verifyPhoneNumberHighSchool")
	public void verifyPhoneNumberMedicalAssistant() {
		test.navigatetohome();
		test.clickProgramAndDegreesTab();
		test.clickViewAllPrograms();
		test.SelectCourse("Medical Assistant Associate Degree");
		test.verifyPhoneNumberMedicalAssistant();
	}

//	########################## Military Phone Number Module #############################

	@Test(dependsOnMethods = "verifyPhoneNumberMedicalAssistant")
	public void verifyPhoneNumberMilitary() {
		test.navigatetohome();		
		test.verifyPhoneNumberMilitary();
	}

//	########################## Chat Now Module #############################

	@Test(dependsOnMethods = "verifyPhoneNumberMilitary")
	public void verifyChatNowHeader(){
		test.navigatetohome();	
		test.verifyChatNowHeader();
		test.verifyChatNowFooter();
	}
	
//	########################## Verify Header and Footer Module #############################
	
	@Test(dependsOnMethods = "verifyChatNowHeader")
	public void verifyHeaderandFooteratHomePage(){
		test.verifyHeaderandFooteratHOmePage();	
	}
	
//	########################## Verify Error and Exception Module #############################

	@Test(dependsOnMethods = "verifyHeaderandFooteratHomePage")
	public void verifyErrorandExceptionOnGetInfo(){
		test.getInfo();	
	}
	
	@Test(dependsOnMethods = "verifyErrorandExceptionOnGetInfo")
	public void verifyErrorandExceptionOnEnrollNow(){
		test.enrollNowInfo();	
	}
	
	@AfterClass
	public void tearDown() {
		Reporter.log(Utilities
				.logOutputFile(" ########## Stop Browser Session ###########"));
//		test.stopBrowserSession();
	}
	
}