package com.jav.Domestic.tests;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.jav.Domestic.fixture.*;
import com.jav.Domestic.util.*;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SiteCoreULR_Feature_Test {

	WebDriver driverTest;

	SiteCoreULR_Feature_Fixture test = new SiteCoreULR_Feature_Fixture();

	String preFix;
	String Fname;
	String Lname;
	String Mail;
	String EmailExt;
	String Phone;
	String Address;
	String City;
	String State;
	String Zip;
	String DOBmonth;
	String DOBday;
	String DOByear;
	String CreditCardNumber;
	String CVV;

	SiteCoreULR_Feature_Test() {
		DateFormat dateFormat = new SimpleDateFormat("ddmmssSSS");
		Date date = new Date();
		preFix = dateFormat.format(date);
	}

	@BeforeClass
	public void initialsettings() {
		test.setUpDataFile("testData/integration_testData_Domestic.yml");
		if (Utilities.getYamlValue("SiteCoreApp.RunType")
				.equalsIgnoreCase("OneIteration")) {
			Utilities.createExcel();
		}

	}

	@Test
	public void setup() {
		Reporter.log(Utilities
				.logOutputFile(" ########## Start browser session STARTS ###########"));
		test.startBrowserSession();
		Utilities.hardWait(5);
		Reporter.log(Utilities
				.logOutputFile(" ########## Start browser session ENDS ###########"));

	}

	@Test(dependsOnMethods = "setup")
	public void launchSelectedSiteCoreURL() throws InterruptedException {
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page STARTS ###########"));
		test.launchUrl(test.getYamlVal("SiteCoreApp.URL1"));
		Utilities.hardWait(4);
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page ENDS ###########"));

	}
	
	@Test(dependsOnMethods = "launchSelectedSiteCoreURL")
	public void VerifySiteCoreHomePage() throws InterruptedException {
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page STARTS ###########"));
		
		test.verifyNavigatedtoSiteCoreHomepage();
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page ENDS ###########"));

	}
	
	@Test(dependsOnMethods = "VerifySiteCoreHomePage")
	public void verifyElementsDisplayOnStep1EnrollmentProcess() {
		Reporter.log(Utilities
				.logOutputFile(" ########## Start Verify Elements Display On Step1 Enrollment Process STARTS ###########"));
		test.verifyElementsDisplayOnStep1();
		Reporter.log(Utilities
				.logOutputFile(" ########## Start Verify Elements Display On Step1 Enrollment Process ENDS ###########"));

	}

	@Test(dependsOnMethods = "verifyElementsDisplayOnStep1EnrollmentProcess")
	public void enterStudentInformationOnStep1Page() throws IOException {
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter Student Information On Step1 Page STARTS ###########"));
		Fname = test.getYamlVal("SiteCoreApp.StudentInformation.FirstName");
		Lname = Utilities.getFname();
		Mail = test.getYamlVal("SiteCoreApp.StudentInformation.Email");
		EmailExt = test.getYamlVal("SiteCoreApp.StudentInformation.EmailExt");
		Phone = test.getYamlVal("SiteCoreApp.StudentInformation.PrimaryPhone");
		Address = test.getYamlVal("SiteCoreApp.StudentInformation.Address");
		City = test.getYamlVal("SiteCoreApp.StudentInformation.City");
		State = test.getYamlVal("SiteCoreApp.StudentInformation.State");
		Zip = test.getYamlVal("SiteCoreApp.StudentInformation.ZIP");

		test.enterStudentInformationInStep1Form(preFix, Fname, Lname, Mail,	EmailExt, Phone, Address, City, State, Zip);

		Reporter.log(Utilities.logOutputFile(" ########## Start Enter Student Information On Step1 Page ENDS ###########"));

	}

	@Test(dependsOnMethods = "enterStudentInformationOnStep1Page")
	public void redirectToThankYouPageAndClickEnrollOnLine() {
		Reporter.log(Utilities
				.logOutputFile(" ########## Start Redirect To ThankYou Page And Click Enroll OnLine STARTS ###########"));
		test.verifyRedirectToThnakyouPageandClickonEnrollOnlineLink();
		Reporter.log(Utilities
				.logOutputFile(" ########## Start Redirect To ThankYou Page And Click Enroll OnLine ENDS ###########"));

	}



	
	@AfterClass
	public void tearDown() {
		Reporter.log(Utilities
				.logOutputFile(" ########## Stop Browser Session ###########"));
//		test.stopBrowserSession();
	}

}
