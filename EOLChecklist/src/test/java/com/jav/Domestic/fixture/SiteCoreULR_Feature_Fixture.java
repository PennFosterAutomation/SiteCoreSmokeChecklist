package com.jav.Domestic.fixture;



import org.junit.Assert;

public class SiteCoreULR_Feature_Fixture  extends EOLDomesticReceiveInfo_Fixture {
		
	static int CourseCount;
	
	

	public void verifyNavigatedtoSiteCoreHomepage()
	{
				SiteCore.verifyUserNavigatedtoSiteCoreHomepage();
	}
		
	public void verifyElementsDisplayOnStep1() {
		SiteCore.varifyPageElementsForStep1();
	}

	public void enterStudentInformationInStep1Form(String preFix, String Fname,
	String Lname, String Mail, String EmailExt, String Phone,
	String Address, String City, String State, String Zip) {
		SiteCore.fillFormStep1ForDomestic(preFix, Fname, Lname, Mail,
				EmailExt, Phone, Address, City, State, Zip);

	}

	public void verifyRedirectToThnakyouPageandClickonEnrollOnlineLink() {
		SiteCore.verifyThnakYouPageAfterStep1FormPage();
	}
	
	
	
}
