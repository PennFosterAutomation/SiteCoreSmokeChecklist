package com.jav.Domestic.pageobjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.jav.Domestic.tests.AllCourse_EOLDomesticReceiveInfo_nocourse_Tests;
import com.jav.Domestic.util.ReadWriteExcelFile;
import com.jav.Domestic.util.Utilities;


public class SiteCoreULR_Feature_UI extends AbstractClass{
	
WebDriver driver;

ReadWriteExcelFile writeResult = new ReadWriteExcelFile("LastRunReport/last/Result.xls");
String course;

    public SiteCoreULR_Feature_UI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    

             
		@FindBy(xpath = "//a[@id='ctl18_lnkHeaderEnroll']")
		protected WebElement enrollNowLinkOnSiteCoreHomePage;
		
		@FindBy(xpath = "//a[contains(text(),'Request')]")
		protected WebElement requestInfoLinkOnSiteCoreHomePage;
			
		@FindBy(xpath = "//form[@id='form1']/a")
		protected WebElement DomesticURLReceiveInformationNocourse;		
		@FindBy(xpath = "//img[@id='ctl00_ctl00_imgLogo' or @ alt = 'Penn Foster Career School']")
		protected WebElement pennFosterCareerSchoolImage;		
		@FindBy(xpath = "//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlProgram']")
		protected WebElement courseDropDown;		
		@FindBy(xpath = "//input[@value='Continue']")
		protected WebElement continueButton;		
		
//		################  Step1 Page elements   #######################
		
		@FindBy(xpath = "//span[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_spanProgramName1']")
		protected WebElement courseNameHeadingOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtFirstName']")
		protected WebElement firstNameTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* First Name')]")
		protected WebElement firstNameTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtLastName']")
		protected WebElement lastNameTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Last Name')]")
		protected WebElement lastNameTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='txtEmail1']")
		protected WebElement emailTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Email')]")
		protected WebElement emailTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='txtEmail2']")
		protected WebElement reTypeEmailTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Re-Type Email')]")
		protected WebElement reTypeEmailTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtPhone1']")
		protected WebElement primaryPhoneTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Primary Phone')]")
		protected WebElement primaryPhoneTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtAddress1']")
		protected WebElement address1TextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Address 1')]")
		protected WebElement address1TextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtAddress2']")
		protected WebElement address2TextBoxOnStep1Page;	
		@FindBy(xpath = "//label[contains(text(),'Address 2')]")
		protected WebElement address2TextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtCity']")
		protected WebElement cityTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* City')]")
		protected WebElement cityTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlState']")
		protected WebElement stateTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* State')]")
		protected WebElement stateTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtZipPostal']")
		protected WebElement zipTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Zip')]")
		protected WebElement zipTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_chkCommunicateEmail']")
		protected WebElement communicateViaEmailCheckbox;		
		@FindBy(xpath = "//label[contains(text(),'I would like Penn Foster to communicate with me via Email.')]")
		protected WebElement communicateViaEmailCheckboxLabel;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_chkCommunicateTextMsg']")
		protected WebElement communicateViaTextMsgCheckbox;		
		@FindBy(xpath = "//label[contains(text(),'I would like Penn Foster to communicate with me via Text Message.')]")
		protected WebElement communicateViaTextMsgCheckboxLabel;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_rdoPhoneType1Mobile']")
		protected WebElement mobilePhoneTypeRadioButton;		
		@FindBy(xpath = "//span[contains(text(),'Mobile')]")
		protected WebElement mobilePhoneTypeRadioButtonLabel;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_rdoPhoneType1Other']")
		protected WebElement otherPhoneTypeRadioButton;		
		@FindBy(xpath = "//span[contains(text(),'Other')]")
		protected WebElement otherPhoneTypeRadioButtonLabel;		
		@FindBy(xpath = "//strong[contains(text(),'* Phone Type')]")
		protected WebElement phoneTypeRadioButtonLabelOnStep1Page;		
		@FindBy(xpath = "//input[@value='Send Information']")
		protected WebElement sendInformationButton;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_btnCloseModal']")
		protected WebElement reminderPopupOnStep1FormSubmit;	
		
		
