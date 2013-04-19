package com.jav.SiteCore.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jav.SiteCore.fixture.FloodLight_Script_Fixture;
import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class FloodLight_Script_Test {

	WebDriver driverTest;

	ReadWriteExcelFile writeResult = new ReadWriteExcelFile(
			"ChecklistConfig.xls");

	FloodLight_Script_Fixture test = new FloodLight_Script_Fixture();

	String coursename;
	String preFix;
	TestListenerAdapter tla = new TestListenerAdapter();
	TestNG testng = new TestNG();


	@BeforeClass
	public void initialsettings() {
		test.setUpDataFile("testData/integration_testData_SiteCore.yml");

	}

	// ############# Data Provider #############

	@DataProvider(name = "FloodLight")
	public Object[][] createData() {
		String[][] str = writeResult.removeRowFrom2dArray(
				writeResult.readExcelFileWithSpaces("FloodLight", 4), 0);
		Object[][] retObjArr = str;
		return (retObjArr);
	}

	@Test(dataProvider = "FloodLight")
	public void CheckPoints(String CourseName, String ProgramOfIntreast, String CourseNameEOL, String sitecoreform) throws InterruptedException {
		
		coursename = CourseName;
			
		Reporter.log(Utilities
				.logOutputFile("   ------------ Start browser session ------------"));
		test.startBrowserSession();
		
		try {
			File file = new File(Utilities.getYamlValue("logFilePath")
					+ "/logs.txt");
			BufferedWriter output1 = null;
			output1 = new BufferedWriter(new FileWriter(file, true));
			output1.close();

			launchHomePage();
			homePageactions();
			clickProgramAndDegreesTab();
			clickViewAllPrograms();
			SelectCourse();
			test.EnrollNow(ProgramOfIntreast, CourseNameEOL, sitecoreform);
			
			
			test.stopBrowserSession();
			
			test.startBrowserSession();
			launchHomePage();
			homePageactions();
			clickProgramAndDegreesTab();
			clickViewAllPrograms();
			SelectCourse();
			test.GetInfo(ProgramOfIntreast, CourseNameEOL, sitecoreform);
			
			

			
			

			System.out.println("########## EXIT CLASS ##########");
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			test.stopBrowserSession();
		}
	}
	
	
	// ############# Modules #############
	
	
	public void launchHomePage() throws InterruptedException {
		Reporter.log(Utilities
				.logOutputFile("   ------------ Start Launch Home Page ------------"));
		test.launchUrl(test.getYamlVal("appurl"));
		Utilities.hardWait(4);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

	}

	public void homePageactions() {
		Reporter.log(Utilities
				.logOutputFile("   ########## Verify Home Page STARTS ###########"));
		test.verifyHomepage();
		Reporter.log(Utilities
				.logOutputFile("   ########## Verify Home Page ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

	}

	public void clickProgramAndDegreesTab() {
		Reporter.log(Utilities
				.logOutputFile("   ########## Programs and Degrees tab clicked STARTS ###########"));
		test.clickProgramAndDegreesTab();
		Reporter.log(Utilities
				.logOutputFile("   ########## Programs and Degrees tab clicked ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));
	}

	public void clickViewAllPrograms() {
		Reporter.log(Utilities
				.logOutputFile("   ########## All programs clicked STARTS ###########"));
		test.clickViewAllPrograms();
		Reporter.log(Utilities
				.logOutputFile("   ########## All programs clicked ENDS ###########"));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));
	}

	public void SelectCourse() {

			Reporter.log(Utilities
					.logOutputFile("   ########## Select course from All courses list STARTS ###########"));
			System.out.println("TEST CLASS: "
					+ coursename);
			test.SelectCourse(coursename);
			Reporter.log(Utilities
					.logOutputFile("   ########## Select course from All courses list ENDS ###########"));
			Reporter.log(Utilities.blankLine(""));
			Reporter.log(Utilities.blankLine(""));
		
	}
	
	

}