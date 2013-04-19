package com.jav.SiteCore.pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.jav.SiteCore.util.ReadWriteExcelFile;
import com.jav.SiteCore.util.Utilities;

public class ChatNowPageHeader_UI extends AbstractClass {

	WebDriver driver;
	
	ReadWriteExcelFile writeResult = new ReadWriteExcelFile("ChecklistConfig.xls");

	public ChatNowPageHeader_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	// ################ Home Page Page elements
	// ###################################
	@FindBy(xpath = "//a[@class='btn-blue btn-gloss chatnow']")
	protected WebElement chatNowHeader;
	
	
	@FindBy(xpath = "//ul[@class='nav nav-pills large']/li[2]/a")
	protected WebElement changedchatNowFooter;
	@FindBy(xpath = "//a[@class='btn-blue btn-gloss large phonenumber']")
	protected WebElement globalPhoneNumer;
	@FindBy(xpath = "//a[@class='chatnow']")
	protected WebElement chatNowFooter;
	@FindBy(linkText = "VIEW ALL PROGRAMS & DEGREES")
	protected WebElement viewAllPrograms;
	@FindBy(linkText = "Pharmacy Technician Career Diploma")
	protected WebElement pharmacyTech;
	@FindBy(linkText = "Business Management Associate Degree")
	protected WebElement BusinessMgmt;
	@FindBy(xpath = "//span[contains(text(),'What is your name?')]")
	protected WebElement chatpopupWhatisyounameLabel;
	@FindBy(xpath = "//input[@id='q1']")
	protected WebElement chatPopUpNameTextBox;
	@FindBy(xpath = "//span[contains(text(),'Email Address')]")
	protected WebElement chatpopUpEmailAddressText;
	@FindBy(xpath = "//input[@id='q4']")
	protected WebElement chatPopUpEmailTextBox;
	@FindBy(xpath = "//span[contains(text(),'Are you currently a Penn Foster student?')]")
	protected WebElement chatPopUpRadioHeadingText;
	
	@FindBy(xpath = "//label[contains(text(),'Yes')]")
	protected WebElement chatPopUpYesRadioOption;
	@FindBy(xpath = "//label[contains(text(),'No')]")
	protected WebElement chatPopUpNoRadioOption;
	@FindBy(xpath = "//img[@alt='Start chat']")
	protected WebElement chatPopUpStartChatButton;
	
	
	// ##################### Functions #####################################
	
