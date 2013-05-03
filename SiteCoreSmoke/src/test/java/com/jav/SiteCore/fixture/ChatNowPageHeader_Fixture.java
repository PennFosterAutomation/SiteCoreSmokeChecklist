package com.jav.SiteCore.fixture;


public class ChatNowPageHeader_Fixture  extends SearchFunctionalityHomePageHeader_Fixture {
	
	public void clickViewAllPrograms()
	{
		ChatNow.clickViewAllPrograms();		
	}
	
	public void SelectCourse(String courseName)
	{		
		ChatNow.clickOnCourse(courseName);		
	}
	
	public void verifyPhoneNumber(String PhoneNumber){
		ChatNow.verifyPhoneNumber(PhoneNumber);
	}
	
	public void verifyChatNowHeader()
	{
		ChatNow.verifyChatNowHeader();		
	}
	
	public void verifyChatNowHeaderIE()
	{
		ChatNow.verifyChatNowHeaderIE();		
	}
	
	public void verifyChatNowFooterIE()
	{
		ChatNow.verifyChatNowFooterIE();		
	}
	
	public void verifyChatNowFooter()
	{
		ChatNow.verifyChatNowFooter();		
	}
}
