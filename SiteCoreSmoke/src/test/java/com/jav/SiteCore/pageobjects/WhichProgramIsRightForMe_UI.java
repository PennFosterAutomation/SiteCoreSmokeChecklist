package com.jav.SiteCore.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.jav.SiteCore.util.Utilities;

public class WhichProgramIsRightForMe_UI  extends AbstractClass{
	
	
	WebDriver driver;	

    public WhichProgramIsRightForMe_UI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    
//    ################  Home Page Page elements   ###################################
        	
		@FindBy(xpath = "//div[@id='page-logo']")
		protected WebElement pennFosterLogo;
		@FindBy(xpath = "//span[@class='defaultlogo  penn-foster']")
		protected WebElement pennFosterLogo1;
		@FindBy(xpath = "//div[@class='unit module module-program-finder yellow']")
		protected WebElement programChoiceList;
		@FindBy(xpath = "//span[contains(text(),'SELECT A PROGRAM')]")
		protected WebElement selectArrowonHomepage;
		@FindBy(xpath = "html/body/ul[2]/li[2]/a")
		protected WebElement selectMostPapoularPro;
		
		
		
		
		@FindBy(xpath = "//span[contains(text(),'Level of education completed')]")
		protected WebElement completedLevelOfEducationSelectLabel;
		@FindBy(linkText = "No High School")
		protected WebElement selectNoHighSchool;
		@FindBy(xpath = "//span[contains(text(),'What is your area of interest?')]")
		protected WebElement areaOfInterestLabel;
		@FindBy(linkText = "Business")
		protected WebElement businesslink;
//		@FindBy(xpath = "//span[contains(text(),'What interests you most?') and @class='selectBox-label']")
		@FindBy(xpath = "(//span[@class='selectBox-arrow'])[4]")
		protected WebElement whatIneterestYouMostLabel;
		@FindBy(linkText = "Accounting and Finance")
		protected WebElement accountingAndFinancelink;
		@FindBy(xpath = "(//span[@class='selectBox-arrow'])[5]")
		protected WebElement careerLifeGoalLabel;
		@FindBy(linkText = "Advance in my current career")
		protected WebElement advanceInMyCurrentCareerlink;
		@FindBy(xpath = "//a[@id='btnProgramFinderSubmit']")
		protected WebElement findOutNowButton;
		@FindBy(xpath = "//div[@class='span12']")
		protected WebElement programFinderResults;
		
	

		
		public void verifyHomePageSiteCore()
        {       	
			WebDriverWait wait = new WebDriverWait(driver, 50);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-logo']")));
			Assert.assertTrue(pennFosterLogo.isDisplayed());  
			Reporter.log(Utilities.logOutputFile(" Penn Foster logo displays on Landing Page - Pass"));
        }
		
		public void verifyProgramChoiceOnHomePage()
        { 			
			Assert.assertTrue(programChoiceList.isDisplayed());  
			Reporter.log(Utilities.logOutputFile(" Program choice on home page Verify - Pass"));
        }
		
		public void clickLevelOfEducationCompletedOnHomePage()
        {       
			selectArrowonHomepage.click();
			WebDriverWait wait = new WebDriverWait(driver, 50);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'MOST POPULAR PROGRAMS')]")));
    		Utilities.hardWait(3);
//    		selectMostPapoularPro.click();
    		driver.findElement(By.linkText("MOST POPULAR PROGRAMS")).click();
    		 wait = new WebDriverWait(driver, 50);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'MOST POPULAR PROGRAMS')]")));
			completedLevelOfEducationSelectLabel.click();			
			Reporter.log(Utilities.logOutputFile("Click on level of education selected - Pass"));
        }
		
		public void selectCompletedLevelOfEducation()
		{
			driver.findElement(By.linkText("No High School")).click();
			Reporter.log(Utilities.logOutputFile(" No High school selected in level of education completed- Pass"));
		}
		
		public void clickAreaOfInterestOnHomePage()
        {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'What is your area of interest?')]")));
			Utilities.hardWait(2);
//			areaOfInterestLabel.click();
			driver.findElement(By.xpath("//span[contains(text(),'What is your area of interest?')]")).click();

			Reporter.log(Utilities.logOutputFile("Click on area of Interest - Pass"));
        }
		
		public void selectAreaOfInterest()
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Business")));
//			businesslink.click();
			driver.findElement(By.linkText("Business")).click();

			Reporter.log(Utilities.logOutputFile("Business selected in Area of Interest- Pass"));
		}
		
		public void clickWhatInterestYouMostOnHomePage()
        {
			Utilities.hardWait(2);
			whatIneterestYouMostLabel.click();
			Reporter.log(Utilities.logOutputFile("click What Interest You Most On Home Page - Pass"));
        }
		
		public void selectMostInerestedField()
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Accounting and Finance")));
//			accountingAndFinancelink.click();
			driver.findElement(By.linkText("Accounting and Finance")).click();

			Reporter.log(Utilities.logOutputFile("select Most Inerested Field- Pass"));
		}
		
		public void clickCareerLifeGoalOnHomePage()
        {
			System.out.println("before");
			Utilities.hardWait(2);
			careerLifeGoalLabel.click();
			System.out.println("after");
			Reporter.log(Utilities.logOutputFile("click career life goel On Home Page - Pass"));
        }
		
		public void selectCareerLifeGoal()
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Advance in my current career")));
			Utilities.hardWait(2);
//			advanceInMyCurrentCareerlink.click();
			driver.findElement(By.linkText("Advance in my current career")).click();

			Reporter.log(Utilities.logOutputFile("select career life goal- Pass"));
		}
		
		public void clickFindOutNowbtn()
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnProgramFinderSubmit']")));
			findOutNowButton.click();
		}
		
		public void verifyProgramsFound()
		{
			Assert.assertTrue(programFinderResults.isDisplayed());
			System.out.println("text is: " +programFinderResults.getText());
			Assert.assertTrue(programFinderResults.getText().contains("Which program is right for me?"));
			Assert.assertTrue(programFinderResults.getText().contains("Below is a list of programs that may match your interests and level of education."));
			Reporter.log(Utilities.logOutputFile("verify programs found- Pass"));
			System.out.println(	driver.findElement(By.xpath("//div[@class='row filter-result-container']")).getAttribute("childElementCount"));
			System.out.println(	driver.findElement(By.xpath("//div[@class='row filter-result-container']")).getText());
			
		}
}