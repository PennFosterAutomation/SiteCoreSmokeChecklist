package com.jav.Canada.pageobjects;


import com.jav.Canada.pageobjects.AbstractClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.jav.Canada.tests.AllCourse_EOLCanadaReceiveInfo_nocourse_Tests;
//import com.jav.Canada.tests.EOLCanadaReceiveInfo_nocourse_Test;
import com.jav.Canada.util.ReadWriteExcelFile;
import com.jav.Canada.util.Utilities;


public class EOLCanadaReceiveInfo_nocourse_UI extends AbstractClass{
	
WebDriver driver;

ReadWriteExcelFile writeResult = new ReadWriteExcelFile("LastRunReport/last/Result.xls");
String course;

    public EOLCanadaReceiveInfo_nocourse_UI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
             
		@FindBy(xpath = "//form[@id='form5']/a")
		protected WebElement CanadaURLReceiveInformationNocourse;		
		@FindBy(xpath = "//img[@id='ctl00_ctl00_imgLogo' or @ alt = 'ICS Canada']")
		protected WebElement ICSCanadaImage;		
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
                protected WebElement ProvinceTextBoxOnStep1Page;
		@FindBy(xpath = "//strong[contains(text(),'* Province')]")
                protected WebElement ProvinceTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txtZipPostal']")
                protected WebElement PostalCodeTextBoxOnStep1Page;	
		@FindBy(xpath = "//strong[contains(text(),'* Postal Code')]")
                protected WebElement PostalCodeTextBoxLabelOnStep1Page;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_chkCommunicateEmail']")
		protected WebElement communicateViaEmailCheckbox;		
		@FindBy(xpath = "//label[contains(text(),'I would like ICS Canada to communicate with me via Email.')]")
		protected WebElement communicateViaEmailCheckboxLabel;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_chkCommunicateTextMsg']")
		protected WebElement communicateViaTextMsgCheckbox;		
		@FindBy(xpath = "//label[contains(text(),'I would like ICS Canada to communicate with me via Text Message.')]")
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
		
//		#########  Thank You Page ########################
		
		
		@FindBy(xpath = "//b[contains(text(),'Thank You!')]")
		protected WebElement thnakyouPageAfterStep1FormPage;		
		@FindBy(xpath = "//u[contains(text(),'Enrol online')]")
		protected WebElement enrollOnlineLinkThnakyouPageAfterStep1FormPage;	
		
		
//		######### Personal Information Page #################
		
		
		@FindBy(xpath = "//input[@value='Proceed To Step 2']")
		protected WebElement proceedToStep2Button;		
		@FindBy(xpath = "//strong[contains(text(),'* Date of Birth')]")
		protected WebElement dobTextBoxLabelOnStep1PersonalInformationPage;		
		@FindBy(xpath = ".//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_DateOfBirth_Month']")
		protected WebElement monthTextboxDOBOnStep1PersonalInformationPage;		
		@FindBy(xpath = ".//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_DateOfBirth_Day']")
		protected WebElement dayTextboxDOBOnStep1PersonalInformationPage;		
		@FindBy(xpath = ".//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_DateOfBirth_Year']")
		protected WebElement yearTextboxDOBOnStep1PersonalInformationPage;		
		@FindBy(xpath = "//strong[contains(text(),'* Highest Level of Education')]")
		protected WebElement levelOFEductionLabelOnStep1PersonalInformationPage;		
		@FindBy(xpath = "//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlLevelOfEducation']")
		protected WebElement levelOFEductionDropDownOnStep1PersonalInformationPage;		
		@FindBy(xpath = "//strong[contains(text(),'* Gender')]")
		protected WebElement genderLabelOnStep1PersonalInformationPage;		
		@FindBy(xpath = "//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlGender']")
		protected WebElement genderDropDownOnStep1PersonalInformationPage;
		@FindBy(xpath = "//a[@id='linkStep1']")
		protected WebElement step1TabOnEnrollmentFormForCanada;
		@FindBy(xpath = "//a[@id='linkStep2']")
		protected WebElement step2TabOnEnrollmentFormForCanada;
		@FindBy(xpath = "//a[@id='linkStep3']")
		protected WebElement step3TabOnEnrollmentFormForCanada;
		
		
//		####################  Payment Information Page ######################
		
		
		@FindBy(xpath = "//div[@class='program_name']")
		protected WebElement courseHaadingOnPaymentInformationPage;
		@FindBy(xpath = "//a[@class='lnkPromoCode']")
		protected WebElement promoCodeOnPaymentInformationPage;
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_rdo_PayPlan_PayInFull']")
		protected WebElement fullPaymentPlanRadioOnPaymentInformationPage;
		@FindBy(xpath = "//label[contains(text(),'Full Payment Plan')]")
		protected WebElement fullPaymentPlanRadioLabelOnPaymentInformationPage;
		@FindBy(xpath = "//div[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_div_PayPlan_PayInFull_ProgramPrice']")
		protected WebElement totalAmountFullPaymentPlanRadioOnPaymentInformationPage;
		@FindBy(xpath = "//img[@alt='Click for company profile']")
		protected WebElement secureTransactionImageFooterOnPaymentInformationPage;
		@FindBy(xpath = "//div[@id='secure-logos']")
		protected WebElement secureTransactionImageTextFooterOnPaymentInformationPage;
		@FindBy(xpath = "//div[@class='step_name']")
		protected WebElement headerPaymentInfoTextOnPaymentInformationPage;	
		@FindBy(xpath = "//div[@id='main']/div[2]/div/div/div/div[1]/p")
		protected WebElement textPaymentInformationOnPaymentInformationPage;	
		@FindBy(xpath = "//p[@class='paytoday']")
		protected WebElement textTodaysPaymentOnPaymentInformationPage;
		@FindBy(xpath = "//div[@id='main']/div[2]")
		protected WebElement updatedTodaysPaymentOnPaymentInformationPage;
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_rdo_PaymentInfo_CreditDebit']")
		protected WebElement creditCardRadioOnPaymentInformationPage;
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_rdo_PaymentInfo_ACH']")
		protected WebElement savingsAccountRadioOnPaymentInformationPage;
		@FindBy(xpath = "//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddl_PaymentInfo_ACH_US_Type']")
		protected WebElement accountTypesavingsAccountDropdownOnPaymentInformationPage;
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_ACH_US_RoutingNumber']")
		protected WebElement routingNumbersavingsAccountOnPaymentInformationPage;
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_ACH_US_AcctNumber']")
		protected WebElement accountNumbersavingsAccountOnPaymentInformationPage;
	
		
//		#############  Card Information Section  ###########################
		
