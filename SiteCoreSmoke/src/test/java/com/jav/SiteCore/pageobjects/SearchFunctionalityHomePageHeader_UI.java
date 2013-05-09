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

import com.jav.SiteCore.util.Utilities;

public class SearchFunctionalityHomePageHeader_UI  extends AbstractClass{
	
	
	WebDriver driver;	

    public SearchFunctionalityHomePageHeader_UI(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    
//    ################  Home Page Page elements   ###################################
    	@FindBy(xpath = "//i[@class='icon-custom icon-client-magnify']")
    	protected WebElement searchIcon;
    	@FindBy(xpath = "//input[@class='input-small search-query']")
    	protected WebElement searchBox;
    	@FindBy(xpath = "//input[@class='input-small search-query']")
    	protected WebElement searchTermEditBox;
    	@FindBy(xpath = "//a[contains(text(),'Search')]")
    	protected WebElement searchBtn;
    	@FindBy(xpath = "//h1[contains(text(),'Find what you')]")
    	protected WebElement searchResult;
    	@FindBy(xpath = "//div[@class='searchResults']/dl/dt[1]")
    	protected WebElement searchTermHeading;
    	@FindBy(xpath = "//input[@id='phcontent_0_txtSearch']")
    	protected WebElement multipleSearchTermTextBox;
    	@FindBy(xpath = "//a[@id='phcontent_0_btnSearch']")
    	protected WebElement multipleSearchbutton;
    	@FindBy(xpath = "//a[@class='btn-blue btn-gloss large phonenumber']")
    	protected WebElement globalPhoneNumer;
       	@FindBy(xpath = "//a[contains(text(),'Home')]")
    	protected WebElement globalPennFosterImage;
       	@FindBy(xpath = "(//a[contains(text(),'Programs')])[2]")
    	protected WebElement programsAndDegreesTab;
       	@FindBy(linkText = "VIEW ALL PROGRAMS & DEGREES")
    	protected WebElement viewAllPrograms;
       	@FindBy(xpath = "//div[@class='global promotion span6']/a")
    	protected WebElement starttodayLinkHeaderHomePage;
    	@FindBy(xpath = "(//div[@class='hidden-tablet']/a)[1]")
    	protected WebElement studentLoginButtonHomePage;
    	@FindBy(xpath = "(//div[@class='hidden-tablet']/a)[2]")
    	protected WebElement enrollNowButtonHomePage;
    	@FindBy(xpath = "//div[@class='container-inner']/h1/a")
    	protected WebElement footercontainerHeadingHomePage;
    	@FindBy(xpath = "//div[@class='container-inner']/h1/a/i")
    	protected WebElement footercontainerRightNavigatorHeadingHomePage;
    	@FindBy(xpath = "(//div[@class='tile3 divider-vertical']/div/p)[1]")
    	protected WebElement addressschoolFooterHomePage;
    	@FindBy(xpath = "(//div[@class='tile3 divider-vertical']/div/p)[2]")
    	protected WebElement addresscollegeFooterHomePage;
    	
    	
    	//div[@class='tile3 divider-vertical']/div/p
    	

    	
//    	##################### Functions #####################################
    	
    	String SearchTerm;
    	
  
    	
    	public void clickOnCourse(String courseName)
    	{

    		WebDriverWait wait = new WebDriverWait(driver, 50);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(courseName)));
    		driver.findElement(By.linkText(courseName)).click();
    		Reporter.log(Utilities.logOutputFile("course clicked- Pass"));
    	}
    	
    	public void clickViewAllPrograms()
    	{
    		
    		WebDriverWait wait = new WebDriverWait(driver, 50);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW ALL PROGRAMS & DEGREES")));
    		viewAllPrograms.click();
    		Reporter.log(Utilities.logOutputFile("View all programs link clicked- Pass"));
    	}
    	
    	public void clickSearchIcon()
		{
			
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-custom icon-client-magnify']")));
				searchIcon.click();
				Reporter.log(Utilities.logOutputFile("search icon clicked - Pass"));
			
		}
    	
    	public void clickSearchBox()
		{
			
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='input-small search-query']")));
				searchBox.click();
				Reporter.log(Utilities.logOutputFile("search box clicked - Pass"));
			
		}
    	
    	public void typeSearchTerm(String searchTerm)
		{
				SearchTerm = searchTerm;
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='input-small search-query']")));
				searchBox.sendKeys(searchTerm);
				Reporter.log(Utilities.logOutputFile("search term entered - Pass"));
			
		}
    	
    	public void clickSearchButton()
		{
			
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Search')]")));
				searchBtn.click();
				Reporter.log(Utilities.logOutputFile("search button clicked - Pass"));
			
		}
    	
    	public void verifySearchResultPageDisplayed()
    	{
    		
    			Assert.assertTrue(searchResult.isDisplayed());
				Reporter.log(Utilities.logOutputFile("search result page displayed - Pass"));
			
    	}
    	
    	public void verifySearchTermHeadingContainSearchTerm()
    	{
    		WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='searchResults']")));
			System.out.println(SearchTerm+"SearchTerm");
    			Assert.assertTrue(searchTermHeading.isDisplayed());
				Reporter.log(Utilities.logOutputFile("verify Search term Heading Contain Search Term - Pass"));
				try{
					List <WebElement> str = driver.findElements(By.xpath("//div[@class='searchResults']/dl/dt"));
				    System.out.println(str.size());
				    Assert.assertTrue(str.size()>0);
					Reporter.log(Utilities.logOutputFile("Top search Heading display is :   "+str.size()));
			    

				}catch(Exception e)
				{
					System.out.println(e);
					Reporter.log(Utilities.logOutputFile("verify Search term Heading Contain Search Term - FAIL   "+e));

				}
				
			
    	}
    	
    	public void verifySpecialSearchTerm(){
    		Assert.assertTrue(multipleSearchTermTextBox.isDisplayed());
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.clear();
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.sendKeys("degreecomputer");
    		multipleSearchbutton.click();
    		Utilities.hardWait(2);
    		String str = "We're sorry. We were unable to locate any items containing the provided search text. Please try again.";
    		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'We were unable to locate any items')]")).getText().contains(str));
    		System.out.println(driver.findElement(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']")).getAttribute("style"));
    		
    		Assert.assertTrue(multipleSearchTermTextBox.isDisplayed());
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.clear();
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.sendKeys("*");
    		multipleSearchbutton.click();
    		
    		WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']/font")));
    		System.out.println(driver.findElement(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']")).getAttribute("style"));
    		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']")).getAttribute("style").contains("inline"));
    
    		Assert.assertTrue(multipleSearchTermTextBox.isDisplayed());
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.clear();
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.sendKeys("science*");
    		multipleSearchbutton.click();
    		
    		 wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']/font")));
    		System.out.println(driver.findElement(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']")).getAttribute("style"));
    		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='phcontent_0_RegularExpressionValidator7']")).getAttribute("style").contains("inline"));
    
    		
    	}

    	
    	
    	
    	public void verifySearchMultiple(String Searchterm)
    	{
    		SearchTerm = Searchterm;
    		Assert.assertTrue(multipleSearchTermTextBox.isDisplayed());
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.clear();
    		multipleSearchTermTextBox.click();
    		multipleSearchTermTextBox.sendKeys(SearchTerm);
    		multipleSearchbutton.click();
    		Utilities.hardWait(2);
    		verifySearchTermHeadingContainSearchTerm();
    		
    	}
    	
    	public void verifyPhoneNumbersGlobal()
    	{
    		String PhoneNumber = Utilities.getYamlValue("PhoneNumber.Global");
    		globalPennFosterImage.click();
    		WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-custom icon-client-caret-large-right']")));
    		Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
			System.out.println(globalPhoneNumer.getText());
    		List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
		    System.out.println(str.size());
		    
		    for(WebElement foo:str){
	    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));

		    	System.out.println(foo.getText());
		    }
    		
    		
    	}
    	
    	public void verifyPhoneNumbersCollege(){
    		String PhoneNumber = Utilities.getYamlValue("PhoneNumber.College");

    		driver.findElement(By.xpath("(//a[contains(text(),'Programs ')])[2]")).click();
    		driver.findElement(By.xpath("//a[@id='phcontent_0_rptT2Pages_rptFeaturedItems_6_lnkFeaturedItem_0']")).click();
    		WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Overview ')]")));
    		Utilities.hardWait(3);
			Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
			System.out.println(globalPhoneNumer.getText());
    		List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
		    System.out.println(str.size());
		    
		    for(WebElement foo:str){
	    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));
		    	}			
		    
    	}
    	
    	public void verifyPhoneNumberHighSchool(){
//    		driver.navigate().to(Utilities.getYamlValue("appurl"));
//
//    		WebDriverWait wait = new WebDriverWait(driver, 50);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-custom icon-client-caret-large-right']")));
    		navigatetohome();
			System.out.println("finally Out");
    		
    		 String PhoneNumber = Utilities.getYamlValue("PhoneNumber.High School");

     		driver.findElement(By.xpath("(//a[contains(text(),'Programs ')])[2]")).click();
     		driver.findElement(By.xpath("//a[@id='phcontent_0_rptT2Pages_rptFeaturedItems_3_lnkFeaturedItem_0']")).click();
     		WebDriverWait wait = new WebDriverWait(driver, 50);
 			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Overview ')]")));
     		
 			Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
 			System.out.println(globalPhoneNumer.getText());
     		List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
 		    System.out.println(str.size());
 		    
 		    for(WebElement foo:str){
 	    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));

 		    	System.out.println(foo.getText());
 		    }
    	
    	}
    	
    	public void navigatetohome()
    	{
    		driver.findElement(By.xpath("//ul[@class='breadcrumb hidden-tablet hidden-phone']/li[1]/a")).click();
    		WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-custom icon-client-caret-large-right']")));
			
    	}
    	
    	public void verifyPhoneNumberMedicalAssistant(){
    		
			
			System.out.println("finally Out");
    		
    		 String PhoneNumber = Utilities.getYamlValue("PhoneNumber.Medical Assistant Associate Degree");
 			Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
 			System.out.println(globalPhoneNumer.getText());
     		List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
 		    System.out.println(str.size());
 		    
 		    for(WebElement foo:str){
 	    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));

 		    	System.out.println(foo.getText());
 		    }
    	
    	}
    	
    	public void verifyPhoneNumberMilitary(){
    		System.out.println("finally Out");
    		driver.findElement(By.xpath("(//a[contains(text(),'Military')])[2]")).click();
    		WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Military')]")));
    		
    		String PhoneNumber = Utilities.getYamlValue("PhoneNumber.Military");
			Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
			System.out.println(globalPhoneNumer.getText());
    		List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
		    System.out.println(str.size());
		    
		    for(WebElement foo:str){
	    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));

		    	System.out.println(foo.getText());
		    }
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
    	
    	
      	public void verifyHeaderandFooteratHOmePage()
    	{    		
    		List <WebElement> str = driver.findElements(By.xpath("//nav[@class='global persona span12 hidden-tablet hidden-phone']/div/a"));
		    System.out.println(str.size());		 
		    
		    WebElement link = str.get(0);
		    Assert.assertTrue(link.getText().equals("EDUCATORS"));
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(1);
		    Assert.assertTrue(link.getText().equals("EMPLOYERS"));
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(2);
		    Assert.assertTrue(link.getText().equals("MILITARY"));
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(3);
		    Assert.assertTrue(link.getText().equals("NEWS & MEDIA"));
		    Assert.assertTrue(link.isDisplayed());
		    
		    Assert.assertTrue(starttodayLinkHeaderHomePage.getText().equals("START TODAY AND SAVE!"));
		    
		    
		    str = driver.findElements(By.xpath("//div[@class='hidden-tablet hidden-phone']/a"));
		    System.out.println(str.size());
		    
		    link = str.get(0);
		    Assert.assertTrue(link.getText().equals("COMMUNITY"));
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(1);
		    Assert.assertTrue(link.getText().equals("FAQS"));
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(2);
		    Assert.assertTrue(link.getText().equals("SHARE"));
		    Assert.assertTrue(link.isDisplayed());
		    

		    
		    Assert.assertTrue(studentLoginButtonHomePage.getText().equals("STUDENT LOGIN"));
		    Assert.assertTrue(enrollNowButtonHomePage.getText().equals("ENROLL NOW"));

		    
		    str = driver.findElements(By.xpath("//nav[@class='global navigation']/ul/li/a"));
		    System.out.println(str.size());
		    
		    link = str.get(0);
		    Assert.assertTrue(link.getText().contains("PROGRAMS") && link.getText().contains("& DEGREES") );
		    Assert.assertTrue(link.isDisplayed());

    
		    link = str.get(1);
		    Assert.assertTrue(link.getText().contains("HOW IT") && link.getText().contains("WORKS") );
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(2);
		    Assert.assertTrue(link.getText().contains("WAYS TO") && link.getText().contains("PAY & SAVE") );
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(3);
		    Assert.assertTrue(link.getText().contains("WHY PENN") && link.getText().contains("FOSTER") );
		    Assert.assertTrue(link.isDisplayed());
		    
		    
		    link = str.get(4);
		    Assert.assertTrue(link.getText().contains("SPOTLIGHT") && link.getText().contains("ON SUCCESS") );
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(5);
		    Assert.assertTrue(link.getText().contains("STUDENT") && link.getText().contains("COMMUNITY") );
		    Assert.assertTrue(link.isDisplayed());
		    
		    link = str.get(6);
		    Assert.assertTrue(link.getText().contains("ABOUT") && link.getText().contains("US") );
		    Assert.assertTrue(link.isDisplayed());
		  
		    
			 Assert.assertTrue(footercontainerHeadingHomePage.getText().equals("AN ACCREDITED SCHOOL YOU CAN TRUST"));
			 Assert.assertTrue(footercontainerRightNavigatorHeadingHomePage.isDisplayed());
			 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='unit unit-accreditation']/div/section/div/div/div")).isDisplayed());
			 Assert.assertTrue(driver.findElement(By.xpath("//span[@class='logo penn-foster']/img")).isDisplayed());

			 str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[1]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    Assert.assertTrue(link.getText().equals("HOME"));
			    Assert.assertTrue(link.isDisplayed());

			    
			    link = str.get(1);
			    Assert.assertTrue(link.getText().equals("FAQ"));
			    Assert.assertTrue(link.isDisplayed());

			    
			    link = str.get(2);
			    Assert.assertTrue(link.getText().equals("SITE MAP"));
			    Assert.assertTrue(link.isDisplayed());

			    
			 
		 
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[2]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("MILITARY"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("FOR EDUCATORS"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("FOR EMPLOYERS"));
			    Assert.assertTrue(link.isDisplayed());

			    
			    
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[3]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("CONTACT US"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("NEWS & MEDIA"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("JOBS @ PENNFOSTER"));
			    Assert.assertTrue(link.isDisplayed());
			    
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[4]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("FINANCIAL ASSISTANCE"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("ACADEMIC SUPPORT"));
			    Assert.assertTrue(link.isDisplayed());

			    
			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("CAREER SERVICES"));
			    Assert.assertTrue(link.isDisplayed());
			    
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[5]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("STUDENT LOGIN"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("STUDENT COMMUNITY"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("STUDENT SOLUTIONS"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(3);
			    
			    Assert.assertTrue(link.getText().equals("BOOKSTORE"));
			    Assert.assertTrue(link.isDisplayed());
			    
			    
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[6]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("LINK TO US"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("PRIVACY POLICY"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("COPYRIGHT & TERMS"));
			    Assert.assertTrue(link.isDisplayed());
			    
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[7]/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("PENN FOSTER USA"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("ICS CANADA"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("PENN FOSTER INTERNATIONAL"));
			    Assert.assertTrue(link.isDisplayed());

			    
			    str = driver.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[7]/ul/li"));
			    System.out.println(str.size());
			    
			    link = str.get(0);
			    
			    Assert.assertTrue(link.getText().equals("PENN FOSTER HIGH SCHOOL"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(1);
			    
			    Assert.assertTrue(link.getText().equals("PENN FOSTER CAREER SCHOOL"));
			    Assert.assertTrue(link.isDisplayed());

			    link = str.get(2);
			    
			    Assert.assertTrue(link.getText().equals("PENN FOSTER COLLEGE"));
			    Assert.assertTrue(link.isDisplayed());
			    
			    System.out.println(addresscollegeFooterHomePage.getText());
			    System.out.println(addressschoolFooterHomePage.getText());
			    
			    Assert.assertTrue(addresscollegeFooterHomePage.getText().contains("Penn Foster College") &&
		    			addresscollegeFooterHomePage.getText().contains("Administrative Office") &&
		    			addresscollegeFooterHomePage.getText().contains("14300 N. Northsight Blvd.") &&
		    			addresscollegeFooterHomePage.getText().contains("Scottsdale, AZ 85260 USA") &&
		    			addresscollegeFooterHomePage.getText().contains("1-800-471-3232") 
			    			);
			    Assert.assertTrue(addressschoolFooterHomePage.getText().contains("Penn Foster Career School") &&
			    		addressschoolFooterHomePage.getText().contains("Penn Foster High School") &&
			    		addressschoolFooterHomePage.getText().contains("Student Services Center") &&
			    		addressschoolFooterHomePage.getText().contains("925 Oak Street") &&
			    		addressschoolFooterHomePage.getText().contains("1-800-275-4410") &&
			    		addressschoolFooterHomePage.getText().contains("Scranton, PA 18515 USA") 
			    			);
			    
			    Assert.assertTrue(addresscollegeFooterHomePage.isDisplayed());
			    Assert.assertTrue(addressschoolFooterHomePage.isDisplayed());
    	}
    	
    	
}