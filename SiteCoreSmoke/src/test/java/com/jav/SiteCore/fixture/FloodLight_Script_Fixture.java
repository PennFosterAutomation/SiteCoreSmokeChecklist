package com.jav.SiteCore.fixture;



public class FloodLight_Script_Fixture  extends BaseFixture {
		
	public void verifyHomepage()
	{
		FScript.verifyHomePageSiteCore();
	}
	
	public void clickProgramAndDegreesTab()
	{
		FScript.clickProgramAndDegreesTab();
	}
	
	public void clickViewAllPrograms()
	{
		FScript.clickViewAllPrograms();
	}
	
	public void SelectCourse(String coursename)
	{
		FScript.clickOnCourse(coursename);
		
		
	}
	
	public void EnrollNow(String programofinterest,String CnameEOL, String sitecoreform)
	{
		if (sitecoreform.equalsIgnoreCase("Y"))
		{
			FScript.verifyEnrollNow(programofinterest);
			FScript.verifyFieldsOnPage();
			FScript.verifyRequiredfields();
			FScript.verifySinglefieldsEnrollNow();
			FScript.verifyStep1Page(CnameEOL);
		}
		else
		{
			FScript.verifyEnrollNowEOLEnable(CnameEOL);
		}
			
	}
	
	public void GetInfo(String programofinterest,String CnameEOL, String sitecoreform)
	{
		if (sitecoreform.equalsIgnoreCase("Y"))
		{
			FScript.verifyRequestInfo(programofinterest);
			FScript.verifyFieldsOnPage();
			FScript.verifyRequiredfields();
			FScript.verifySinglefieldsEnrollNow();
			FScript.verifyThankyouPage(CnameEOL);

		}
		else
		{
			FScript.verifyRequestInfoEnable(CnameEOL);		}
				
	}
}