		@FindBy(xpath = "//input[@type='checkbox']")
		protected WebElement checkboxBillingAddressCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//label[contains(text(),'My billing information is the same as my mailing address.')]")
		protected WebElement labelBillingAddressCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_FirstName']")
		protected WebElement textboxFirstNameCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*First Name')]")
		protected WebElement labelFirstNameCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_LastName']")
		protected WebElement textboxLastNameCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*Last Name')]")
		protected WebElement labelLastNameCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_Address1']")
		protected WebElement textboxAdderss1CreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*Address 1')]")
		protected WebElement labelAddress1CreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_Address2']")
		protected WebElement textboxAdderss2CreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_City']")
		protected WebElement textboxCityCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*City')]")
		protected WebElement labelCityCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddl_PaymentInfo_CC_State']")
                protected WebElement textboxProvinceCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),' *Province')]")
                protected WebElement labelProvinceCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_ZipCode']")
		protected WebElement textboxZipCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),' *Zip')]")
		protected WebElement labelZipCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_CardNumber']")
		protected WebElement textboxCardNumberCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*Card Number')]")
		protected WebElement labelCardNumberCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_txt_PaymentInfo_CC_CVV']")
		protected WebElement textboxCVVCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*CVV Code')]")
		protected WebElement labelCVVrCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = ".//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddl_PaymentInfo_CC_ExpMonth']")
		protected WebElement textboxExpDateMonthCreditCardOnPaymentInformationPage;
		@FindBy(xpath = ".//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddl_PaymentInfo_CC_ExpYear']")
		protected WebElement textboxExpDateYearCreditCardOnPaymentInformationPage;
		@FindBy(xpath = "//strong[contains(text(),'*Exp. Date')]")
		protected WebElement labelExpDateCreditCardOnPaymentInformationPage;		
		@FindBy(xpath = "//input[@value='Proceed to Final Step']")
		protected WebElement proceedtoFinalStepCreditCardOnPaymentInformationPage;
		
		
//		############  Review and Submit Page   #######################
		
		
	
		@FindBy(xpath = "//*[@id='main']/div[1]")
		protected WebElement p1;
		@FindBy(xpath = "//*[@id='main']/div[2]")
		protected WebElement p2;
		@FindBy(xpath = "//*[@id='main']/div[3]")
		protected WebElement p3;
		@FindBy(xpath = "//input[@type='checkbox']")
		protected WebElement checkboxTermandConditionOnReviewAndSubmitPage;
		@FindBy(xpath = "//label[contains(text(),'I have reviewed and understand the terms and conditions of my enrolment.')]")
		protected WebElement checkboxLabelTermandConditionOnReviewAndSubmitPage;
		@FindBy(xpath = "//input[@id='btn_Enroll']")
		protected WebElement enrollTermandConditionOnReviewAndSubmitPage;
		@FindBy(xpath = "//b[contains(text(),'Congratulations')]")
		protected WebElement txtCongratulationsOnReviewAndSubmitPage;
		
		
//		############  Electronic Signature Page   #######################
		
		@FindBy(xpath = "//div[@class='step_name']")
		protected WebElement textElectronicSignature;
		@FindBy(xpath = "//input[@value='rdo_Sign']")
		protected WebElement radiobuttonSignyourEnrollmentAgreementOnline;
		@FindBy(xpath = "//input[@value='rdo_Mail']")
		protected WebElement radiobuttonSignyourEnrollmentMailed;
		@FindBy(xpath = "//input[@value='Next']")
		protected WebElement nextButtonDisplayOnElectronicSignature;			
		@FindBy(linkText = "Yes, I consent to complete and sign this document electronically.")
		protected WebElement yesLinkonDisplayOnElectronicSignature;		
		@FindBy(linkText = "No, I prefer to have this document mailed to me, which I will sign and return via postal mail")
		protected WebElement noLinkonDisplayOnElectronicSignature;		
		@FindBy(xpath = "//div[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_div_MarketingContent']/span")
		protected WebElement getStudentIDFromCongratulationsPage;
		@FindBy(xpath = "//div[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_div_MarketingContent']/p/span")
		protected WebElement getStudentIDFromCongratulationsPage2;
		@FindBy(linkText = "Click here")
		protected WebElement clickHereLinkOnCongratulationsPage;	
		
			
