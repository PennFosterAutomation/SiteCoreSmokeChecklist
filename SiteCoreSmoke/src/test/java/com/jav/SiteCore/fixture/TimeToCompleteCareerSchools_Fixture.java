package com.jav.SiteCore.fixture;


public class TimeToCompleteCareerSchools_Fixture  extends WhichProgramIsRightForMe_Fixture {
	
	public void clickProgramAndDegreesTab()
	{
		CareerSchool.clickProgramAndDegreesTab();		
	}
	
	public void clickProgramAndDegreesTabForCareerCertificate()
	{
		CareerSchool.clickProgramAndDegreesTabForCareerCertificate();		
	}
	
	public void clickCareerDiplomaProgram()
	{
		CareerSchool.clickCareerDiplomaProgram();		
	}
	
	public void clickCareerCertificateProgram()
	{
		CareerSchool.clickCareerCertificateProgram();		
	}
	
	public void clickTimeToCompleteBtn()
	{
		CareerSchool.clickTimeToCompleteBtn();		
	}
	
	public void clickExtendedRadioBtn(String courseName)
	{
		CareerSchool.clickExtendedRadioBtn(courseName);		
	}
	
	public void clickStandardRadioBtn()
	{
		CareerSchool.clickStandardRadioBtn();		
	}
	
	public void clickAcceleratedRadioBtn()
	{
		CareerSchool.clickAcceleratedRadioBtn();		
	}
	
	public void clickOthersRadioBtn()
	{
		CareerSchool.clickOthersRadioBtn();		
	}
	
	public void inputWorkingHoursDetails()
	{
		CareerSchool.inputWorkingHoursDetails();		
	}
	
	public void clickUpdateBtn()
	{
		CareerSchool.clickUpdateBtn();		
	}
	
	public void verifySummaryDetails()
	{
		CareerSchool.verifySummaryDetails();		
	}
	
	public void clickCloseBtn()
	{
		CareerSchool.clickCloseBtn();		
	}
	
	public void verifySummaryForBounderyValues()
	{
		CareerSchool.verifySummaryForBounderyValues();		
	}
	
	public  void getInfo(){
		  enroll.clickGetinfoButton();
		  enroll.verifyTextfields();
		  enroll.verifyRequiredfields();
		  enroll.verifySinglefields();
		  enroll.verifyThankyouPage();
		  
		 }
	
	public  void enrollNowInfo(){
		  enroll.clickEnrollNowButton();
		  enroll.verifyTextfields();
		  enroll.verifyRequiredfields();
		  enroll.verifySinglefieldsEnrollNow();
		  enroll.verifyStep1Page();
		 }
	
	
	
}