	public void clickViewAllPrograms()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW ALL PROGRAMS & DEGREES")));
		viewAllPrograms.click();
		Reporter.log(Utilities.logOutputFile("verify View all programs link displays - PASS"));
		Reporter.log(Utilities.logOutputFile("View all programs link clicked- PASS"));
	}
	
	public void navigatetohome()
	{
		driver.findElement(By.xpath("//ul[@class='breadcrumb hidden-tablet hidden-phone']/li[1]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-custom icon-client-caret-large-right']")));
		
	}
	
	public void clickOnCourse(String courseName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(courseName)));
		driver.findElement(By.linkText(courseName)).click();
		Reporter.log(Utilities.logOutputFile("course clicked- PASS"));
	}
	
	public void verifyPhoneNumber(String PhoneNumber){

 		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Overview')]")));
		Utilities.hardWait(3);
 		System.out.println(globalPhoneNumer.getText());
			Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
			Reporter.log(Utilities.logOutputFile(" Verify appication displays phone number '"+PhoneNumber+"' for Global Page -  PASS"));			

			List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
		    
		    for(WebElement foo:str){
	    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));
		    }
		    
			Reporter.log(Utilities.logOutputFile(" Verify appication displays phone number '"+PhoneNumber+"' with address - PASS"));			
			Reporter.log(Utilities.logOutputFile(" Verify appication displays phone number at footer '"+PhoneNumber+"' - PASS"));			

	
	}

	public void verifyChatNowHeader() {
		driver.navigate().refresh();
		System.out.println("ENTER");
		
			String displayed = chatNowHeader.getAttribute("style");
//			System.out.println("display is " + displayed);
			if (displayed.contains("none")) {
				Assert.assertTrue(displayed.contains("none"));
				System.out.println("chat is disabled for header");
				Reporter.log(Utilities.logOutputFile("chatnow is disabled and not clicked - FAIL"));
			} else {
				// TODO Auto-generated catch block
				chatNowHeader.click();
				Reporter.log(Utilities.logOutputFile(" chatnow buttons displays and clicked - PASS"));

				Reporter.log(Utilities.logOutputFile(" chatnow header clicked - PASS"));
				// Get Parent window handle
				Utilities.hardWait(3);
				String winHandleBefore = driver.getWindowHandle();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
//				System.out.println(driver.getTitle());
				driver.switchTo().frame(driver.findElement(By.id("initialtextFrame")));
				String str = driver.findElement(By.xpath("//p[@class='lpFormHeading']")).getText();
				Reporter.log(Utilities.logOutputFile(" Switch to popup - PASS"));
				Reporter.log(Utilities.logOutputFile(" Text display in chat now popup is '"+str+"' - PASS"));

			
				
				if(str.contains("To help us serve you better, please provide some information before we begin your chat"))
				{
					Assert.assertTrue(chatpopupWhatisyounameLabel.isDisplayed());
					Reporter.log(Utilities.logOutputFile(" Verify Name Label - PASS"));

					Assert.assertTrue(chatPopUpNameTextBox.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Name textbox - PASS"));

					Assert.assertTrue(chatpopUpEmailAddressText.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Adderss TextBox - PASS"));

					Assert.assertTrue(chatPopUpEmailTextBox.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Email TextBox - PASS"));

					Assert.assertTrue(chatPopUpRadioHeadingText.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Radio button heading displays - PASS"));

					Assert.assertTrue(chatPopUpYesRadioOption.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Radio button YES displays - PASS"));

					Assert.assertTrue(chatPopUpNoRadioOption.isDisplayed());
					Reporter.log(Utilities.logOutputFile(" Verify Radio button NO displays - PASS"));
					
//					Assert.assertTrue(chatPopUpStartChatButton.isDisplayed());	

					driver.switchTo().defaultContent();
	
					Reporter.log(Utilities.logOutputFile(" Close chat now popup - PASS"));

					driver.close();
					driver.switchTo().window(winHandleBefore);
					Utilities.hardWait(4);
					System.out.println(driver.getTitle());
					Assert.assertTrue(chatNowHeader.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Back to default content - PASS"));

				
				}else{
					Assert.assertTrue(str.contains("There are currently no agents available to assist you"));	
					Reporter.log(Utilities.logOutputFile(" Text display in chat now popup is '"+str+"' - PASS"));

					driver.close();
					driver.switchTo().window(winHandleBefore);
					Utilities.hardWait(4);
					System.out.println(chatNowHeader.getAttribute("style")+"  Header");

					Assert.assertTrue(chatNowHeader.getAttribute("style").contains("none"));	
					Reporter.log(Utilities.logOutputFile(" Verify chat now button disabled - PASS"));

					
				}				
			}

		
	}
	
	public void verifyChatNowFooter() {
		driver.navigate().refresh();
//		boolean flag = false;
			String displayed = chatNowFooter.getAttribute("style");
//			System.out.println("display is " + displayed);
			if (displayed.contains("none")) {
				Assert.assertTrue(displayed.contains("none"));
				System.out.println("chat is disabled for footer");
				Reporter.log(Utilities.logOutputFile("chatnow is disabled and not clicked for footer - PASS"));
			} else {
				// TODO Auto-generated catch block

				chatNowFooter.click();
				Reporter.log(Utilities.logOutputFile("chatnow footer clicked - PASS"));
				// Get Parent window handle
				String winHandleBefore = driver.getWindowHandle();
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}
//				System.out.println(driver.getTitle());
				driver.switchTo().frame(driver.findElement(By.id("initialtextFrame")));
				System.out.println(driver.findElement(By.xpath("//p[@class='lpFormHeading']")).getText());
				String str = driver.findElement(By.xpath("//p[@class='lpFormHeading']")).getText();
				Reporter.log(Utilities.logOutputFile(" Text display in chat now popup is '"+str+"' - PASS"));

				
				if(str.contains("To help us serve you better, please provide some information before we begin your chat."))
				{
					Assert.assertTrue(chatpopupWhatisyounameLabel.isDisplayed());
					Reporter.log(Utilities.logOutputFile(" Verify Name Label - PASS"));

					Assert.assertTrue(chatPopUpNameTextBox.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Name textbox - PASS"));

					Assert.assertTrue(chatpopUpEmailAddressText.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Adderss TextBox - PASS"));

					Assert.assertTrue(chatPopUpEmailTextBox.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Email TextBox - PASS"));

					Assert.assertTrue(chatPopUpRadioHeadingText.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Radio button heading displays - PASS"));

					Assert.assertTrue(chatPopUpYesRadioOption.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Verify Radio button YES displays - PASS"));

					Assert.assertTrue(chatPopUpNoRadioOption.isDisplayed());
					Reporter.log(Utilities.logOutputFile(" Verify Radio button NO displays - PASS"));
					
					driver.switchTo().defaultContent();
//					Assert.assertTrue(chatPopUpStartChatButton.isDisplayed());	
					
					
					driver.close();
					driver.switchTo().window(winHandleBefore);	
					Reporter.log(Utilities.logOutputFile(" Switch to chat now popup - PASS"));

					Utilities.hardWait(3);
//					System.out.println(driver.getTitle());
					Assert.assertTrue(chatNowFooter.isDisplayed());	
					Reporter.log(Utilities.logOutputFile(" Chat now button displays - PASS"));

				
				}else{
					Assert.assertTrue(str.contains("There are currently no agents available to assist you"));	
					driver.close();
					driver.switchTo().window(winHandleBefore);		
					Utilities.hardWait(4);
						System.out.println(changedchatNowFooter.getAttribute("style")+"  Footer");
						Assert.assertTrue(changedchatNowFooter.getAttribute("style").contains("none"));
						Reporter.log(Utilities.logOutputFile(" Chat now button disabled - PASS"));

				
				}	
				
			}

		
	}
	
}