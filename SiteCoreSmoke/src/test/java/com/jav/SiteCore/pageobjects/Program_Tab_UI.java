package com.jav.SiteCore.pageobjects;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class Program_Tab_UI extends AbstractClass {

	WebDriver driver;
	
	ReadWriteExcelFile writeResult = new ReadWriteExcelFile("ChecklistConfig.xls");

	public Program_Tab_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}
	

	// ################ Home Page Page elements ###################################
	
	@FindBy(xpath = "//a[@class='btn-blue btn-gloss chatnow']")
	protected WebElement chatNowHeader;
	@FindBy(xpath = "//h1[contains(text(),'Program Overview')]")
	protected WebElement overviewHeading;
	@FindBy(xpath = "//a[@class='btn-savingsgraphic']/img")
	protected WebElement savingImageOverviewHeading;
	@FindBy(xpath = "//span[contains(text(),'GET INFO')]")
	protected WebElement requestInfoOverviewHeading;
	@FindBy(xpath = "//div[@class='unit module module-graphic module-graphic-left blue']/div/section/figure/img")
	protected WebElement figurerequestInfoOverviewHeading;
	@FindBy(xpath = "//span[contains(text(),'ENROLL NOW')]")
	protected WebElement enrollNowOverviewHeading;
	@FindBy(xpath = "//div[@class='unit module module-graphic module-graphic-left orange']/div/section/figure/img")
	protected WebElement figureEnrollNowOverviewHeading;
	@FindBy(xpath = "//h1[contains(text(),'Students Are Saying')]")
	protected WebElement StudentAreSayingHeadingOverviewHeading;	
	@FindBy(xpath = "//h1[contains(text(),'More Information')]")
	protected WebElement MoreInformationHeadingOverviewHeading;
	@FindBy(xpath = "//h1[contains(text(),'Related Programs')]")
	protected WebElement RelatedProgramsHeadingOverviewHeading;
	@FindBy(xpath = "//a[@id='phaside_2_rptItems_link_0']")
	protected WebElement StudentCommunityHeadingOverviewHeading;
	@FindBy(xpath = "//a[contains(text(),'Ask a Student')]")
	protected WebElement AskaStudentHeadingOverviewHeading;	
	@FindBy(xpath = "//a[contains(text(),'Student Testimonials')]")
	protected WebElement StudentTestimonialsHeadingOverviewHeading;
	@FindBy(xpath = "//h1[contains(text(),'Tools and Tips')]")
	protected WebElement ToolsandTipsHeadingOverviewHeading;
	@FindBy(xpath = "//a[contains(text(),'Tuition')]")
	protected WebElement TuitionandpaymentTab ;
	@FindBy(xpath = "//a[@id='ctl23_linkCareers']")
	protected WebElement CareersTab ;
	@FindBy(xpath = "//a[@id='ctl23_linkFAQ']")
	protected WebElement FAQTab ;
	@FindBy(xpath = "//a[@id='ctl23_linkAccreditation']")
	protected WebElement AccreditationTab ;
	@FindBy(xpath = "//div[@class='program_name']")
	protected WebElement GetCourseNameEOL ;
	
	
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
	protected WebElement step1TabOnEnrollmentFormForDomestic;
	@FindBy(xpath = "//a[@id='linkStep2']")
	protected WebElement step2TabOnEnrollmentFormForDomestic;
	@FindBy(xpath = "//a[@id='linkStep3']")
	protected WebElement step3TabOnEnrollmentFormForDomestic;

	
	
	@FindBy(xpath = "//h2[contains(text(),'Talk to us')]")
	protected WebElement TalkToUSHeadingOverviewHeading;
	@FindBy(xpath = "//h3[@class='phonenumber']")
	protected WebElement TalkToUSPhoneNumberHeadingOverviewHeading;	
	@FindBy(xpath = "//div[@class='unit module module-graphic module-graphic-left blue']/div/section/figure/img")
	protected WebElement figureTalkToUSHeadingOverviewHeading;
	@FindBy(xpath = "//a[@class='btn-blue btn-gloss large phonenumber']")
	protected WebElement GlobalPhoneNumber;
	@FindBy(xpath = "//a[contains(text(),'Who is')]")
	protected WebElement WhoIsItForTab;
	@FindBy(xpath = "//a[@id='ctl23_linkOutline']")
	protected WebElement ProgramOutLineTab;	
	@FindBy(xpath = "//a[@id='ctl18_lnkHeaderEnroll']")
	protected WebElement globalEnrollNowButton;
	@FindBy(xpath = "//span[contains(text(),'ENROLL NOW ')]")
	protected WebElement globalEnrollNowIcon;
	@FindBy(xpath = "//*[@id='ctl20_lnkHeaderGetInfo']")
	protected WebElement globalGetInfoButton;
	@FindBy(xpath = "//span[contains(text(),'GET INFO')]")
	protected WebElement requestInfoButton;
		
	@FindBy(xpath = "//b[contains(text(),'Thank You!')]")
	protected WebElement thnakyouPageAfterStep1FormPage;
	@FindBy(xpath = "//input[@value='Send Information']")
	protected WebElement sendInformationEOL;
	@FindBy(xpath = "//select[@name='Courseid']//option[@selected='selected']")
	protected WebElement getDropDownValueFromProgramOfIntrest;
	@FindBy(xpath = "//input[@id='phcontent_0_btnSubmit']")
	protected WebElement step2ButtonSiteCore;
	
	
	@FindBy(xpath = "//input[@value='Proceed To Step 2']")
	protected WebElement step2ButtonEOL;
	
	@FindBy(xpath = "//input[@value='Send Information']")
	protected WebElement sendInformationButtonEOL;
	
	
	@FindBy(xpath = "//input[@id='phcontent_0_btnSubmit']")
	protected WebElement sendInformationButtonSiteCore;
	@FindBy(xpath = "//div[@id='instruction']/div")
	protected WebElement getCourseNameEOLPage;
	
	@FindBy(name = "Courseid")
	protected WebElement courseidfield;
	@FindBy(name = "phcontent_0$txtFirstName")
	protected WebElement fnamefield;
	@FindBy(name = "phcontent_0$txtLastName")
	protected WebElement lnamefield;
	@FindBy(name = "phcontent_0$txtAddress")
	protected WebElement addressfield;
	@FindBy(name = "phcontent_0$txtAddress2")
	protected WebElement address2field;
	@FindBy(name = "phcontent_0$txtCity")
	protected WebElement cityfield;
	@FindBy(id = "phcontent_0_ddlxState")
	protected WebElement statefield;
	@FindBy(name = "phcontent_0$txtZip")
	protected WebElement zipfield;
	@FindBy(name = "phcontent_0$txtEmail")
	protected WebElement emailfield;
	@FindBy(name = "phcontent_0$txtPhone")
	protected WebElement phonenumberfield;
	@FindBy(id = "phcontent_0_btnSubmit")
	protected WebElement enrollsubmit;
	
	String GlobalPhone;
	Alert alert;
