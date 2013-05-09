package com.jav.SiteCore.pageobjects;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.jav.SiteCore.tests.SelectedCourse_SmokeCheckpoint_Test;
import com.jav.SiteCore.util.Utilities;

public class URM_URL_Link_UI extends AbstractClass {

	WebDriver driver;

	public URM_URL_Link_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

   	@FindBy(xpath = "//a[contains(text(),'Home')]")
	protected WebElement globalPennFosterImage;   	
	@FindBy(xpath = "//a[@class='btn-blue btn-gloss large phonenumber']")
	protected WebElement globalPhoneNumer;
	@FindBy(xpath = "//div[@id='page-logo']")
	protected WebElement pennFosterLogo;

	
	public void verifyHomePageSiteCore()
    {       	
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='page-logo']")));
		Assert.assertTrue(pennFosterLogo.isDisplayed());  
		Reporter.log(Utilities.logOutputFile(" Penn Foster logo displays on Landing Page - Pass"));
    }
	

	public void verifyPhoneNumbersGlobal()
	{
		String PhoneNumber = Utilities.getYamlValue("URMPhoneNumber.Global");
		globalPennFosterImage.click();
		Utilities.hardWait(3);
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
		String PhoneNumber = Utilities.getYamlValue("URMPhoneNumber.College");

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
//		driver.navigate().to(Utilities.getYamlValue("appurl"));
//
//		WebDriverWait wait = new WebDriverWait(driver, 50);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-custom icon-client-caret-large-right']")));
		navigatetohome();
		System.out.println("finally Out");
		
		 String PhoneNumber = Utilities.getYamlValue("URMPhoneNumber.High School");

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
		
		 String PhoneNumber = Utilities.getYamlValue("URMPhoneNumber.Medical Assistant Associate Degree");
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
		
		String PhoneNumber = Utilities.getYamlValue("URMPhoneNumber.Military");
		Assert.assertTrue(globalPhoneNumer.getText().equalsIgnoreCase(PhoneNumber));
		System.out.println(globalPhoneNumer.getText());
		List <WebElement> str = driver.findElements(By.xpath("//a[@class='phonenumber']"));
	    System.out.println(str.size());
	    
	    for(WebElement foo:str){
    		Assert.assertTrue(foo.getText().equalsIgnoreCase(PhoneNumber));

	    	System.out.println(foo.getText());
	    }
	}
	
	
	
}