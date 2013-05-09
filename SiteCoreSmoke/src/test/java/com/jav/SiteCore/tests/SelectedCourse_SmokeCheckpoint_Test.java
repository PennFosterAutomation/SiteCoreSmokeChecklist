package com.jav.SiteCore.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jav.SiteCore.fixture.Program_Tab_Fixture;
import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class SelectedCourse_SmokeCheckpoint_Test {

	WebDriver driverTest;

	ReadWriteExcelFile writeResult = new ReadWriteExcelFile("ChecklistConfig.xls");

	Program_Tab_Fixture test = new Program_Tab_Fixture();

	public static String courseName;
	public static String timeToComplete;
	public static String chatNow;
	public static String program;
	public static String phonenumberOption;
	public static String gaScript;
	public static String coursecode;
	public static String sitecoreForm;

	String preFix;
	TestListenerAdapter tla = new TestListenerAdapter();
	TestNG testng = new TestNG();

	SelectedCourse_SmokeCheckpoint_Test() {
		DateFormat dateFormat = new SimpleDateFormat("ddmmssSSS");
		Date date = new Date();
		preFix = dateFormat.format(date);
	}

	@BeforeClass
	public void initialsettings() {
		test.setUpDataFile("testData/integration_testData_SiteCore.yml");


	}

	// ############# Data Provider #############

	@DataProvider(name = "DP1")
	public Object[][] createData() {
		String[][] str = writeResult.removeRowFrom2dArray(writeResult.readExcelFileWithSpaces("Final", 11), 0);
		Object[][] retObjArr = str;
		return (retObjArr);
	}

	@Test(dataProvider = "DP1")
	public void CheckPoints(String coursename, 
			String programofinterest,
			String CnameEOL,
			String SiteCoreForm, 
			String CourseCode,
			String PhoneNumber, 
			
			String timetoComplete,
			String chatnow,
			String Program, 
			String PhoneNumberOption,
			String GAScript 
			
			
			
			
			) throws InterruptedException {
		
		courseName = coursename;
		timeToComplete = timetoComplete;
		chatNow = chatnow;
		program = Program;
		phonenumberOption = PhoneNumberOption;
		gaScript = GAScript;
		coursecode = CourseCode;
		sitecoreForm = SiteCoreForm;
		
		Reporter.log(Utilities.logOutputFile("   ------------ Start browser session ------------"));
		test.startBrowserSession();
		
		try {
			File file = new File(Utilities.getYamlValue("logFilePath")+ "/logs.txt");
			BufferedWriter output1 = null;
			output1 = new BufferedWriter(new FileWriter(file, true));
			output1.close();

			launchHomePage();
			homePageactions();
			clickProgramAndDegreesTab();
			clickViewAllPrograms();
			SelectCourse();

			verifyPhoneNumber(PhoneNumber);
			verifyGoogleAnalyticsScript(CourseCode);
			verifyChatNowHeader();
			verifyChatNowFooter();
			verifyTimeToComplete();
//			verifyRequestOrGetInfoandEnrollNow( programofinterest, CnameEOL);
			verifyAllSevenTabsForCourses();

			System.out.println("########## EXIT CLASS ##########");
			Reporter.log(Utilities.blankLine(""));
			Reporter.log(Utilities.blankLine(""));
			Reporter.log(Utilities.logOutputFile("   ########## Course course checkpoint completed ##########   "));
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			test.stopBrowserSession();
		}
	}
	
	
	// ############# Modules #############
	
	
	public void launchHomePage() throws InterruptedException {
		Reporter.log(Utilities.logOutputFile("   ------------ Start Launch Home Page ------------"));
		test.launchUrl(test.getYamlVal("appurl"));
		Utilities.hardWait(4);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

	}

	public void homePageactions() {
		Reporter.log(Utilities.logOutputFile("   ########## Verify Home Page STARTS ###########"));
		test.verifyHomepage();
		Reporter.log(Utilities.logOutputFile("   ########## Verify Home Page ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

	}

	public void clickProgramAndDegreesTab() {
		Reporter.log(Utilities.logOutputFile("   ########## Programs and Degrees tab clicked STARTS ###########"));
		test.clickProgramAndDegreesTab();
		Reporter.log(Utilities.logOutputFile("   ########## Programs and Degrees tab clicked ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));
	}

	public void clickViewAllPrograms() {
		Reporter.log(Utilities.logOutputFile("   ########## All programs clicked STARTS ###########"));
		test.clickViewAllPrograms();
		Reporter.log(Utilities.logOutputFile("   ########## All programs clicked ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));
	}

	public void SelectCourse() {
		Reporter.log(Utilities.logOutputFile("   ########## Select course from All courses list STARTS ###########"));
		System.out.println("TEST CLASS: "+ SelectedCourse_SmokeCheckpoint_Test.courseName);
		test.SelectCourse(SelectedCourse_SmokeCheckpoint_Test.courseName);
		Reporter.log(Utilities.logOutputFile("   ########## Select course from All courses list ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));
		
	}
	
	public void verifyPhoneNumber(String PhoneNumber) {
		
		if (phonenumberOption.equalsIgnoreCase("Y")) {
			
			Reporter.log(Utilities.logOutputFile("   ########## Phone Number verifivation STARTS ###########"));
			test.verifyPhoneNumber(PhoneNumber);
			Reporter.log(Utilities.logOutputFile("   ########## Phone Number verifivation ENDS ###########"));
			Reporter.log(Utilities.blankLine(""));
			Reporter.log(Utilities.blankLine(""));
			
		}
		
	}

	public void verifyGoogleAnalyticsScript(String CourseCode) {
		
		if (gaScript.equalsIgnoreCase("Y")) {
		
			Reporter.log(Utilities.logOutputFile("   ########## Verify Google Analytics Script STARTS###########"));
			test.verifyGoogleAnalyticsScript(CourseCode);
			Reporter.log(Utilities.logOutputFile("   ########## Verify Google Analytics Script ENDS ###########"));
			Reporter.log(Utilities.blankLine(""));
			Reporter.log(Utilities.blankLine(""));

		}
		
	}
	
	public void verifyChatNowHeader() {
		
		if (chatNow.equalsIgnoreCase("Y")) {
			
			if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
				
				System.out.println("Enter Chat IE");
				Reporter.log(Utilities.logOutputFile("   ########## Chat now header clicked STARTS ###########"));
				test.verifyChatNowHeaderIE();
				Reporter.log(Utilities.logOutputFile("   ########## Chat now header clicked ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
				
			}
			else
			{
				
				Reporter.log(Utilities.logOutputFile("   ########## Chat now header clicked STARTS ###########"));
				test.verifyChatNowHeader();
				Reporter.log(Utilities.logOutputFile("   ########## Chat now header clicked ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
				
			}
			
		}
				
	}

	public void verifyChatNowFooter() {
		
		if (chatNow.equalsIgnoreCase("Y")) {
			
			if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
				
				Reporter.log(Utilities.logOutputFile("   ########## verify chat now footer STARTS ###########"));
				test.verifyChatNowFooterIE();
				Reporter.log(Utilities.logOutputFile("   ########## verify chat now footer ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
				
			}
			else
			{
				Reporter.log(Utilities.logOutputFile("   ########## verify chat now footer STARTS ###########"));
				test.verifyChatNowFooter();
				Reporter.log(Utilities.logOutputFile("   ########## verify chat now footer ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
				
			}

		}

	}

	public void verifyTimeToComplete() {
		
		Reporter.log(Utilities.logOutputFile("   ########## Time to Complete STARTS ###########"));

			System.out.println("timeToCompleteinClass "+ SelectedCourse_SmokeCheckpoint_Test.timeToComplete);
	
			if (timeToComplete.equalsIgnoreCase("Y")) {
				
				Reporter.log(Utilities.logOutputFile("   ########## click time to complete button STARTS ###########"));
				test.clickTimeToCompleteBtn();
				Reporter.log(Utilities.logOutputFile("   ########## click time to complete button ENDS ###########"));
				Utilities.hardWait(4);
				System.out.println("Inside");
				Reporter.log(Utilities.logOutputFile("   ########################## Verify time to complete button STARTS ##########################"));

				Reporter.log(Utilities.logOutputFile("   ########## click extended radio button STARTS ###########"));
				test.clickExtendedRadioBtn(courseName);
				Utilities.hardWait(2);
				Reporter.log(Utilities.logOutputFile("   ########## click extended radio button ENDS ###########"));

				Reporter.log(Utilities.logOutputFile("   ########## verify summary details STARTS ###########"));
				test.verifySummaryDetails();
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details ENDS ############"));

				Reporter.log(Utilities.logOutputFile("   ########## click standard radio button STARTS ###########"));
				test.clickStandardRadioBtn();
				Utilities.hardWait(2);
				Reporter.log(Utilities.logOutputFile("   ########## click standard radio button ENDS ###########"));
	
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details STARTS ###########"));
				test.verifySummaryDetails();
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details ENDS ############"));
	
				Reporter.log(Utilities.logOutputFile("   ########## click accelerated radio button STARTS ###########"));
				test.clickAcceleratedRadioBtn();
				Utilities.hardWait(2);
				Reporter.log(Utilities.logOutputFile("   ########## click accelerated radio button ENDS ###########"));
	
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details STARTS ###########"));
				test.verifySummaryDetails();
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details ENDS ############"));
	
				Reporter.log(Utilities.logOutputFile("   ########## click others radio button STARTS ###########"));
				test.clickOthersRadioBtn();
				Utilities.hardWait(2);
				Reporter.log(Utilities.logOutputFile("   ########## click others radio button ENDS ###########"));
	
				test.inputWorkingHoursDetails();
				test.clickUpdateBtn();
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details STARTS ###########"));
				test.verifySummaryDetails();
				Reporter.log(Utilities.logOutputFile("   ########## verify summary details ENDS ############"));
	
				test.verifySummaryForBounderyValues();
	
				Reporter.log(Utilities.logOutputFile("   ########## click close time to complete button STARTS ###########"));
				test.clickCloseBtn();
				Reporter.log(Utilities.logOutputFile("   ########## click close time to complete button ENDS ###########"));
				
				System.out.println("Outside");
				Reporter.log(Utilities.logOutputFile("   ########## Time to Complete ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
		
		}

	}

	public void verifyRequestOrGetInfoandEnrollNow(String CourseNameEOL, String CnameEOL) {
		
			if (sitecoreForm.equalsIgnoreCase("n")){
				
				Reporter.log(Utilities.logOutputFile("   ########## Verify Request Or GetInfo and EnrollNow STARTS ###########"));
				System.out.println("....... ENTER .........");
				test.verifyRequestInfo(CourseNameEOL,CnameEOL);
				test.verifyEnrollNow(CourseNameEOL, CnameEOL);
				test.verifyEnrollNowIcon(CourseNameEOL, CnameEOL);
				test.verifyGetInfo(CourseNameEOL, CnameEOL);
				Reporter.log(Utilities.logOutputFile("   ########## Verify Request Or GetInfo and EnrollNow ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
			
		}else{
			
				Reporter.log(Utilities.logOutputFile("   ########## Verify Request Or GetInfo and EnrollNow STARTS ###########"));
				
				test.verifyRequestInfoEnable(CourseNameEOL,CnameEOL);
				test.verifyEnrollNowEnable(CourseNameEOL, CnameEOL);
				test.verifyEnrollNowIconEnable(CourseNameEOL, CnameEOL);
				test.verifyGetInfoEnable(CourseNameEOL, CnameEOL);
				Reporter.log(Utilities.logOutputFile("   ########## Verify Request Or GetInfo and EnrollNow ENDS ###########"));
				Reporter.log(Utilities.blankLine(""));
				Reporter.log(Utilities.blankLine(""));
			
			}
		
		

	}

	public void verifyAllSevenTabsForCourses() {
		
		if (program.equalsIgnoreCase("Y")) {
			
			Reporter.log(Utilities.logOutputFile("   ########## Verify Program Module (7 tabs) ENDS ###########"));
			test.verifyAllTabsOnCourse();
			test.navigateToOVERVIEWTab();
			test.navigatetoWhoIsItForTab();
			test.navigatetoProgramOutLineTab();
			test.navigatetoTuitionandpaymentTab();
			test.navigatetoCareersTab();
			test.navigatetoFAQsTab();
			test.navigatetoAccreditationTab();
			Reporter.log(Utilities.logOutputFile("   ########## Verify Program Module (7 tabs) ENDS ###########"));
			Reporter.log(Utilities.blankLine(""));
			Reporter.log(Utilities.blankLine(""));

		}
	}

}