// ##################### Functions #####################################
	
	public void verifyAllTabsOnCourse()
	{				
		
		List <WebElement> str = driver.findElements(By.xpath("//div[@class='unit tier-tabs']/section/nav/ul/li/a"));
	    //System.out.println(str.size());		 
		Reporter.log(Utilities.logOutputFile("  Number of tabs display at course page "+str.size()+" - PASS"));

		
	    WebElement link = str.get(0);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().equals("OVERVIEW"));
	    Assert.assertTrue(link.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify OVERVIEW tab displays - PASS"));

	    
	    link = str.get(1);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().contains("WHO IS")&& 
	    		link.getText().contains("IT FOR?"));
	    Assert.assertTrue(link.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify WHO IS IT FOR? tab displays - PASS"));

	    
	    link = str.get(2);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().contains("PROGRAM") && 
	    		link.getText().contains("OUTLINE"));
	    Assert.assertTrue(link.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify OUTLINE tab displays - PASS"));

	    
	    link = str.get(3);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().contains("TUITION &") && 
	    		link.getText().contains("PAYMENT"));
	    Assert.assertTrue(link.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify TUITION & PAYMENT tab displays - PASS"));

	    
	    link = str.get(4);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().equals("CAREERS"));
	    Assert.assertTrue(link.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify CAREERS tab displays - PASS"));
	    
	    link = str.get(5);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().equals("FAQS"));
	    Assert.assertTrue(link.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify FAQS tab displays - PASS"));

	    
	    link = str.get(6);
	    //System.out.println(link.getText());
	    Assert.assertTrue(link.getText().equals("ACCREDITATION"));
	    Assert.assertTrue(link.isDisplayed());    
		Reporter.log(Utilities.logOutputFile("  Verify ACCREDITATION tab displays - PASS"));
		Reporter.log(Utilities.blankLine(""));

	    
	    GlobalPhone = GlobalPhoneNumber.getText();
		
	}
	
	public void navigateToOVERVIEWTab()
	{
		Assert.assertTrue(overviewHeading.isDisplayed());
		
			try{
			//savingImageOverviewHeading.isDisplayed();
			Reporter.log(Utilities.logOutputFile("  Verify Saving Image displays - PASS"));

			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
			Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Request Info displays - PASS"));

			Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify figure request Info displays - PASS"));

			Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

			try{
				figureEnrollNowOverviewHeading.isDisplayed();
				Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

				}catch(Exception e){
					Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Mouse Image does not dispaly with Enroll Now Link under 'OVERVIEW' tab - Warning</p>"));
				}
			Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

			Assert.assertTrue(StudentAreSayingHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Student Are Saying Heading displays - PASS"));

			Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));

			Assert.assertTrue(RelatedProgramsHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Related Programs Heading displays - PASS"));
			    
		    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

		    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US Heading displays - PASS"));

		    Utilities.hardWait(2);
		    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
			Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
			Reporter.log(Utilities.blankLine(""));
	
	}

	public void navigatetoWhoIsItForTab()
	{
		WhoIsItForTab.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Who It') and contains(text(),'s For')]")));
		
		try{
			//savingImageOverviewHeading.isDisplayed();
			Reporter.log(Utilities.logOutputFile("  Verify Saving Image displays - PASS"));
			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
		Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify request Info Heading displays - PASS"));

		Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure with request Info displays - PASS"));

		Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

		Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

		Assert.assertTrue(StudentAreSayingHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Student Are Saying Heading displays - PASS"));

		Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));

		Assert.assertTrue(ToolsandTipsHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Tools and Tips Heading displays - PASS"));

	    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

	    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US displays - PASS"));

	    Utilities.hardWait(2);
	    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
	    Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
		Reporter.log(Utilities.blankLine(""));
	
	}
	
	public void navigatetoProgramOutLineTAb(){
		ProgramOutLineTab.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Program Outline')]")));
		
		try{
			//savingImageOverviewHeading.isDisplayed();
			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
			Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify request Info Heading displays - PASS"));

			Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Figure with request Info displays - PASS"));

			Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

			Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

//			Assert.assertTrue(StudentAreSayingHeadingOverviewHeading.isDisplayed());
//			Reporter.log(Utilities.logOutputFile("  Verify Student Are Saying Heading displays - PASS"));

			Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));
			
			Assert.assertTrue(RelatedProgramsHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Related Programs Heading displays - PASS"));



			Assert.assertTrue(ToolsandTipsHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Tools and Tips Heading displays - PASS"));

		    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

		    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
			Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US displays - PASS"));
			
			Utilities.hardWait(2);
			Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
			Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
			Reporter.log(Utilities.blankLine(""));
			
			
//			Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
//			Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
//			Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
//			Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
//			Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
//			Assert.assertTrue(RelatedProgramsHeadingOverviewHeading.isDisplayed());
//			Assert.assertTrue(ToolsandTipsHeadingOverviewHeading.isDisplayed());
//		    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
//		    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
//		    Utilities.hardWait(2);
//		    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
	   
	}
	
	public void navigatetoTuitionandpaymentTAb(){
		TuitionandpaymentTab.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Tuition & Payment Option')]")));
		Reporter.log(Utilities.logOutputFile("  Verify Tuition & Payment Option Heading displays - PASS"));

		try{
			////savingImageOverviewHeading.isDisplayed();
			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
		Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Request Info displays - PASS"));
		
		Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify figure request Info displays - PASS"));

		Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

		Assert.assertTrue(StudentAreSayingHeadingOverviewHeading.isDisplayed());	
		Reporter.log(Utilities.logOutputFile("  Verify Student Are Saying Heading displays - PASS"));

		Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));

		Assert.assertTrue(RelatedProgramsHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Related Programs Heading displays - PASS"));

	    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

	    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US Heading displays - PASS"));

	    Utilities.hardWait(2);
	    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
	    Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
		Reporter.log(Utilities.blankLine(""));
	
	}
	
	public void navigatetoCareersTAb(){
		CareersTab.click();
//		Utilities.hardWait(5);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Designed to Help You Succeed')]")));
		String str = driver.findElement(By.xpath("//h1[contains(text(),'Penn Foster’s career services')]")).getText();
		Assert.assertTrue(str.contains("Penn Foster’s career services") && str.contains("will help you land your dream job"));
		try{
			//savingImageOverviewHeading.isDisplayed();
			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
		Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Request Info displays - PASS"));

		Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify figure request Info displays - PASS"));

		Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

		Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

		Assert.assertTrue(StudentAreSayingHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Student Are Saying Heading displays - PASS"));

		Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));

	    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

	    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US Heading displays - PASS"));

	    Utilities.hardWait(2);
	    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
	    Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
		Reporter.log(Utilities.blankLine(""));
		
	}

	public void navigatetoFAQsTAb(){
		FAQTab.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Frequently Asked Questions')]")));
		try{
			//savingImageOverviewHeading.isDisplayed();
			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
		Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Request Info displays - PASS"));

		Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify figure request Info displays - PASS"));

		Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

		Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

		Assert.assertTrue(StudentAreSayingHeadingOverviewHeading.isDisplayed());	
		Reporter.log(Utilities.logOutputFile("  Verify Student Are Saying Heading displays - PASS"));

		Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));

		Assert.assertTrue(RelatedProgramsHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Related Programs Heading displays - PASS"));

		Assert.assertTrue(ToolsandTipsHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Tools and Tips Heading displays - PASS"));

		
	    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

	    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US Heading displays - PASS"));

	    Utilities.hardWait(2);
	    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
	    Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
		Reporter.log(Utilities.blankLine(""));
	
	}

	public void navigatetoAccreditationTAb(){
		AccreditationTab.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Accreditation')]")));
		try{
			//savingImageOverviewHeading.isDisplayed();
			}catch(Exception e){
				Reporter.log(Utilities.logOutputFile("<p style=\"color: #000000; background-color: #ffff00\">Saving image does not display under 'OVERVIEW' tab - Warning</p>"));
			}
		Assert.assertTrue(requestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Request Info displays - PASS"));

		Assert.assertTrue(figurerequestInfoOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify figure request Info displays - PASS"));

		Assert.assertTrue(enrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Enroll Now displays - PASS"));

		Assert.assertTrue(figureEnrollNowOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Enroll Now displays - PASS"));

		Assert.assertTrue(MoreInformationHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify More Information Heading displays - PASS"));

		Assert.assertTrue(RelatedProgramsHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Related Programs Heading displays - PASS"));

	    Assert.assertTrue(TalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Talk To US Heading displays - PASS"));

	    Assert.assertTrue(figureTalkToUSHeadingOverviewHeading.isDisplayed());
		Reporter.log(Utilities.logOutputFile("  Verify Figure Talk To US Heading displays - PASS"));

	    Utilities.hardWait(2);
	    Assert.assertTrue(TalkToUSPhoneNumberHeadingOverviewHeading.getText().equals(GlobalPhone));
	    Reporter.log(Utilities.logOutputFile("  Verify phone number associated with Talk To US Heading displays - PASS"));
		Reporter.log(Utilities.blankLine(""));
				
	}
	
	public void verifyGoogleAnalyticsScript(String CourseCodefetch){
		String GetCategory = driver.findElement(By.xpath("//a[@id='ctl22_rptBreadcrumb_link_1']")).getText();
		String CompleteSourceCode = driver.getPageSource();
		String SaturatedScript = Utilities.getScript(CompleteSourceCode, "var _gaq = _gaq || []");
		Reporter.log(Utilities.logOutputFile(" GA script find in page source - PASS "));

		String AccountInfo = StringUtils.substringBetween(SaturatedScript, "_setAccount', '", "']);");
		String DomainName = StringUtils.substringBetween(SaturatedScript, "_setDomainName', '", "']);");
		String CourseCode = StringUtils.substringBetween(SaturatedScript, "'Program','", "',3]);");
		String Category = StringUtils.substringBetween(SaturatedScript, "'Category','", "',3]);");
		String FinalFunction = StringUtils.substringBetween(SaturatedScript, "(function() {", "})();");
		Reporter.log(Utilities.logOutputFile(" GA script Account value : "+AccountInfo));
		Reporter.log(Utilities.logOutputFile(" GA script Domain Name value : "+DomainName));
		Reporter.log(Utilities.logOutputFile(" GA script Course Code value : "+CourseCode));
		Reporter.log(Utilities.logOutputFile(" GA script Category value : "+Category));
		Reporter.log(Utilities.logOutputFile(" GA script FinalFunction is : "+"(function() {"+FinalFunction+"})();"));

		Assert.assertTrue(AccountInfo.length()>3);
		Reporter.log(Utilities.logOutputFile(" GA script Account Info displays - PASS "));

		Assert.assertTrue(DomainName.equals(".pennfoster.edu"));
		Reporter.log(Utilities.logOutputFile(" GA script Domain Name displays - PASS "));

		Assert.assertTrue(GetCategory.equalsIgnoreCase(Category));
		Reporter.log(Utilities.logOutputFile(" GA script Category for course displays - PASS "));

		Assert.assertTrue(FinalFunction.length()>10);
		Reporter.log(Utilities.logOutputFile(" GA script Final Function displays - PASS "));

		System.out.println("CourseCode : "+CourseCode);
		Reporter.log(Utilities.logOutputFile(" GA script CourseCode displays - PASS "));

		System.out.println("CourseCodefetch : "+ CourseCodefetch);
		Assert.assertTrue(CourseCode.equalsIgnoreCase(CourseCodefetch));
		Reporter.log(Utilities.logOutputFile(" GA script CourseCode Compared - PASS "));


//		System.out.println("AccountInfo : "+AccountInfo);
//		System.out.println("DomainName : "+ DomainName);
		System.out.println("CourseCode : "+ CourseCode);
//		System.out.println("Category : "+Category);
//		System.out.println("FinalFunction : "+FinalFunction);
		
	}
	
	public void verifyGetInfo(String CourseName){
		
		Assert.assertTrue(globalGetInfoButton.isDisplayed());
		globalGetInfoButton.click();
		
		Reporter.log(Utilities.logOutputFile(" Verify Global Get Info Link - PASS "));

		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user navigate to form page by using Global Get Info Link - PASS "));

		
		Assert.assertTrue(sendInformationButtonSiteCore.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Request Information button display on form - PASS "));

		System.out.println("Get Corse Name EOL : "+getDropDownValueFromProgramOfIntrest.getText());
		
		System.out.println("Couse Name : "+CourseName );
		Assert.assertTrue(getDropDownValueFromProgramOfIntrest.getText().equalsIgnoreCase(CourseName));
		Reporter.log(Utilities.logOutputFile(" Verify program of interest display correct value as per program selected - PASS "));
		Reporter.log(Utilities.blankLine(""));

		
//		driver.navigate().back();
//		wait = new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl22_rptBreadcrumb_link_0']")));
			
	}
	
	public void verifyRequestInfo(String CourseName , String CnameEOL){
		
		Assert.assertTrue(requestInfoButton.isDisplayed());
		requestInfoButton.click();
		Reporter.log(Utilities.logOutputFile(" Verify Request Info Link displays - PASS "));

		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user navigate to form page by using Request Info Link - PASS "));

		
		Assert.assertTrue(sendInformationButtonSiteCore.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Request Information button display on form - PASS "));

		System.out.println("Get Corse Name EOL : "+getDropDownValueFromProgramOfIntrest.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getDropDownValueFromProgramOfIntrest.getText().equalsIgnoreCase(CourseName));	
		Reporter.log(Utilities.logOutputFile(" Verify program of interest display correct value as per program selected - PASS "));
		Reporter.log(Utilities.blankLine(""));

					
	}
	
	
public void verifyRequestInfo(String CnameEOL){
		
		Assert.assertTrue(requestInfoButton.isDisplayed());
		requestInfoButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
		
		Assert.assertTrue(sendInformationEOL.isDisplayed());
		
		System.out.println("Get Corse Name EOL : "+getCourseNameEOLPage.getText());
		
		System.out.println("Couse NAme : "+CnameEOL );
		Assert.assertTrue(getCourseNameEOLPage.getText().equalsIgnoreCase(CnameEOL));
		
		driver.navigate().back();
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl18_lnkHeaderEnroll']")));
			
	}
	
	
	public void verifyFieldsOnPage(){
		Assert.assertTrue(courseidfield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Program Of Intrest drop down displays - PASS "));

		Assert.assertTrue(fnamefield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify First Name Text box displays - PASS "));

		Assert.assertTrue(lnamefield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Last Name Text box displays - PASS "));

		Assert.assertTrue(addressfield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Address Text box displays - PASS "));

		Assert.assertTrue(address2field.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Address2 Text box displays - PASS "));

		Assert.assertTrue(cityfield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify city Text box displays - PASS "));

		Assert.assertTrue(statefield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify State field displays - PASS "));

		Assert.assertTrue(zipfield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify ZIP field displays - PASS "));

		Assert.assertTrue(emailfield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify email field displays - PASS "));

		Assert.assertTrue(phonenumberfield.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Phone Number field displays - PASS "));

		Assert.assertTrue(enrollsubmit.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Enroll button displays - PASS "));
		Reporter.log(Utilities.blankLine(""));

	}

	public void verifyRequiredfields()
	{
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}	
		alert = driver.switchTo().alert();
//		System.out.println("alert text is:"+alert.getText());
        Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
//        Assert.assertTrue(alert.getText().contains("Program of Interest"));
        Assert.assertTrue(alert.getText().contains("First Name"));
        Assert.assertTrue(alert.getText().contains("Last Name"));
        Assert.assertTrue(alert.getText().contains("Address"));
        Assert.assertTrue(alert.getText().contains("City"));
        Assert.assertTrue(alert.getText().contains("State"));
        Assert.assertTrue(alert.getText().contains("Zip"));
        Assert.assertTrue(alert.getText().contains("Email"));
        Assert.assertTrue(alert.getText().contains("Phone"));
        alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave all fields blank - PASS "));
		Reporter.log(Utilities.blankLine(""));

        
        //* reporter logs *//
        // required fields are 
	}
		
	public void verifySinglefieldsEnrollNow()
	{
		//* Verify for Program of Interest *//
		fnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		addressfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		Select sel = new Select(statefield);
		sel.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		zipfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		emailfield.sendKeys("test123@pennfoster.edu");
		phonenumberfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
//		enrollsubmit.click();
//		alert = driver.switchTo().alert();
//		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
//        Assert.assertTrue(alert.getText().contains("Program of Interest"));
//		alert.accept();
//		
		//* Verify for First name *//
//		Select sel1 = new Select(courseidfield);
//		sel1.selectByVisibleText("High School with a Health Care Concentration");
		fnamefield.clear();
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("First Name"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave First Name fields blank - PASS "));

		
		//* Verify for Last name *//
		fnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lnamefield.clear();
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Last Name"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Last Name fields blank - PASS "));
		
		//* Verify for Address *//
		lnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		addressfield.clear();
		
		
		
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}
		
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Address"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Address fields blank - PASS "));

		
		//* Verify for City *//
		addressfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityfield.clear();
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("City"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave City fields blank - PASS "));

		
		//* Verify for State *//
		cityfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		sel.selectByVisibleText("Select a State");
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("State"));
		alert.accept();	
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave State fields blank - PASS "));

		
		//* Verify for ZIP *//
		sel.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		zipfield.clear();
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Zip"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave ZIP fields blank - PASS "));

		
		//* Verify for Email *//
		zipfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		emailfield.clear();
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}
		
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Email"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Email fields blank - PASS "));

		
		//* Verify for Phone *//
		emailfield.sendKeys("test123@pennfoster.edu");
		phonenumberfield.clear();
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Phone"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Phone fields blank - PASS "));
		Reporter.log(Utilities.blankLine(""));

		
		phonenumberfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			enrollsubmit.click();
			Utilities.hardWait(2);

		}
		else
		{
			enrollsubmit.click();

		}
		}
	
	public void verifyThankyouPage(String CnameEOL){
		WebDriverWait wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Thank You!')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user readirect to Thank you Page at EOL - PASS "));

		Assert.assertTrue(thnakyouPageAfterStep1FormPage.isDisplayed());
		
		System.out.println("CnameEOL : "+CnameEOL);
		System.out.println("GetCourseNameEOL: "+GetCourseNameEOL.getText());
		
		Assert.assertTrue(GetCourseNameEOL.getText().equalsIgnoreCase(CnameEOL));
		Reporter.log(Utilities.logOutputFile(" Verify EOL display correct course name as selected at sitecore - PASS "));

		
		
		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			System.out.println("ENTER in IE");
			driver.navigate().back();
			Utilities.hardWait(2);
			driver.navigate().back();
			Utilities.hardWait(2);
			driver.navigate().back();
			
		}else{
			driver.navigate().back();
			Utilities.hardWait(2);
			driver.navigate().back();
			
		}
		wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Info')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user readirect back to Sitecore - PASS "));
		Reporter.log(Utilities.blankLine(""));

		
	}
		
	public void backToverifyRequestInfo(){
		driver.navigate().back();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl22_rptBreadcrumb_link_0']")));
	}
	
	public void verifyEnrollNowEOL(String CourseName){
		
		Assert.assertTrue(globalEnrollNowButton.isDisplayed());
		globalEnrollNowButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
		
		Assert.assertTrue(step2ButtonEOL.isDisplayed());
		
		System.out.println("Get Corse Name EOL : "+getCourseNameEOLPage.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getCourseNameEOLPage.getText().equalsIgnoreCase(CourseName));
		
		driver.navigate().back();
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl18_lnkHeaderEnroll']")));
	}	
	
	public void verifyEnrollNow(String CourseName){
		
		Assert.assertTrue(globalEnrollNowButton.isDisplayed());
		globalEnrollNowButton.click();
		Reporter.log(Utilities.logOutputFile(" Verify Global Enroll Now Link displays - PASS "));

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user redirect to form page using kink Global Enroll Now displays - PASS "));

		Assert.assertTrue(step2ButtonSiteCore.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Enroll Now button displays on Form - PASS "));

		System.out.println("Get Corse Name EOL : "+getDropDownValueFromProgramOfIntrest.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getDropDownValueFromProgramOfIntrest.getText().equalsIgnoreCase(CourseName));
		Reporter.log(Utilities.logOutputFile(" Verify program of interest display correct value as per program selected - PASS "));
		Reporter.log(Utilities.blankLine(""));			
	}	
	
	public void verifyGetInfoEOL(String CourseName){
		
		Assert.assertTrue(globalGetInfoButton.isDisplayed());
		globalGetInfoButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
		
		Assert.assertTrue(sendInformationButtonEOL.isDisplayed());
		
		System.out.println("Get Corse Name EOL : "+getCourseNameEOLPage.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getCourseNameEOLPage.getText().equalsIgnoreCase(CourseName));
		
		driver.navigate().back();
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl18_lnkHeaderEnroll']")));
			
	}
	
	public void verifyEnrollNowIconEOL(String CourseName){
		
		Assert.assertTrue(globalEnrollNowIcon.isDisplayed());
		globalEnrollNowIcon.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
		
		Assert.assertTrue(step2ButtonEOL.isDisplayed());
		
		System.out.println("Get Corse Name EOL : "+getCourseNameEOLPage.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getCourseNameEOLPage.getText().equalsIgnoreCase(CourseName));
		
		driver.navigate().back();
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl18_lnkHeaderEnroll']")));
			
	}
	
	public void verifyStep1Page(String CnameEOL){
		WebDriverWait wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Proceed To Step 2']")));
		Reporter.log(Utilities.logOutputFile(" Verify user redirect to EOL page Step1 - PASS "));

		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Proceed To Step 2']")).isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Step2 button displays on Step1 Page - PASS "));

		System.out.println("CnameEOL : "+CnameEOL);
		System.out.println("GetCourseNameEOL: "+GetCourseNameEOL.getText());
		
		Assert.assertTrue(GetCourseNameEOL.getText().equalsIgnoreCase(CnameEOL));
		Reporter.log(Utilities.logOutputFile(" Verify course name display on Step1 page as per course selected at Sitecore - PASS "));

		
		Assert.assertTrue(proceedToStep2Button.isDisplayed());
		Assert.assertTrue(firstNameTextBoxOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify first name display at Step1 page - PASS "));

		Assert.assertTrue(firstNameTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(firstNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName")));
		Reporter.log(Utilities.logOutputFile(" Verify first name display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(lastNameTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(lastNameTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify last name display at Step1 page - PASS "));

		Assert.assertTrue(lastNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName")));
		Reporter.log(Utilities.logOutputFile(" Verify last name display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(emailTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(emailTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify email field display at Step1 page - PASS "));

		Assert.assertTrue(emailTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase("test123@pennfoster.edu"));
		Reporter.log(Utilities.logOutputFile(" Verify email display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(reTypeEmailTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify retype email field display at Step1 page - PASS "));

		Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase("test123@pennfoster.edu"));
		Reporter.log(Utilities.logOutputFile(" Verify retypr email display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(primaryPhoneTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify phone number field display at Step1 page - PASS "));

		Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone")));
		Reporter.log(Utilities.logOutputFile(" Verify phone number display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(address1TextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(address1TextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify address field display at Step1 page - PASS "));

                        System.out.println("address is" +address1TextBoxOnStep1Page.getAttribute("value"));
                        System.out.println("expected address is " +Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		Assert.assertTrue(address1TextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address")));
		Reporter.log(Utilities.logOutputFile(" Verify Address display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(address2TextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(address2TextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify address2 field display at Step1 page - PASS "));

		Assert.assertTrue(cityTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(cityTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify city field display at Step1 page - PASS "));

		Assert.assertTrue(cityTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City")));
		Reporter.log(Utilities.logOutputFile(" Verify City display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(stateTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(stateTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify state field display at Step1 page - PASS "));

		Assert.assertTrue(zipTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(zipTextBoxLabelOnStep1Page.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify ZIP field display at Step1 page - PASS "));

		Assert.assertTrue(zipTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP")));
		Reporter.log(Utilities.logOutputFile(" Verify ZIP display correct value as entered on sitecore - PASS "));

		Assert.assertTrue(communicateViaEmailCheckbox.isDisplayed());					
		Assert.assertTrue(communicateViaEmailCheckboxLabel.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify communicate Via Email Checkbox field display at Step1 page - PASS "));

		Assert.assertTrue(communicateViaTextMsgCheckbox.isDisplayed());					
		Assert.assertTrue(communicateViaTextMsgCheckboxLabel.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify communicate Via Text Checkbox field display at Step1 page - PASS "));

		Assert.assertTrue(mobilePhoneTypeRadioButton.isDisplayed());					
		Assert.assertTrue(mobilePhoneTypeRadioButtonLabel.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify mobile Phone Type Radio field display at Step1 page - PASS "));

		Assert.assertTrue(otherPhoneTypeRadioButton.isDisplayed());					
		Assert.assertTrue(otherPhoneTypeRadioButtonLabel.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify other Phone Type Radio field display at Step1 page - PASS "));

		Assert.assertTrue(phoneTypeRadioButtonLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(dobTextBoxLabelOnStep1PersonalInformationPage.isDisplayed());		
		Reporter.log(Utilities.logOutputFile(" Verify DOB text field display at Step1 page - PASS "));

		Assert.assertTrue(monthTextboxDOBOnStep1PersonalInformationPage.isDisplayed());		
		Reporter.log(Utilities.logOutputFile(" Verify DOB month field display at Step1 page - PASS "));

		Assert.assertTrue(dayTextboxDOBOnStep1PersonalInformationPage.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify DOB Day field display at Step1 page - PASS "));

		Assert.assertTrue(yearTextboxDOBOnStep1PersonalInformationPage.isDisplayed());	
		Reporter.log(Utilities.logOutputFile(" Verify DOB year field display at Step1 page - PASS "));

		Assert.assertTrue(levelOFEductionLabelOnStep1PersonalInformationPage.isDisplayed());		
		Assert.assertTrue(levelOFEductionDropDownOnStep1PersonalInformationPage.isDisplayed());	
		Reporter.log(Utilities.logOutputFile(" Verify level of education field display at Step1 page - PASS "));

		Assert.assertTrue(genderLabelOnStep1PersonalInformationPage.isDisplayed());		
		Assert.assertTrue(genderDropDownOnStep1PersonalInformationPage.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Gender field display at Step1 page - PASS "));

		Assert.assertTrue(step1TabOnEnrollmentFormForDomestic.isDisplayed());
		Assert.assertTrue(step2TabOnEnrollmentFormForDomestic.isDisplayed());
		Assert.assertTrue(step3TabOnEnrollmentFormForDomestic.isDisplayed());

		if (Utilities.getYamlValue("browser").equalsIgnoreCase("iexplore")){
			System.out.println("ENTER in IE");
			driver.navigate().back();
			Utilities.hardWait(2);
			driver.navigate().back();
			Utilities.hardWait(2);
			driver.navigate().back();
			
		}else{
			driver.navigate().back();
			Utilities.hardWait(2);
			driver.navigate().back();
			
		}
		wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Info')]")));
		Reporter.log(Utilities.logOutputFile(" Verify navigate back to SiteCore - PASS "));

		Reporter.log(Utilities.blankLine(""));

		
	}
		
	public void verifyEnrollNowIcon(String CourseName){
		
		Assert.assertTrue(globalEnrollNowIcon.isDisplayed());
		globalEnrollNowIcon.click();
		Reporter.log(Utilities.logOutputFile(" Verify Enroll Now Link image displays - PASS "));

		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user redirect to form page using kink Global Enroll Now displays - PASS "));

		Assert.assertTrue(step2ButtonSiteCore.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Enroll Now button displays on Form - PASS "));
		
		System.out.println("Get Corse Name EOL : "+getDropDownValueFromProgramOfIntrest.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getDropDownValueFromProgramOfIntrest.getText().equalsIgnoreCase(CourseName));
		Reporter.log(Utilities.logOutputFile(" Verify program of interest display correct value as per program selected - PASS "));
		Reporter.log(Utilities.blankLine(""));
		
//		driver.navigate().back();
//		wait = new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl22_rptBreadcrumb_link_0']")));
			
	}
	
	
	}