//		##############  Field validation msg ####################
		@FindBy(xpath = "//li[contains(text(),'Email Address is Required')]")
		protected WebElement emailAddressisRequired;
		@FindBy(xpath = "//li[contains(text(),'Email Addresses Do Not Match')]")
		protected WebElement emailAddressesDoNotMatch;
		@FindBy(xpath = "//input[@value='OK']")
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
		
			
//		########### Message validation Personal Information Page  ######################
		
		@FindBy(xpath = "//li[contains(text(),'Month of Birth is required')]")
		protected WebElement monthofBirthisrequired;
		@FindBy(xpath = "//li[contains(text(),'Day of Birth is required')]")
		protected WebElement dayofBirthisrequired;
		@FindBy(xpath = "//li[contains(text(),'Year of Birth is required')]")
		protected WebElement yearofBirthisrequired;
		@FindBy(xpath = "//li[contains(text(),'Highest Level of Education is Required')]")
		protected WebElement highestlevelofEducationisRequired;		
		@FindBy(xpath = "//li[contains(text(),'Gender is Required')]")
		protected WebElement genderisRequired;
		
		
//		########### Message validation Payment Information Page  ######################
		
		@FindBy(xpath = "//li[contains(text(),'Please enter your credit card number')]")
		protected WebElement Pleaseenteryourcreditcardnumber;
		@FindBy(xpath = "//li[contains(text(),'Please enter your CVV Code')]")
		protected WebElement PleaseenteryourCVVCode;
		@FindBy(xpath = "//li[contains(text(),'your expiration month')]")
		protected WebElement enteryourexpirationmonth;
		@FindBy(xpath = "//li[contains(text(),'Please enter your expiration year')]")
		protected WebElement enteryourexpirationyear;		
		@FindBy(xpath = "//input[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_btnCloseModal']")
		protected WebElement okbuttonDisplayonPaymentInfoPage;
		
		static int coursecount; 
		String selectedCourseName;
		int currentCourseUI = AllCourse_EOLCanadaReceiveInfo_nocourse_Tests.initialCounter + 1;
				
		static String StudentFilename;
		String lname;
		String email;
		
		
		public void navigateToCanadaURLReciveInformationNoCource()
        {       
			CanadaURLReceiveInformationNocourse.click();			
			Reporter.log(Utilities.logOutputFile("Click on Receive Information (No course) - Pass"));
			Assert.assertTrue(ICSCanadaImage.isDisplayed());  
			Reporter.log(Utilities.logOutputFile("ICS Canada Image Verify - Pass"));

        }
		
		public int getCourseCountFromICSCanadaPage()
        {			
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlProgram']")));
			coursecount = Integer.parseInt(courseDropDown.getAttribute("length"));			
			Reporter.log(Utilities.logOutputFile("Total number of Course under Receive Information (No course) is --> "+coursecount+" - Pass"));

			Utilities.hardWait(3);
			return coursecount;
        }
			
		public void selectCourseFromICSCanadaPage(String Course)
		{
			if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){		
				WebElement OptionFordropdown = driver.findElement(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlProgram']/option["+currentCourseUI+"]"));
				selectedCourseName = OptionFordropdown.getText();				
			}else{
				if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
					selectedCourseName = Course;					
				}else{

					selectedCourseName = Course;
				}
			}			
			Reporter.log(Utilities.logOutputFile(" Select a course from dropdown - Pass"));
			Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlProgram']")));
			select.selectByVisibleText(selectedCourseName);
			System.out.println("Selected Course Name --> "+selectedCourseName);
			course = selectedCourseName;
			continueButton.click();
			Reporter.log(Utilities.logOutputFile(" Click on Continue button - Pass"));
		}
			
		public void varifyPageElementsForStep1()
        {
			
				try{
					
						Reporter.log(Utilities.logOutputFile(" Fill form for Course --> "+courseNameHeadingOnStep1Page.getText()+" - Pass"));
						Assert.assertTrue(courseNameHeadingOnStep1Page.getText().equalsIgnoreCase(selectedCourseName));
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
						Assert.assertTrue(ProvinceTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(ProvinceTextBoxLabelOnStep1Page.isDisplayed());
						Assert.assertTrue(PostalCodeTextBoxOnStep1Page.isDisplayed());
						Assert.assertTrue(PostalCodeTextBoxLabelOnStep1Page.isDisplayed());
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
		
        public void fillFormStep1ForCanada(String preFix, String Fname, String Lname, 
				String Mail, String EmailExt, String Phone, String Address, String City, String State, String Zip)
        {	
			Reporter.log(Utilities.logOutputFile(" Enter Information on Step1 page - Pass"));
			StudentFilename = Fname+Lname;
			
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
                                System.out.println("actual: "+firstNameTextBoxOnStep1Page.getAttribute("value"));
                                System.out.println("expected:" + Fname);
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
			PostalCodeTextBoxOnStep1Page.sendKeys(Zip);
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
			PostalCodeTextBoxOnStep1Page.sendKeys(Zip);
			PostalCodeTextBoxOnStep1Page.clear();
			sendInformationButton.click();
			zipIsRequired.isDisplayed();
			okButtonValidationPopUp.click();
			PostalCodeTextBoxOnStep1Page.sendKeys(Zip);
			}catch(Exception e){
				System.out.println("Error in validating zip message on Step1 page " + e);
				okButtonValidationPopUp.click();
			}

			emailTextBoxOnStep1Page.clear();
			reTypeEmailTextBoxOnStep1Page.clear();
			primaryPhoneTextBoxOnStep1Page.clear();
			address1TextBoxOnStep1Page.clear();
			cityTextBoxOnStep1Page.clear();			
			PostalCodeTextBoxOnStep1Page.clear();
			
			emailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
			reTypeEmailTextBoxOnStep1Page.sendKeys(Mail+preFix+"@"+EmailExt);
			primaryPhoneTextBoxOnStep1Page.sendKeys(Phone);
			address1TextBoxOnStep1Page.sendKeys(Address);
			cityTextBoxOnStep1Page.sendKeys(City);
			PostalCodeTextBoxOnStep1Page.sendKeys(Zip);
			otherPhoneTypeRadioButton.click();
			
			sendInformationButton.click();
                        
			
//			#############################################################################
			try{
				okButtonValidationPopUp.click();

				sendInformationButton.click();

				
			}catch(Exception e){
				
			}
//			#############################################################################


			Reporter.log(Utilities.logOutputFile(" Enter First Name --> "+Fname));
			Reporter.log(Utilities.logOutputFile(" Enter Last Name  --> "+Lname));
			Reporter.log(Utilities.logOutputFile(" Enter Email  --> "+Mail+preFix+"@"+EmailExt));
			Reporter.log(Utilities.logOutputFile(" Enter Phone Number  --> "+Phone));
			Reporter.log(Utilities.logOutputFile(" Enter Address  --> "+Address));
			Reporter.log(Utilities.logOutputFile(" Enter City  --> "+City));
			Reporter.log(Utilities.logOutputFile(" Enter Zip  --> "+Zip));
			
			lname = Lname;
			email = Mail+preFix;
			   if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
				    writeResult.writeColInExcelFile("Result", course, currentCourseUI-1, 0);
					writeResult.writeColInExcelFile("Result", Fname, currentCourseUI-1, 1);
					writeResult.writeColInExcelFile("Result", Lname, currentCourseUI-1, 2);
					writeResult.writeColInExcelFile("Result", Mail+preFix+"@"+EmailExt, currentCourseUI-1, 3);
					writeResult.writeColInExcelFile("Result", Phone, currentCourseUI-1, 4);
					writeResult.writeColInExcelFile("Result", Address, currentCourseUI-1, 5);
					writeResult.writeColInExcelFile("Result", City, currentCourseUI-1, 6);
					writeResult.writeColInExcelFile("Result", Zip, currentCourseUI-1, 7);
		        }else{
		        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
		        		 writeResult.writeColInExcelFile("Result", course, currentCourseUI-1, 0);
		     			 writeResult.writeColInExcelFile("Result", Fname, currentCourseUI-1, 1);
		     			 writeResult.writeColInExcelFile("Result", Lname, currentCourseUI-1, 2);
		     			 writeResult.writeColInExcelFile("Result", Mail+preFix+"@"+EmailExt, currentCourseUI-1, 3);
		     			 writeResult.writeColInExcelFile("Result", Phone, currentCourseUI-1, 4);
		     			 writeResult.writeColInExcelFile("Result", Address, currentCourseUI-1, 5);
		     			 writeResult.writeColInExcelFile("Result", City, currentCourseUI-1, 6);
		     			 writeResult.writeColInExcelFile("Result", Zip, currentCourseUI-1, 7);    
		                 }		        	
		        }					
        }
		
		public void verifyThnakYouPageAfterStep1FormPage()	
		{		
			Assert.assertTrue(thnakyouPageAfterStep1FormPage.isDisplayed());
			Reporter.log(Utilities.logOutputFile("Verify thankyou page displayed  - PASS "));

			enrollOnlineLinkThnakyouPageAfterStep1FormPage.click();
			Reporter.log(Utilities.logOutputFile("Click on Enroll OnLine Link  - PASS "));

						
        }
		
		public void verifyPersonalInformationPage()	
		{
			try
			{
				Assert.assertTrue(proceedToStep2Button.isDisplayed());
				Assert.assertTrue(firstNameTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(firstNameTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(firstNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.FirstName")));
				Assert.assertTrue(lastNameTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(lastNameTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(lastNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(lname));
				Assert.assertTrue(emailTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(emailTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(emailTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(email+"@"+Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.EmailExt")));
				Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(reTypeEmailTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(email+"@"+Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.EmailExt")));
				Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(primaryPhoneTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.PrimaryPhone")));
				Assert.assertTrue(address1TextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(address1TextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(address1TextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.Address")));
				Assert.assertTrue(address2TextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(address2TextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(cityTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(cityTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(cityTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.City")));
				Assert.assertTrue(ProvinceTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(ProvinceTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(PostalCodeTextBoxOnStep1Page.isDisplayed());
				Assert.assertTrue(PostalCodeTextBoxLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(PostalCodeTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.ZIP")));
				Assert.assertTrue(communicateViaEmailCheckbox.isDisplayed());					
				Assert.assertTrue(communicateViaEmailCheckboxLabel.isDisplayed());					
				Assert.assertTrue(communicateViaTextMsgCheckbox.isDisplayed());					
				Assert.assertTrue(communicateViaTextMsgCheckboxLabel.isDisplayed());					
				Assert.assertTrue(mobilePhoneTypeRadioButton.isDisplayed());					
				Assert.assertTrue(mobilePhoneTypeRadioButtonLabel.isDisplayed());					
				Assert.assertTrue(otherPhoneTypeRadioButton.isDisplayed());					
				Assert.assertTrue(otherPhoneTypeRadioButtonLabel.isDisplayed());					
				Assert.assertTrue(phoneTypeRadioButtonLabelOnStep1Page.isDisplayed());
				Assert.assertTrue(dobTextBoxLabelOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(monthTextboxDOBOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(dayTextboxDOBOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(yearTextboxDOBOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(levelOFEductionLabelOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(levelOFEductionDropDownOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(genderLabelOnStep1PersonalInformationPage.isDisplayed());		
				Assert.assertTrue(genderDropDownOnStep1PersonalInformationPage.isDisplayed());
				Assert.assertTrue(step1TabOnEnrollmentFormForCanada.isDisplayed());
				Assert.assertTrue(step2TabOnEnrollmentFormForCanada.isDisplayed());
				Assert.assertTrue(step3TabOnEnrollmentFormForCanada.isDisplayed());
				Reporter.log(Utilities.logOutputFile("Verify textboxes and Labels display on Personal Information Page  - PASS "));

			}catch(Exception e)
			{
				System.out.println("Unable to varify element on Personal Information Page --> "+e);
				Reporter.log(Utilities.logOutputFile("Verify textboxes and Labels display on Personal Information Page  - FAIL "));

			}
								
				
		}
		
		public void enterExtraInformationOnPersonalInformationPage(String DOBmonth, String DOBday, String DOByear)	
		{
			
			try{
				proceedToStep2Button.click();
				monthofBirthisrequired.isDisplayed();
				dayofBirthisrequired.isDisplayed();
				yearofBirthisrequired.isDisplayed();
				highestlevelofEducationisRequired.isDisplayed();
				genderisRequired.isDisplayed();
				okButtonValidationPopUp.click();
				
			}catch(Exception e){
				System.out.println("Error in validating all empty messages on Personal Information Page "+e);
				okButtonValidationPopUp.click();
				
			}
			
			
			Select select = new Select(levelOFEductionDropDownOnStep1PersonalInformationPage);
			select.selectByValue("16");
			Select selectgender = new Select(genderDropDownOnStep1PersonalInformationPage);
			selectgender.selectByValue("M");
			
			monthTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBmonth);
			dayTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBday);
			yearTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOByear);
			
			try{
				monthTextboxDOBOnStep1PersonalInformationPage.clear();
				proceedToStep2Button.click();
				monthofBirthisrequired.isDisplayed();
				okButtonValidationPopUp.click();
				monthTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBmonth);


			}catch(Exception e){
				System.out.println("Error in validating Month required messages on Personal Information Page "+e);
				okButtonValidationPopUp.click();

			}
			
			try{
				dayTextboxDOBOnStep1PersonalInformationPage.clear();
				proceedToStep2Button.click();
				dayofBirthisrequired.isDisplayed();
				okButtonValidationPopUp.click();
				dayTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBday);


			}catch(Exception e){
				System.out.println("Error in validating Day required messages on Personal Information Page "+e);
				okButtonValidationPopUp.click();

			}
			
			try{
				yearTextboxDOBOnStep1PersonalInformationPage.clear();
				proceedToStep2Button.click();
				yearofBirthisrequired.isDisplayed();
				okButtonValidationPopUp.click();
				yearTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBday);


			}catch(Exception e){
				System.out.println("Error in validating Year required messages on Personal Information Page "+e);
				okButtonValidationPopUp.click();

			}
			
			monthTextboxDOBOnStep1PersonalInformationPage.clear();
			dayTextboxDOBOnStep1PersonalInformationPage.clear();
			yearTextboxDOBOnStep1PersonalInformationPage.clear();
			
			monthTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBmonth);
			dayTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOBday);
			yearTextboxDOBOnStep1PersonalInformationPage.sendKeys(DOByear);
			
			
			
			Reporter.log(Utilities.logOutputFile("Enter DOB on personal Inforation page MM:DD:YYY format --> "+DOBmonth+DOBday+DOByear));

			proceedToStep2Button.click();
			
//			#############################################
			
			try{
				okButtonValidationPopUp.click();
				proceedToStep2Button.click();
				
			}catch(Exception e){
				
			}
			
//			#############################################

		}
		
		public void  verificationPaymentInformationPage()	
		{
			System.out.println(courseHaadingOnPaymentInformationPage.getText());
			Assert.assertTrue(courseHaadingOnPaymentInformationPage.getText().equals(selectedCourseName));
			Reporter.log(Utilities.logOutputFile("Verify Course Name display on page i.e. "+courseHaadingOnPaymentInformationPage.getText()+" - PASS"));
			Assert.assertTrue(promoCodeOnPaymentInformationPage.isDisplayed());
			Reporter.log(Utilities.logOutputFile("Verify Promo COde Link display on Page - PASS"));

		}
		
		public void  verifyElemetsOnPaymentInformationPage()
		{
			Assert.assertTrue(headerPaymentInfoTextOnPaymentInformationPage.getText().equalsIgnoreCase("Step 2 Payment Information"));
			Reporter.log(Utilities.logOutputFile("Verify Step Text - PASS"));

			Assert.assertTrue(secureTransactionImageTextFooterOnPaymentInformationPage.getText().equalsIgnoreCase("This is a secure transaction"));
			Reporter.log(Utilities.logOutputFile("Verify Footer Image Secure Transaction - PASS"));

			fullPaymentPlanRadioOnPaymentInformationPage.isDisplayed();
			fullPaymentPlanRadioLabelOnPaymentInformationPage.isDisplayed();
			System.out.println(totalAmountFullPaymentPlanRadioOnPaymentInformationPage.getText());
			secureTransactionImageFooterOnPaymentInformationPage.isDisplayed();
			Reporter.log(Utilities.logOutputFile("Verify Mode of Payment display on Payment Information Page - PASS"));
			
		}

		public boolean  selectfullpaymentmodeOnPaymentInformationPage(){
		
			fullPaymentPlanRadioOnPaymentInformationPage.click();
			
			WebDriverWait wait = new WebDriverWait(driver, 500 );
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='paytoday']")));
			
			String str = updatedTodaysPaymentOnPaymentInformationPage.getText();
			if(str.contains("Please select your payment method:") &&
					str.contains("Credit / Debit Card")&&
					str.contains("Chequing / Savings Account") &&
					str.contains("Payment Information:") &&
					str.contains("Today's Payment:"))
			{
				Reporter.log(Utilities.logOutputFile("Verify Options diplsy under Full Payment display on Payment Information Page - PASS"));
				if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.PaymentMode").equalsIgnoreCase("Checking or Savings Account"))
				{					
					savingsAccountRadioOnPaymentInformationPage.click();
					Reporter.log(Utilities.logOutputFile("Select savings account option display on Payment Information Page - PASS"));
					
					
				}else{
					creditCardRadioOnPaymentInformationPage.click();
					Reporter.log(Utilities.logOutputFile("Select creadit card option display on Payment Information Page - PASS"));
					
				}

				return true;
			}else{
				System.out.println(str);
			}
			
			
			return false;	
		}

		public void  verifyElementOnCreditCardSectionOnPaymentInformationPage()
		{
			if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.PaymentMode").equalsIgnoreCase("Checking or Savings Account"))
			{ 
				try{
					WebDriverWait wait = new WebDriverWait(driver, 10 );
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddl_PaymentInfo_ACH_US_Type']")));
				
				Assert.assertTrue(accountTypesavingsAccountDropdownOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(routingNumbersavingsAccountOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(accountNumbersavingsAccountOnPaymentInformationPage.isDisplayed());
			}catch(Exception e)
			{
				System.out.println("Unable to verify Elements display on Payment Information Page --> "+e);
			}
				
				
			}else{
				try{
					WebDriverWait wait = new WebDriverWait(driver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
					
				
				Assert.assertTrue(labelBillingAddressCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxFirstNameCreditCardOnPaymentInformationPage.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.FirstName")));
				Assert.assertTrue(textboxFirstNameCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelFirstNameCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxLastNameCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(textboxLastNameCreditCardOnPaymentInformationPage.getAttribute("value").equalsIgnoreCase(lname));
				Assert.assertTrue(labelLastNameCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxAdderss1CreditCardOnPaymentInformationPage.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.Address")));
				Assert.assertTrue(textboxAdderss1CreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelAddress1CreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxAdderss2CreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxCityCreditCardOnPaymentInformationPage.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.City")));
				Assert.assertTrue(textboxCityCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelCityCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxProvinceCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelProvinceCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxZipCreditCardOnPaymentInformationPage.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.StudentInformation.ZIP")));
				Assert.assertTrue(textboxZipCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelZipCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxCardNumberCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelCardNumberCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxCVVCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelCVVrCreditCardOnPaymentInformationPage.isDisplayed());			
				Assert.assertTrue(textboxExpDateMonthCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(textboxExpDateYearCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(labelExpDateCreditCardOnPaymentInformationPage.isDisplayed());
				Assert.assertTrue(proceedtoFinalStepCreditCardOnPaymentInformationPage.isDisplayed());
				Reporter.log(Utilities.logOutputFile("Verify form display under creadit card on Payment Information Page - PASS"));


			}catch(Exception e)
			{
				System.out.println("Unable to verify Elements display on Payment Information Page --> "+e);
			}
			}
		}

		public void  enterCreditCardInformationSectionOnPaymentInformationPage(String CreditCardNumber, String CVV)
		{
		
			if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.PaymentMode").equalsIgnoreCase("Checking or Savings Account"))
			{
				if(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.AccountType").equalsIgnoreCase("Checking"))
				{
					Select select = new Select(accountTypesavingsAccountDropdownOnPaymentInformationPage);
					select.selectByValue("C");
					if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
						writeResult.writeColInExcelFile("Result", "Checking", currentCourseUI-1, 8);

			        }else{
			        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
								writeResult.writeColInExcelFile("Result", "Checking", currentCourseUI-1, 8);
			                 }
			        	
			        }
				}else{
					Select select = new Select(accountTypesavingsAccountDropdownOnPaymentInformationPage);
					select.selectByValue("S");
					
					if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
						writeResult.writeColInExcelFile("Result", "Savings", currentCourseUI-1, 8);

			        }else{
			        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
								writeResult.writeColInExcelFile("Result", "Savings", currentCourseUI-1, 8);
			                 }
			        	
			        }
					
				}
				
				
				routingNumbersavingsAccountOnPaymentInformationPage.sendKeys(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RoutingNumber"));
				accountNumbersavingsAccountOnPaymentInformationPage.sendKeys(Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.AccountNumber"));
				proceedtoFinalStepCreditCardOnPaymentInformationPage.click();
				Reporter.log(Utilities.logOutputFile("Click on Proceed to Final Step button - PASS "));
				
			}else{
			
			try{
				proceedtoFinalStepCreditCardOnPaymentInformationPage.click();
				Pleaseenteryourcreditcardnumber.isDisplayed();
				PleaseenteryourCVVCode.isDisplayed();
				enteryourexpirationmonth.isDisplayed();
				enteryourexpirationyear.isDisplayed();
				okbuttonDisplayonPaymentInfoPage.click();
				if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
					writeResult.writeColInExcelFile("Result", "Credit Card", currentCourseUI-1, 8);

		        }else{
		        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
		 				writeResult.writeColInExcelFile("Result", "Credit Card", currentCourseUI-1, 8);
		                 }
		        	
		        }
				
			}catch(Exception e){
				System.out.println("Error in validating all empty messages on Payment Information Page "+e);
				okbuttonDisplayonPaymentInfoPage.click();
				
			}
			
			textboxCardNumberCreditCardOnPaymentInformationPage.sendKeys(CreditCardNumber);
			textboxCVVCreditCardOnPaymentInformationPage.sendKeys(CVV);
			Select select = new Select(textboxExpDateMonthCreditCardOnPaymentInformationPage);
			select.selectByValue("04");
			Select select1 = new Select(textboxExpDateYearCreditCardOnPaymentInformationPage);
			select1.selectByValue("2018");
			
			try{
				textboxCardNumberCreditCardOnPaymentInformationPage.clear();
				proceedtoFinalStepCreditCardOnPaymentInformationPage.click();
				Pleaseenteryourcreditcardnumber.isDisplayed();				
				okbuttonDisplayonPaymentInfoPage.click();
				textboxCardNumberCreditCardOnPaymentInformationPage.sendKeys(CreditCardNumber);

				
			}catch(Exception e){
				System.out.println("Error in validating Enter Credit Card no. messages on Payment Information Page "+e);
				okbuttonDisplayonPaymentInfoPage.click();
				
			}
			
			try{
				textboxCVVCreditCardOnPaymentInformationPage.clear();
				proceedtoFinalStepCreditCardOnPaymentInformationPage.click();
				PleaseenteryourCVVCode.isDisplayed();				
				okbuttonDisplayonPaymentInfoPage.click();
				textboxCVVCreditCardOnPaymentInformationPage.sendKeys(CVV);

				
			}catch(Exception e){
				System.out.println("Error in validating Enter CVV no. messages on Payment Information Page "+e);
				okbuttonDisplayonPaymentInfoPage.click();
				
			}
			
			textboxCardNumberCreditCardOnPaymentInformationPage.clear();
			textboxCVVCreditCardOnPaymentInformationPage.clear();
			
			
			Reporter.log(Utilities.logOutputFile("Enter information in creadit card form"));
			textboxCardNumberCreditCardOnPaymentInformationPage.sendKeys(CreditCardNumber);
			textboxCVVCreditCardOnPaymentInformationPage.sendKeys(CVV);
			Reporter.log(Utilities.logOutputFile("Enter Credit Card number in creadit card form is -- > "+ CreditCardNumber));
			Reporter.log(Utilities.logOutputFile("Enter CVV number in creadit card form is -- > "+ CVV));
//			Select select = new Select(textboxExpDateMonthCreditCardOnPaymentInformationPage);
//			select.selectByValue("04");
//			Select select1 = new Select(textboxExpDateYearCreditCardOnPaymentInformationPage);
//			select1.selectByValue("2018");
			Reporter.log(Utilities.logOutputFile("Select Expiry date of creadit card - PASS "));
			proceedtoFinalStepCreditCardOnPaymentInformationPage.click();
			Reporter.log(Utilities.logOutputFile("Click on Proceed to Final Step button - PASS "));
			}

		}


		public boolean verifyElementsOnReviewAndSubmitPage()
		{
			boolean result = true;
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='agree_header']")));
			
			Reporter.log(Utilities.logOutputFile("Verify redirect user to review & submit page - PASS "));

			String PersonalInformation = p1.getText();
			if (PersonalInformation.contains("Personal Information") &&	  PersonalInformation.contains("Personal Information") &&
					PersonalInformation.contains("First Name:")      &&   PersonalInformation.contains("Last Name:")           &&
					PersonalInformation.contains("Address:")         &&	  PersonalInformation.contains("City:")                &&
					PersonalInformation.contains("State:")           &&   PersonalInformation.contains("Zip Code:")            &&
					PersonalInformation.contains("Country:")         &&   PersonalInformation.contains("Email:")               &&
					PersonalInformation.contains("Phone (Other):")   &&   PersonalInformation.contains("Birth Date"))
			{
				Reporter.log(Utilities.logOutputFile("Information Display under Personal Information Heading - PASS "));

			}
			else
			{
				System.out.println(p1.getText());
				result = false;
				Reporter.log(Utilities.logOutputFile("Information Display under Personal Information Heading - FAIL "));

				return result;
			}
			
			String ProgramInformation = p2.getText();
			if (ProgramInformation.contains("Program Information")    &&	ProgramInformation.contains("Program:")               &&
					ProgramInformation.contains("Program Price:")     &&	ProgramInformation.contains("Initial Payment:")       &&
					ProgramInformation.contains("Monthly Payment:")   &&	ProgramInformation.contains("# of Monthly Payments:") &&
					ProgramInformation.contains("Final Payment:"))
			{
				Reporter.log(Utilities.logOutputFile("Information Display under Program Information Heading - PASS "));

			}
			else
			{
				System.out.println(p2.getText());
				result = false;
				Reporter.log(Utilities.logOutputFile("Information Display under Program Information Heading - FAIL "));

				return result;
			}
			
			
			String PaymentInformation  = p3.getText();
			if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.PaymentMode").equalsIgnoreCase("Checking or Savings Account"))
			{
				if (PaymentInformation.contains("Amount Charged Today")     &&	PaymentInformation.contains("Payment Information") &&
						PaymentInformation.contains("Account Number")   &&	PaymentInformation.contains("Monthly Payment:"))
				{
					Reporter.log(Utilities.logOutputFile("Information Display under Payment Information Heading - PASS "));
				}
				else
				{
					System.out.println(p3.getText());
					result = false;
					Reporter.log(Utilities.logOutputFile("Information Display under Payment Information Heading - FAIL "));

					return result;
				}
				
			}else{
				if (PaymentInformation.contains("Amount Charged Today")     &&	PaymentInformation.contains("Payment Information") &&
						PaymentInformation.contains("Credit Card Number")   &&	PaymentInformation.contains("Exp. Date:")          &&
						PaymentInformation.contains("Monthly Payment:"))
				{
					Reporter.log(Utilities.logOutputFile("Information Display under Payment Information Heading - PASS "));
				}
				else
				{
					System.out.println(p3.getText());
					result = false;
					Reporter.log(Utilities.logOutputFile("Information Display under Payment Information Heading - FAIL "));

					return result;
				}				
			}
			
						
			return result;
		}

		public boolean acceptTermandConditionOnReviewAndSubmitPage()
		{
			int m = 0;
			Assert.assertTrue(checkboxLabelTermandConditionOnReviewAndSubmitPage.isDisplayed());
			checkboxTermandConditionOnReviewAndSubmitPage.click();
			enrollTermandConditionOnReviewAndSubmitPage.click();
			
			try{
				textElectronicSignature.isDisplayed();
//				textElectronicSignature.getText().contains("Electronic Signature");
				radiobuttonSignyourEnrollmentMailed.isDisplayed();
				
				radiobuttonSignyourEnrollmentAgreementOnline.click();
				nextButtonDisplayOnElectronicSignature.click();	
				
				yesLinkonDisplayOnElectronicSignature.isDisplayed();
				noLinkonDisplayOnElectronicSignature.isDisplayed();
						
				noLinkonDisplayOnElectronicSignature.click();
				
//				textElectronicSignature.getText().contains("Congratulations");
				clickHereLinkOnCongratulationsPage.isDisplayed();
				m = 1;
				
			}catch(Exception e){				
				System.out.println("$$$$$$$$$$  Completed Student ID is  exit--> ");

				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Congratulations')]")));

				if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
					writeResult.writeColInExcelFile("Result", "ID not generated", currentCourseUI-1, 9);

		        }else{
		        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
		 				writeResult.writeColInExcelFile("Result", "ID not generated", currentCourseUI-1, 9);
		                 }
		        	
		        }
				
				txtCongratulationsOnReviewAndSubmitPage.isDisplayed();
				Reporter.log(Utilities.logOutputFile(" Final Student ID not genrated application display only is Congratulations page"));
				
			}			
			
			if (m==1)
			{
				System.out.println("$$$$$$$$$$$  DONE   $$$$$$$$$$$$$");
				try{
					Reporter.log(Utilities.logOutputFile(" Final Student ID is "+getStudentIDFromCongratulationsPage.getText()+" - Pass"));
					System.out.println("$$$$$$$$$$  Completed Student ID is --> "+getStudentIDFromCongratulationsPage.getText());
					 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
							writeResult.writeColInExcelFile("Result", getStudentIDFromCongratulationsPage.getText(), currentCourseUI-1, 9);

				        }else{
				        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
				 				writeResult.writeColInExcelFile("Result", getStudentIDFromCongratulationsPage.getText(), currentCourseUI-1, 9);   
				                 }
				        	
				        }
					 
				}catch(Exception e){	
					
					try{
						Reporter.log(Utilities.logOutputFile(" Final Student ID is "+getStudentIDFromCongratulationsPage2.getText()+" - Pass"));
						System.out.println("$$$$$$$$$$  Completed Student ID is --> "+getStudentIDFromCongratulationsPage2.getText());

						 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
								writeResult.writeColInExcelFile("Result", getStudentIDFromCongratulationsPage2.getText(), currentCourseUI-1, 9);

					        }else{
					        	 if (Utilities.getYamlValue("CanadaURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
					 				writeResult.writeColInExcelFile("Result", getStudentIDFromCongratulationsPage2.getText(), currentCourseUI-1, 9);   
					                 }
					        	
					        }
					}catch(Exception em){
						writeResult.writeColInExcelFile("Result", "ID not generated", currentCourseUI-1, 9);				
						Reporter.log(Utilities.logOutputFile(" Final Student ID not genrated application display only is Congratulations page"));
						
					}
					
				}			
			
			}
			
			return true;
		}

}
//		public void redirectTOElectronicSignaturePage()
//		{
//			Assert.assertTrue(textElectronicSignature.isDisplayed());
//			Assert.assertTrue(textElectronicSignature.getText().contains("Electronic Signature"));
//			Assert.assertTrue(radiobuttonSignyourEnrollmentMailed.isDisplayed());
//			
//			radiobuttonSignyourEnrollmentAgreementOnline.click();
//			nextButtonDisplayOnElectronicSignature.click();	
//			
//			Assert.assertTrue(yesLinkonDisplayOnElectronicSignature.isDisplayed());
//			Assert.assertTrue(noLinkonDisplayOnElectronicSignature.isDisplayed());
//					
//			noLinkonDisplayOnElectronicSignature.click();
//			
//			Assert.assertTrue(textElectronicSignature.getText().contains("Congratulations"));
//			Assert.assertTrue(clickHereLinkOnCongratulationsPage.isDisplayed());
//			Reporter.log(Utilities.logOutputFile(" Final Staudent ID is "+getStudentIDFromCongratulationsPage.getText()+" - Pass"));
//			writeResult.writeColInExcelFile("Result", getStudentIDFromCongratulationsPage.getText(), currentCourseUI-1, 9);
//
//			System.out.println("$$$$$$$$$$  Completed Student ID is --> "+getStudentIDFromCongratulationsPage.getText());
//			
//		}	

			
