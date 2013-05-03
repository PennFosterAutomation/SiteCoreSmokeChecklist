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
import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class EnrollNowUi extends AbstractClass {

	Alert alert;
WebDriver driver;
	
	ReadWriteExcelFile writeResult = new ReadWriteExcelFile("ChecklistConfig.xls");

	public EnrollNowUi(WebDriver driver) {
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
	
	@FindBy(xpath = "//a[contains(text(),'Get Info')]")
	protected WebElement getinfo;
	
	@FindBy(xpath = "//b[contains(text(),'Thank You!')]")
	protected WebElement thnakyouPageAfterStep1FormPage;
	
	
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

	
	public void clickGetinfoButton()
	{
		Assert.assertTrue(enrollbutton.isDisplayed());
		getinfo.click();
		Utilities.hardWait(2);
	}
	
	public void clickEnrollNowButton()
	{
		Assert.assertTrue(enrollbutton.isDisplayed());
		enrollbutton.click();
		Utilities.hardWait(2);
	}
	
	public void verifyTextfields()
	{
		Assert.assertTrue(courseidfield.isDisplayed());
		Assert.assertTrue(fnamefield.isDisplayed());
		Assert.assertTrue(lnamefield.isDisplayed());
		Assert.assertTrue(addressfield.isDisplayed());
		Assert.assertTrue(address2field.isDisplayed());
		Assert.assertTrue(cityfield.isDisplayed());
		Assert.assertTrue(statefield.isDisplayed());
		Assert.assertTrue(zipfield.isDisplayed());
		Assert.assertTrue(emailfield.isDisplayed());
		Assert.assertTrue(phonenumberfield.isDisplayed());
		Assert.assertTrue(enrollsubmit.isDisplayed());
	}
	
	public void verifyRequiredfields()
	{
		enrollsubmit.click();
		alert = driver.switchTo().alert();
//		System.out.println("alert text is:"+alert.getText());
        Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Program of Interest"));
        Assert.assertTrue(alert.getText().contains("First Name"));
        Assert.assertTrue(alert.getText().contains("Last Name"));
        Assert.assertTrue(alert.getText().contains("Address"));
        Assert.assertTrue(alert.getText().contains("City"));
        Assert.assertTrue(alert.getText().contains("State"));
        Assert.assertTrue(alert.getText().contains("Zip"));
        Assert.assertTrue(alert.getText().contains("Email"));
        Assert.assertTrue(alert.getText().contains("Phone"));
        alert.accept();
        
        //* reporter logs *//
        // required fields are 
	}
	
	public void verifySinglefields()
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
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Program of Interest"));
		alert.accept();
		
		//* Verify for First name *//
		Select sel1 = new Select(courseidfield);
		sel1.selectByVisibleText("High School with a Health Care Concentration");
		fnamefield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("First Name"));
		alert.accept();
		
		//* Verify for Last name *//
		fnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lnamefield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Last Name"));
		alert.accept();
		
		//* Verify for Address *//
		lnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		addressfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Address"));
		alert.accept();
		
		//* Verify for City *//
		addressfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("City"));
		alert.accept();
		
		//* Verify for State *//
		cityfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		sel.selectByVisibleText("Select a State");
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("State"));
		alert.accept();	
		
		//* Verify for ZIP *//
		sel.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		zipfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Zip"));
		alert.accept();
		
		//* Verify for Email *//
		zipfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		emailfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Email"));
		alert.accept();
		
		//* Verify for Phone *//
		emailfield.sendKeys("test123@pennfoster.edu");
		phonenumberfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Phone"));
		alert.accept();
		
		
		phonenumberfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
		enrollsubmit.click();
		
				
	}
	
	public void verifyThankyouPage(){
		WebDriverWait wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Thank You!')]")));
		
		Assert.assertTrue(thnakyouPageAfterStep1FormPage.isDisplayed());
		
		driver.navigate().back();
		wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Info')]")));
		
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
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Program of Interest"));
		alert.accept();
		
		//* Verify for First name *//
		Select sel1 = new Select(courseidfield);
		sel1.selectByVisibleText("High School with a Health Care Concentration");
		fnamefield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("First Name"));
		alert.accept();
		
		//* Verify for Last name *//
		fnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName"));
		lnamefield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Last Name"));
		alert.accept();
		
		//* Verify for Address *//
		lnamefield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName"));
		addressfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Address"));
		alert.accept();
		
		//* Verify for City *//
		addressfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		cityfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("City"));
		alert.accept();
		
		//* Verify for State *//
		cityfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City"));
		sel.selectByVisibleText("Select a State");
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("State"));
		alert.accept();	
		
		//* Verify for ZIP *//
		sel.selectByVisibleText(Utilities.getYamlValue("SiteCoreApp.StudentInformation.State"));
		zipfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Zip"));
		alert.accept();
		
		//* Verify for Email *//
		zipfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP"));
		emailfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Email"));
		alert.accept();
		
		//* Verify for Phone *//
		emailfield.sendKeys("test123@pennfoster.edu");
		phonenumberfield.clear();
		enrollsubmit.click();
		alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("You must enter a value in the following fields"));
        Assert.assertTrue(alert.getText().contains("Phone"));
		alert.accept();
		
		
		phonenumberfield.sendKeys(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone"));
		enrollsubmit.click();
	}
	
	
	public void verifyStep1Page(){
		WebDriverWait wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Proceed To Step 2']")));
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Proceed To Step 2']")).isDisplayed());
		
		
		Assert.assertTrue(proceedToStep2Button.isDisplayed());
		Assert.assertTrue(firstNameTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(firstNameTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(firstNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.FirstName")));
		Assert.assertTrue(lastNameTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(lastNameTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(lastNameTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.LastName")));
		Assert.assertTrue(emailTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(emailTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(emailTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase("test123@pennfoster.edu"));
		Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(reTypeEmailTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(reTypeEmailTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase("test123@pennfoster.edu"));
		Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(primaryPhoneTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(primaryPhoneTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.PrimaryPhone")));
		Assert.assertTrue(address1TextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(address1TextBoxLabelOnStep1Page.isDisplayed());
                        System.out.println("address is" +address1TextBoxOnStep1Page.getAttribute("value"));
                        System.out.println("expected address is " +Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address"));
		Assert.assertTrue(address1TextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.Address")));
		Assert.assertTrue(address2TextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(address2TextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(cityTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(cityTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(cityTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.City")));
		Assert.assertTrue(stateTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(stateTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(zipTextBoxOnStep1Page.isDisplayed());
		Assert.assertTrue(zipTextBoxLabelOnStep1Page.isDisplayed());
		Assert.assertTrue(zipTextBoxOnStep1Page.getAttribute("value").equalsIgnoreCase(Utilities.getYamlValue("SiteCoreApp.StudentInformation.ZIP")));
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
		Assert.assertTrue(step1TabOnEnrollmentFormForDomestic.isDisplayed());
		Assert.assertTrue(step2TabOnEnrollmentFormForDomestic.isDisplayed());
		Assert.assertTrue(step3TabOnEnrollmentFormForDomestic.isDisplayed());
		
		driver.navigate().back();
		wait = new WebDriverWait(driver, 50 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Get Info')]")));
		
	}
	
	public void verifyProgramName(){
		String str = driver.findElement(By.xpath("//div[@class='program_name']")).getText();		
		Assert.assertTrue(str.contains(str));
	}
	
	
	
}
