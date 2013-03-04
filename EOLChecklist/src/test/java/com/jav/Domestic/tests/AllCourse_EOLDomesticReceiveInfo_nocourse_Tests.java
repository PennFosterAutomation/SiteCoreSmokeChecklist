/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jav.Domestic.tests;

import java.io.IOException;
import org.testng.*;
import com.jav.Domestic.fixture.*;
import com.jav.Domestic.util.Utilities;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author QAIT
 */
public class AllCourse_EOLDomesticReceiveInfo_nocourse_Tests {

	EOLDomesticReceiveInfo_nocourse_Fixture test = new EOLDomesticReceiveInfo_nocourse_Fixture();
	

	static int TotalCources;
	public static String StrName;
	public static int GetSelectedCourse;
	public static int initialCounter;
    @BeforeClass
    public void initialsettings() {
        test.setUpDataFile("testData/integration_testData_Domestic.yml");
        Utilities.createExcel();
    }

	@Test
    public void setup()
    {
        test.startBrowserSession();
        
    }
	
	@Test(dependsOnMethods = "setup")
    public void launchHomePage() throws InterruptedException
    {
		test.launchUrl(test.getYamlVal("appurl"));
		Utilities.hardWait(4);
    }
	
	@Test(dependsOnMethods = "launchHomePage")
	public void homePageactions()
	{		
		test.verifyHomepage();		
	}
	
	@Test(dependsOnMethods = "homePageactions")
	public void getNumberOfCourseAvailable()
	{		
		TotalCources = test.getCourseCount();	
		System.out.println(TotalCources);
		test.stopBrowserSession();
	}
	
	@Test(dependsOnMethods = "getNumberOfCourseAvailable")
    public void Test() throws IOException {
		
		if (Utilities.getYamlValue("DomesticURLReceiveInformationnocourse.RunType").equalsIgnoreCase("Selected")){
			for (initialCounter=1; initialCounter<=Integer.parseInt(Utilities.getYamlValue("DomesticURLReceiveInformationnocourse.TotalCource"));initialCounter++)
			{
				System.out.println(initialCounter+" initial counter");
	            TestListenerAdapter tla = new TestListenerAdapter();
	            TestNG testng = new TestNG();
	            testng.setTestClasses(new Class[]{EOLDomesticReceiveInfo_nocourse_Test.class});
	            testng.addListener(tla);
	            testng.run();
	            Utilities.lastRunReportSave();
	            System.out.println("### "+initialCounter+" Selected All test class");
			}	
		} 
		else{
			if (Utilities.getYamlValue("DomesticURLReceiveInformationnocourse.RunType").equalsIgnoreCase("AllCources")){
				for (initialCounter=1; initialCounter<=TotalCources;initialCounter++)
				{
					System.out.println(initialCounter+" initial counter");
		            TestListenerAdapter tla = new TestListenerAdapter();
		            TestNG testng = new TestNG();
		            testng.setTestClasses(new Class[]{EOLDomesticReceiveInfo_nocourse_Test.class});
		            testng.addListener(tla);
		            testng.run();
		            System.out.println("###"+initialCounter+"All Cources All test class");
		    		Reporter.log(Utilities.logOutputFile(" ########## Start browser session ENDS ###########"));
		    		

				}		
		
			}		
		}	
		Utilities.copyFile();
		Utilities.renameReportFolder();	
	}    
}