//		##############  Field validation msg ####################
		
		@FindBy(xpath = "//li[contains(text(),'Email Address is Required')]")
		protected WebElement emailAddressisRequired;
		@FindBy(xpath = "//li[contains(text(),'Email Addresses Do Not Match')]")
		protected WebElement emailAddressesDoNotMatch;
		@FindBy(css = "input[value='OK']")
		protected WebElement okButtonValidationPopUp;
		@FindBy(xpath = "//li[contains(text(),'Re-Type Email Address is Required')]")
		protected WebElement reTypeEmailAddressisRequired;
		@FindBy(xpath = "//li[contains(text(),'Please enter a valid telephone number')]")
		protected WebElement pleaseEnteraValidTelephoneNumber;
		@FindBy(xpath = "//li[contains(text(),'Primary Phone is Required')]")
		protected WebElement primaryPhoneisRequired;
		@FindBy(xpath = "//li[contains(text(),'Address 1 is Required')]")
		protected WebElement address1isRequired;
		@FindBy(xpath = "//li[contains(text(),'City is Required')]")
		protected WebElement cityIsRequired;		
		@FindBy(xpath = "//li[contains(text(),'Postal Code is Required')]")
		protected WebElement zipIsRequired;
		@FindBy(xpath = "//li[contains(text(),'First Name is Required')]")
		protected WebElement firstNameisRequired;
		@FindBy(xpath = "//li[contains(text(),'Last Name is Required')]")
		protected WebElement lastNameisRequired;
		
		
