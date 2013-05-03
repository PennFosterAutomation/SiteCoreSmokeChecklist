package com.jav.automation.tests;



import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.jav.automation.util.*;
import com.jav.automation.fixture.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EOLEnrollNow_Test {
	
	WebDriver driverTest;
	
	EOLEnrollNowInfo_Fixture test = new EOLEnrollNowInfo_Fixture();
	 
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
	 
	 EOLEnrollNow_Test()
	 {
		 DateFormat dateFormat = new SimpleDateFormat("ddmmssSSS");
		 Date date = new Date();		 
		 preFix = dateFormat.format(date);
	 }
	
	 
	@BeforeClass
    public void initialsettings() 
    {
        test.setUpDataFile("testData/integration_testData.yml");
        Utilities.createExcel();
       
        
    }
	
	
	@Test
    public void setup()
    {
		Reporter.log(Utilities.logOutputFile(" ########## Start browser session STARTS ###########"));
        test.startBrowserSession();        
		Reporter.log(Utilities.logOutputFile(" ########## Start browser session ENDS ###########"));

    }
	
	
	@Test(dependsOnMethods = "setup")
    public void launchHomePage() throws InterruptedException
    {
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page STARTS ###########"));
		test.launchUrl(test.getYamlVal("appurl"));
		Utilities.hardWait(4);
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page ENDS ###########"));

    }
	
	
	@Test(dependsOnMethods = "launchHomePage")
	public void homePageactions()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page STARTS ###########"));
		test.verifyHomepage();		
		Reporter.log(Utilities.logOutputFile(" ########## Start Launch Home Page ENDS ###########"));

	}
	
		
	@Test(dependsOnMethods = "homePageactions")
	public void enterRemaningInformationOnPersonalInformatoinPage() throws IOException
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter Information On Personal Informatoin Page STARTS ###########"));

		  Fname = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.FirstName");
		  Lname = Utilities.getFname();
		  Mail = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.Email");
		  EmailExt = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.EmailExt");
		  Phone = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.PrimaryPhone");
		  Address = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.Address");
		  City = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.City");
		  State = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.State");
		  Zip = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.ZIP");		
		  
		String DOBmonth = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.DOBmonth");
		 String DOBday = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.DOBday");
		 String DOByear = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.DOByear");
		test.enterInformationOnPersonalInformationPage(preFix, Fname, Lname, Mail, EmailExt, Phone, Address, City, State, Zip , DOBmonth, DOBday, DOByear);	
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter Remaning Information On Personal Informatoin Page ENDS ###########"));

	}
	
	
	@Test(dependsOnMethods = "enterRemaningInformationOnPersonalInformatoinPage")
	public void verifyredirectToPaymentInformationPage()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter Remaning Information On Personal Informatoin Page STARTS ###########"));
		test.redirectToPaymentInformationPage();	
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter Remaning Information On Personal Informatoin Page ENDS ###########"));

	}
	
	
	@Test(dependsOnMethods = "verifyredirectToPaymentInformationPage")
	public void verifyElementsDisplayOnPaymentInformation()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Redirect To Payment Information Page STARTS ###########"));
		test.verifyElemetsDisplayOnPaymentInformationPage();	
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Redirect To Payment Information Page ENDS ###########"));

	}
	
	
	@Test(dependsOnMethods = "verifyElementsDisplayOnPaymentInformation")
	public void selectModeOfPaymentandProvideInformation()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Elements Display On Payment Information STARTS ###########"));
		test.selectPaymentModeAndEnterCardInformation();	
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Elements Display On Payment Information ENDS ###########"));

	}
	
	
	@Test(dependsOnMethods = "selectModeOfPaymentandProvideInformation")
	public void verifyElementsDisplayAfterSelectModeOfPayment()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Select Mode Of Payment and Provide Information STARTS ###########"));
		test.verifyElementDisplayAfterCreditCardSelection();	
		Reporter.log(Utilities.logOutputFile(" ########## Start Select Mode Of Payment and Provide Information ENDS ###########"));

	}
	
	
	@Test(dependsOnMethods = "verifyElementsDisplayAfterSelectModeOfPayment")
	public void enterCreditCardInformation()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Elements Display After Select Mode Of Payment STARTS ###########"));

		CreditCardNumber = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.CreditCardNumber");
		CVV = test.getYamlVal("DomesticURLEnrollNow.StudentInformation.CVV");
		test.enterCreditCardInformationAfterCreditCardSelection(CreditCardNumber, CVV);	
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Elements Display After Select Mode Of Payment ENDS ###########"));

	}
	
	
	@Test(dependsOnMethods = "enterCreditCardInformation")
	public void verifyElementsDisplayOnReviewAndSubmitPage()
	{
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter CreditCard Information STARTS ###########"));
		test.verifyInformationFieldDisplayOnReviewandSubmitPage();	
		Reporter.log(Utilities.logOutputFile(" ########## Start Enter CreditCard Information ENDS ###########"));
	}
	
		
	@Test(dependsOnMethods = "verifyElementsDisplayOnReviewAndSubmitPage")
	public void verifyandClickOnTermAndComtitionsDisplayOnReviewandSubmitPage()
	{		
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Elements Display On Review and Submit Page STARTS ###########"));
		test.clickonTermAndConditionsonReviewandSubmitPage();	
		Reporter.log(Utilities.logOutputFile(" ########## Start Verify Elements Display On Review and Submit Page ENDS ###########"));

	}

	
	@AfterClass
    public void tearDown() 
     {
		Reporter.log(Utilities.logOutputFile(" ########## Stop Browser Session ###########"));
		test.stopBrowserSession();
     }	
	
}

