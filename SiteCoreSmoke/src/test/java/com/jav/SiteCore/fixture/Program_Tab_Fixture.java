package com.jav.SiteCore.fixture;




public class Program_Tab_Fixture  extends ChatNowPageHeader_Fixture {
	
	public void verifyAllTabsOnCourse()
	{
		Program.verifyAllTabsOnCourse();				
	}
	
	public void navigateToOVERVIEWTab()
	{
		Program.navigateToOVERVIEWTab();
		
	}
	
	public void navigatetoWhoIsItForTab()
	{
		Program.navigatetoWhoIsItForTab();				
	}
	
	public void navigatetoProgramOutLineTab()
	{
		Program.navigatetoProgramOutLineTAb();			
	}
	
	public void navigatetoTuitionandpaymentTab()
	{
		Program.navigatetoTuitionandpaymentTAb();
				
	}
	
	public void navigatetoCareersTab()
	{
		Program.navigatetoCareersTAb();				
	}

	public void navigatetoFAQsTab()
	{
		Program.navigatetoFAQsTAb();
	}
	
	public void navigatetoAccreditationTab()
	{
		Program.navigatetoAccreditationTAb();		
	}
		
	public void verifyGoogleAnalyticsScript(String CourseCode)
	{
		Program.verifyGoogleAnalyticsScript(CourseCode);
	}
	
	public void verifyRequestInfo(String CourseName , String CnameEOL){
		Program.verifyRequestInfo(CnameEOL);	
		 
	}
	
	public void verifyEnrollNow(String CourseName, String CnameEOL){
		Program.verifyEnrollNowEOL(CnameEOL);	
		
	}
	
	public void verifyEnrollNowIcon(String CourseName, String CnameEOL){
		Program.verifyEnrollNowIconEOL(CnameEOL);
		
	}
	
	public void verifyGetInfo(String CourseName, String CnameEOL){
		Program.verifyGetInfoEOL(CnameEOL);	
		
	}
	
	
	public void verifyRequestInfoEnable(String CourseName , String CnameEOL){
		Program.verifyRequestInfo(CourseName , CnameEOL);	
		Program.verifyFieldsOnPage();
		Program.verifyRequiredfields();
		Program.verifySinglefieldsEnrollNow();
		Program.verifyThankyouPage(CnameEOL);
		 
	}
	
	public void verifyEnrollNowEnable(String CourseName, String CnameEOL){
		Program.verifyEnrollNow(CourseName);	
		Program.verifyFieldsOnPage();
		Program.verifyRequiredfields();
		Program.verifySinglefieldsEnrollNow();
		Program.verifyStep1Page(CnameEOL);
	}
	
	public void verifyEnrollNowIconEnable(String CourseName, String CnameEOL){
		Program.verifyEnrollNowIcon(CourseName);
		Program.verifyFieldsOnPage();
		Program.verifyRequiredfields();
		Program.verifySinglefieldsEnrollNow();
		Program.verifyStep1Page(CnameEOL);
	}
	
	public void verifyGetInfoEnable(String CourseName, String CnameEOL){
		Program.verifyGetInfo(CourseName);	
		Program.verifyFieldsOnPage();
		Program.verifyRequiredfields();
		Program.verifySinglefieldsEnrollNow();
		Program.verifyThankyouPage(CnameEOL);
	}
	
	
	
	
	
	
}