//		#########  Thank You Page ########################
		
		
		@FindBy(xpath = "//b[contains(text(),'Thank You!')]")
		protected WebElement thnakyouPageAfterStep1FormPage;		
		@FindBy(xpath = "//u[contains(text(),'Enroll online')]")
		protected WebElement enrollOnlineLinkThnakyouPageAfterStep1FormPage;	
		
		
	
		
		public void verifyUserNavigatedtoSiteCoreHomepage()
        {       
			
			Reporter.log(Utilities.logOutputFile("Click on Receive Information (No course) - Pass"));
			Assert.assertTrue(enrollNowLinkOnSiteCoreHomePage.isDisplayed());  			
			Assert.assertTrue(requestInfoLinkOnSiteCoreHomePage.isDisplayed());
			requestInfoLinkOnSiteCoreHomePage.click(); 
			Reporter.log(Utilities.logOutputFile(" Penn Foster School Image Verify - Pass"));

        }
		
		public void varifyPageElementsForStep1()
        {
			
				try{
					
					WebDriverWait wait = new WebDriverWait(driver, 50);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
					
					
						Reporter.log(Utilities.logOutputFile(" Fill form for Course --> "+courseNameHeadingOnStep1Page.getText()+" - Pass"));
						Assert.assertTrue(firstNameTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(firstNameTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(lastNameTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(lastNameTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(emailTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(emailTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(reTypeEmailTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(primaryPhoneTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(address1TextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(address1TextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(address2TextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(address2TextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(cityTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(cityTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(stateTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(stateTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(zipTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(zipTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(communicateViaEmailCheckbox.isDisplayed());					
						Assert.assertTrue(communicateViaEmailCheckboxLabel.isDisplayed());					
						Assert.assertTrue(communicateViaTextMsgCheckbox.isDisplayed());					
						Assert.assertTrue(communicateViaTextMsgCheckboxLabel.isDisplayed());					
						Assert.assertTrue(mobilePhoneTypeRadioButton.isDisplayed());					
						Assert.assertTrue(mobilePhoneTypeRadioButtonLabel.isDisplayed());					
						Assert.assertTrue(otherPhoneTypeRadioButton.isDisplayed());					
						Assert.assertTrue(otherPhoneTypeRadioButtonLabel.isDisplayed());					
						Assert.assertTrue(phoneTypeRadioButtonLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(sendInformationButton.isDisplayed());
						Reporter.log(Utilities.logOutputFile(" Verify Elements display on Step1 page - Pass"));

						
					
				}catch(Exception e){
					System.out.println("Unable to Find Element on Step1 page --> "+e);
				}						
        }
		
		 public void fillFormStep1ForDomestic(String preFix, String Fname, String Lname, 
					String Mail, String EmailExt, String Phone, String Address, String City, String State, String Zip)
        {	
			Reporter.log(Utilities.logOutputFile(" Enter Information on Step1 page - Pass"));
			
			
			try {
				sendInformationButton.click();
				firstNameisRequired.isDisplayed();
				lastNameisRequired.isDisplayed();
				emailAddressisRequired.isDisplayed();
				reTypeEmailAddressisRequired.isDisplayed();
				primaryPhoneisRequired.isDisplayed();
				address1isRequired.isDisplayed();
				cityIsRequired.isDisplayed();
				zipIsRequired.isDisplayed();
				okButtonValidationPopUp.click();
				
			}catch(Exception e)
			{
				System.out.println("Error in validating all empty message on Step1 page " + e);
				okButtonValidationPopUp.click();
			}
		
			
	try{
		firstNameTextBoxOnStep1Page.sendKeys(Fname+"123");
		lastNameTextBoxOnStep1Page.click();
		firstNameTextBoxOnStep1Page.getAttribute("value");
		Assert.assertTrue(firstNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Fname));
	}catch(Exception e){
		System.out.println("Error in validating all first name message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
		lastNameTextBoxOnStep1Page.sendKeys(Lname+"123");
		emailTextBoxOnStep1Page.click();
		Assert.assertTrue(lastNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Lname));
	}catch(Exception e){
		System.out.println("Error in validating all last name message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	emailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	reTypeEmailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	primaryPhoneTextBoxOnStep1Page.sendKeys(Phone);
	address1TextBoxOnStep1Page.sendKeys(Address);
	cityTextBoxOnStep1Page.sendKeys(City);
	Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlState']")));
	select.selectByVisibleText(State);
	zipTextBoxOnStep1Page.sendKeys(Zip);
	otherPhoneTypeRadioButton.click();
	}catch(Exception e){
		System.out.println("Error in validating all email message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	emailTextBoxOnStep1Page.clear();
	sendInformationButton.click();
	emailAddressisRequired.isDisplayed();
	emailAddressesDoNotMatch.isDisplayed();
	okButtonValidationPopUp.click();
	emailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	}catch(Exception e){
		System.out.println("Error in validating all email required message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	reTypeEmailTextBoxOnStep1Page.clear();
	sendInformationButton.click();
	reTypeEmailAddressisRequired.isDisplayed();
	okButtonValidationPopUp.click();
	reTypeEmailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	}catch(Exception e){
		System.out.println("Error in validating all email required message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	emailTextBoxOnStep1Page.clear();
	reTypeEmailTextBoxOnStep1Page.clear();
	emailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	reTypeEmailTextBoxOnStep1Page.sendKeys(Mail+"@"+EmailExt);
	sendInformationButton.click();
	emailAddressesDoNotMatch.isDisplayed();
	okButtonValidationPopUp.click();
	emailTextBoxOnStep1Page.clear();
	reTypeEmailTextBoxOnStep1Page.clear();
	emailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	reTypeEmailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	}catch(Exception e){
		System.out.println("Error in validating all email does not match message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}

	try{
	primaryPhoneTextBoxOnStep1Page.clear();
	sendInformationButton.click();
	primaryPhoneisRequired.isDisplayed();
	okButtonValidationPopUp.click();
	primaryPhoneTextBoxOnStep1Page.sendKeys("909090909");
	sendInformationButton.click();
	pleaseEnteraValidTelephoneNumber.isDisplayed();
	okButtonValidationPopUp.click();
	primaryPhoneTextBoxOnStep1Page.sendKeys(Phone);
	}catch(Exception e){
		System.out.println("Error in validating phone number message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	address1TextBoxOnStep1Page.clear();
	sendInformationButton.click();
	address1isRequired.isDisplayed();
	okButtonValidationPopUp.click();
	address1TextBoxOnStep1Page.sendKeys(Address);
	}catch(Exception e){
		System.out.println("Error in validating address message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	cityTextBoxOnStep1Page.clear();
	sendInformationButton.click();
	cityIsRequired.isDisplayed();
	okButtonValidationPopUp.click();
	cityTextBoxOnStep1Page.sendKeys(City);
	}catch(Exception e){
		System.out.println("Error in validating city message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}
	
	try{
	zipTextBoxOnStep1Page.sendKeys(Zip);
	zipTextBoxOnStep1Page.clear();
	sendInformationButton.click();
	zipIsRequired.isDisplayed();
	okButtonValidationPopUp.click();
	zipTextBoxOnStep1Page.sendKeys(Zip);
	}catch(Exception e){
		System.out.println("Error in validating zip message on Step1 page " + e);
		okButtonValidationPopUp.click();
	}

	emailTextBoxOnStep1Page.clear();
	reTypeEmailTextBoxOnStep1Page.clear();
	primaryPhoneTextBoxOnStep1Page.clear();
	address1TextBoxOnStep1Page.clear();
	cityTextBoxOnStep1Page.clear();			
	zipTextBoxOnStep1Page.clear();
	
	emailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	reTypeEmailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
	primaryPhoneTextBoxOnStep1Page.sendKeys(Phone);
	address1TextBoxOnStep1Page.sendKeys(Address);
	cityTextBoxOnStep1Page.sendKeys(City);
	zipTextBoxOnStep1Page.sendKeys(Zip);
	otherPhoneTypeRadioButton.click();
	
	sendInformationButton.click();
	
//	#############################################################################
	try{
		
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore"))
		{
			Utilities.hardWait(3);
			WebDriverWait wait = new WebDriverWait(driver, 50 );
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='OK']")));
			okButtonValidationPopUp.isDisplayed();
			Utilities.hardWait(3);
			okButtonValidationPopUp.click();
			sendInformationButton.click();
		}else{
			okButtonValidationPopUp.isDisplayed();
			Utilities.hardWait(3);
			okButtonValidationPopUp.click();
			sendInformationButton.click();
			
		}
		
	}catch(Exception e){
		System.out.println(e);
		
	}
	
//	#############################################################################


	Reporter.log(Utilities.logOutputFile(" Enter First Name --> "+Fname));
	Reporter.log(Utilities.logOutputFile(" Enter Last Name  --> "+Lname));
	Reporter.log(Utilities.logOutputFile(" Enter Email  --> "+Mail+preFix+"@"+EmailExt));
	Reporter.log(Utilities.logOutputFile(" Enter Phone Number  --> "+Phone));
	Reporter.log(Utilities.logOutputFile(" Enter Address  --> "+Address));
	Reporter.log(Utilities.logOutputFile(" Enter City  --> "+City));
	Reporter.log(Utilities.logOutputFile(" Enter Zip  --> "+Zip));
	

	         	
        		
		                		
        }
		
		public void verifyThnakYouPageAfterStep1FormPage()	
		{		
			WebDriverWait wait = new WebDriverWait(driver, 50 );
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Thank You!')]")));
			
			Assert.assertTrue(thnakyouPageAfterStep1FormPage.isDisplayed());
			Reporter.log(Utilities.logOutputFile("Verify thankyou page displayed  - PASS "));

//			enrollOnlineLinkThnakyouPageAfterStep1FormPage.click();
			Reporter.log(Utilities.logOutputFile("Click on Enroll OnLine Link  - PASS "));

						
        }
		
		
	

}


			
