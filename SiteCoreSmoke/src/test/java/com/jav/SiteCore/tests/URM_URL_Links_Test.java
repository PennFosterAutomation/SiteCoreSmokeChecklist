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

import com.jav.SiteCore.fixture.URM_URL_Link_Fixture;
import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class URM_URL_Links_Test {

	WebDriver driverTest;

	ReadWriteExcelFile writeResult = new ReadWriteExcelFile("ChecklistConfig.xls");

	URM_URL_Link_Fixture test = new URM_URL_Link_Fixture();

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

	URM_URL_Links_Test() {
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
		String[][] str = writeResult.removeRowFrom2dArray(writeResult.readExcelFileWithSpaces("URM", 1	), 0);
		Object[][] retObjArr = str;
		return (retObjArr);
	}

	@Test(dataProvider = "DP1")
	public void CheckPoints(String URLLinks
			) throws InterruptedException {
		
		
		Reporter.log(Utilities.logOutputFile("   ------------ Start browser session ------------"));
		test.startBrowserSession();
		
		try {
			File file = new File(Utilities.getYamlValue("logFilePath")+ "/logs.txt");
			BufferedWriter output1 = null;
			output1 = new BufferedWriter(new FileWriter(file, true));
			output1.close();
			test.launchUrl(URLLinks);
			test.verifyHomepage();
			test.verifyPhoneNumbersGlobal();
			test.verifyPhoneNumbersCollege();
			test.verifyPhoneNumberHighSchool();
//			test.verifyPhoneNumberMedicalAssistant();
			test.verifyPhoneNumberMilitary();

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
	
	

}