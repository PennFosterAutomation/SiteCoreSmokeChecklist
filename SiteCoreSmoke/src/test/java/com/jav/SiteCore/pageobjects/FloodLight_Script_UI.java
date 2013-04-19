package com.jav.SiteCore.pageobjects;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class FloodLight_Script_UI extends AbstractClass {

	Alert alert;
WebDriver driver;
	
	ReadWriteExcelFile writeResult = new ReadWriteExcelFile("ChecklistConfig.xls");

	public FloodLight_Script_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	// ################ Home Page Page elements
	// ###################################
	@FindBy(xpath = "//nav[@class='global cta span6']/div[2]/a")
	protected WebElement enrollbutton;
	@FindBy(xpath = "//span[contains(text(),'REQUEST INFO')]")
	protected WebElement requestInfoimage;
	@FindBy(xpath = "//span[contains(text(),'ENROLL NOW')]")
	protected WebElement enrollimage;	

	
	@FindBy(xpath = "//div[@id='page-logo']")
	protected WebElement pennFosterLogo;
	@FindBy(xpath = "(//a[contains(text(),'Programs')])[2]")
	protected WebElement programsAndDegreesTab;
	@FindBy(linkText = "VIEW ALL PROGRAMS & DEGREES")
	protected WebElement viewAllPrograms;
	@FindBy(xpath = "//a[@id='ctl18_lnkHeaderEnroll']")
	protected WebElement globalEnrollNowButton;
	@FindBy(xpath = "//input[@id='phcontent_0_btnSubmit']")
	protected WebElement step2ButtonEOL;
	@FindBy(xpath = "(//option[@selected='selected'])[1]")
	protected WebElement getDropDownValueFromProgramOfIntrest;
	@FindBy(xpath = "//input[@value='Proceed To Step 2']")
	protected WebElement step2ButtonEOLEnable;
	
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
	@FindBy(xpath = "//div[@class='program_name']")
	protected WebElement GetCourseNameEOL; 
	@FindBy(css = "input[value='OK']")
	protected WebElement okButtonValidationPopUp;
	@FindBy(xpath = "//span[contains(text(),'REQUEST INFO')]")
	protected WebElement requestInfoButton;
	@FindBy(xpath = "//input[@id='phcontent_0_btnSubmit']")
	protected WebElement sendInformationButtonEOL;
	@FindBy(xpath = "//b[contains(text(),'Thank You!')]")
	protected WebElement thnakyouPageAfterStep1FormPage;
	@FindBy(xpath = "//div[@id='instruction']/div")
	protected WebElement getCourseNameEOLPage;
	@FindBy(xpath = "//input[@value='Send Information']")
	protected WebElement sendInformationEOL;
	
	
	
	
	
	public void clickOnCourse(String courseName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(courseName)));
		driver.findElement(By.linkText(courseName)).click();
		Reporter.log(Utilities.logOutputFile("course clicked- PASS"));
	}
	
	public void verifyHomePageSiteCore()
    {       	
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-logo']")));
		Assert.assertTrue(pennFosterLogo.isDisplayed());  
		Reporter.log(Utilities.logOutputFile(" Penn Foster logo displays on Landing Page - Pass"));
    }
	
	public void clickProgramAndDegreesTab()
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Programs')])[2]")));
			programsAndDegreesTab.click();
			Reporter.log(Utilities.logOutputFile("Programs and Degrees tab displays - Pass"));
			Reporter.log(Utilities.logOutputFile("programs and degrees tab clicked - Pass"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Reporter.log(Utilities.logOutputFile("programs and degrees tab clicked - Fail "+e));
			e.printStackTrace();
		}
	}
		
	public void clickViewAllPrograms()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW ALL PROGRAMS & DEGREES")));
		viewAllPrograms.click();
		Reporter.log(Utilities.logOutputFile("verify View all programs link displays - PASS"));
		Reporter.log(Utilities.logOutputFile("View all programs link clicked- PASS"));
	}
	
	public void verifyEnrollNow(String CourseName){
		
		Assert.assertTrue(globalEnrollNowButton.isDisplayed());
		globalEnrollNowButton.click();
		Reporter.log(Utilities.logOutputFile(" Verify Global Enroll Now Link displays - PASS "));

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user redirect to form page using kink Global Enroll Now displays - PASS "));

		Assert.assertTrue(step2ButtonEOL.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Enroll Now button displays on Form - PASS "));

		System.out.println("Get Corse Name EOL : "+getDropDownValueFromProgramOfIntrest.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getDropDownValueFromProgramOfIntrest.getText().equalsIgnoreCase(CourseName));
		Reporter.log(Utilities.logOutputFile(" Verify program of interest display correct value as per program selected - PASS "));
		Reporter.log(Utilities.blankLine(""));			
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
		enrollsubmit.click();
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

		
		fnamefield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("First Name"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave First Name fields blank - PASS "));

		
		//* Verify for Last name *//
		fnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lnamefield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Last Name"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Last Name fields blank - PASS "));
		
		//* Verify for Address *//
		lnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		addressfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Address"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Address fields blank - PASS "));

		
		//* Verify for City *//
		addressfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("City"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave City fields blank - PASS "));

		
		//* Verify for State *//
		cityfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		sel.selectByVisibleText("Select a State");
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("State"));
		alert.accept();	
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave State fields blank - PASS "));

		
		//* Verify for ZIP *//
		sel.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		zipfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Zip"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave ZIP fields blank - PASS "));

		
		//* Verify for Email *//
		zipfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		emailfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Email"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Email fields blank - PASS "));

		
		//* Verify for Phone *//
		emailfield.sendKeys("test123@pennfoster.edu");
		phonenumberfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Phone"));
		alert.accept();
		Reporter.log(Utilities.logOutputFile(" Verify aler message when user leave Phone fields blank - PASS "));
		Reporter.log(Utilities.blankLine(""));

		
		phonenumberfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
		enrollsubmit.click();
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
		
		Select select = new Select(levelOFEductionDropDownOnStep1PersonalInformationPage);
		select.selectByValue("16");
		Select selectgender = new Select(genderDropDownOnStep1PersonalInformationPage);
		selectgender.selectByValue("M");
		
		monthTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOBmonth"));
		dayTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOBday"));
		yearTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOByear"));
		otherPhoneTypeRadioButton.click();
		
		String CompleteSourceCode = driver.getPageSource();
		String SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Reporter.log(Utilities.logOutputFile(" FloodLight script display at Step1 page : "+SaturatedScript));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Assert.assertTrue(SaturatedScript.contains("type=formc755"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=formc755' at Step1 page "));

		
		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script display at Step1 page : "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=formc755"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=formc755' at Step1 page "));

		
		
		proceedToStep2Button.click();
		
//		#####################################################
		try{
			okButtonValidationPopUp.click();
			proceedToStep2Button.click();
		}catch(Exception e){
			
		}
//		#####################################################	
		

		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='lnkPromoCode']")));
		
		CompleteSourceCode = driver.getPageSource();

		
		SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));


		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));
		Reporter.log(Utilities.blankLine(""));

		
	}
	
	public void verifyRequestInfo(String CourseName){
		
		Assert.assertTrue(requestInfoButton.isDisplayed());
		requestInfoButton.click();
		Reporter.log(Utilities.logOutputFile(" Verify Request Info Link displays - PASS "));

		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'First Name')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user navigate to form page by using Request Info Link - PASS "));

		
		Assert.assertTrue(sendInformationButtonEOL.isDisplayed());
		Reporter.log(Utilities.logOutputFile(" Verify Request Information button display on form - PASS "));
		System.out.println("Get Corse Name EOL : "+getDropDownValueFromProgramOfIntrest.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getDropDownValueFromProgramOfIntrest.getText().equalsIgnoreCase(CourseName));	
		Reporter.log(Utilities.logOutputFile(" Verify program of interest display correct value as per program selected - PASS "));
		Reporter.log(Utilities.blankLine(""));

					
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
		
		String CompleteSourceCode = driver.getPageSource();

		
		String SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));


		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS "));
		
	}
	
	public void verifyEnrollNowEOLEnable(String CourseName){
		
		Assert.assertTrue(globalEnrollNowButton.isDisplayed());
		globalEnrollNowButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
		
		Assert.assertTrue(step2ButtonEOLEnable.isDisplayed());
		
		System.out.println("Get Corse Name EOL : "+getCourseNameEOLPage.getText());
		
		System.out.println("Couse NAme : "+CourseName );
		Assert.assertTrue(getCourseNameEOLPage.getText().equalsIgnoreCase(CourseName));
		
//		driver.navigate().back();
//		wait = new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl18_lnkHeaderEnroll']")));
		
		
		
		firstNameTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lastNameTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		emailTextBoxOnStep1Page.sendKeys("test123@pennfoster.edu");
		reTypeEmailTextBoxOnStep1Page.sendKeys("test123@pennfoster.edu");
		primaryPhoneTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
		address1TextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		zipTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		otherPhoneTypeRadioButton.click();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlState']")));
		select.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		
		select = new Select(levelOFEductionDropDownOnStep1PersonalInformationPage);
		select.selectByValue("16");
		Select selectgender = new Select(genderDropDownOnStep1PersonalInformationPage);
		selectgender.selectByValue("M");
		
		monthTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOBmonth"));
		dayTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOBday"));
		yearTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOByear"));
		
		String CompleteSourceCode = driver.getPageSource();
		String SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Reporter.log(Utilities.logOutputFile(" FloodLight script display at Step1 page : "+SaturatedScript));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Assert.assertTrue(SaturatedScript.contains("type=formc755"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=formc755' at Step1 page "));

		
		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script display at Step1 page : "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=formc755"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=formc755' at Step1 page "));

		
		
		proceedToStep2Button.click();
		
//		#####################################################
		try{
			okButtonValidationPopUp.click();
			proceedToStep2Button.click();
		}catch(Exception e){
			
		}
//		#####################################################	
		

		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='lnkPromoCode']")));
		
		CompleteSourceCode = driver.getPageSource();

		
		SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));


		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));
		Reporter.log(Utilities.blankLine(""));

		
		
	}	
	
	
	public void verifyRequestInfoEnable(String CnameEOL){
		
		Assert.assertTrue(requestInfoButton.isDisplayed());
		requestInfoButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[contains(text(),'* First Name')]")));
		
		Assert.assertTrue(sendInformationEOL.isDisplayed());
		
		System.out.println("Get Corse Name EOL : "+getCourseNameEOLPage.getText());
		
		System.out.println("Couse NAme : "+CnameEOL );
		Assert.assertTrue(getCourseNameEOLPage.getText().equalsIgnoreCase(CnameEOL));
		
//		driver.navigate().back();
//		wait = new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl18_lnkHeaderEnroll']")));
//			

		firstNameTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lastNameTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		emailTextBoxOnStep1Page.sendKeys("test123@pennfoster.edu");
		reTypeEmailTextBoxOnStep1Page.sendKeys("test123@pennfoster.edu");
		primaryPhoneTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
		address1TextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		zipTextBoxOnStep1Page.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		otherPhoneTypeRadioButton.click();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ctl00_MasterContentPlaceHolder_NestedMasterContentPlaceHolder_Form_ddlState']")));
		select.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		
//		select = new Select(levelOFEductionDropDownOnStep1PersonalInformationPage);
//		select.selectByValue("16");
//		Select selectgender = new Select(genderDropDownOnStep1PersonalInformationPage);
//		selectgender.selectByValue("M");
//		
//		monthTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOBmonth"));
//		dayTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOBday"));
//		yearTextboxDOBOnStep1PersonalInformationPage.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.DOByear"));
		
		String CompleteSourceCode = driver.getPageSource();
		String SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Reporter.log(Utilities.logOutputFile(" FloodLight script display at Step1 page : "+SaturatedScript));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Assert.assertTrue(SaturatedScript.contains("type=formc755"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=formc755' at Step1 page "));

		
		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script display at Step1 page : "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=formc755"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=formc755' at Step1 page "));

		
		sendInformationEOL.click();
		
//		#####################################################
		try{
			okButtonValidationPopUp.click();
			sendInformationEOL.click();
		}catch(Exception e){
			
		}
//		#####################################################	
		

		 wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Thank You!')]")));
		Reporter.log(Utilities.logOutputFile(" Verify user readirect to Thank you Page at EOL - PASS "));
		
		CompleteSourceCode = driver.getPageSource();

		
		SaturatedScript = Utilities.getScript(CompleteSourceCode, "axel = Math.random()");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));
		Reporter.log(Utilities.blankLine(""));
		Reporter.log(Utilities.blankLine(""));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));


		SaturatedScript = Utilities.getFloodLightScript(CompleteSourceCode, "iframe src=");
		System.out.println(SaturatedScript);
		Reporter.log(Utilities.logOutputFile(" FloodLight script at Payment Page "+SaturatedScript));

		Assert.assertTrue(SaturatedScript.contains("type=thank274"));
		Reporter.log(Utilities.logOutputFile(" Verify FloodLight script contains 'type=thank274' at Payment Page - PASS"));
		Reporter.log(Utilities.blankLine(""));

		
		
	}

	
	
	
}
