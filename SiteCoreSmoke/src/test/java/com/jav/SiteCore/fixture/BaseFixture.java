package com.jav.SiteCore.fixture;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import com.jav.SiteCore.util.Utilities;
import com.jav.SiteCore.pageobjects.EnrollNowUi;
import com.jav.SiteCore.pageobjects.FloodLight_Script_UI;
import com.jav.SiteCore.pageobjects.Program_Tab_UI;
import com.jav.SiteCore.pageobjects.WhichProgramIsRightForMe_UI;
import com.jav.SiteCore.pageobjects.TimeToCompleteCarrerSchools_UI;
import com.jav.SiteCore.pageobjects.SearchFunctionalityHomePageHeader_UI;
import com.jav.SiteCore.pageobjects.ChatNowPageHeader_UI;


public class BaseFixture {
	
	public WebDriver driver;
	public DesiredCapabilities capabilities;
	
	WhichProgramIsRightForMe_UI SiteCore;
	TimeToCompleteCarrerSchools_UI CareerSchool;
	SearchFunctionalityHomePageHeader_UI Search;
	ChatNowPageHeader_UI ChatNow;	
	Program_Tab_UI Program;
	EnrollNowUi enroll;
	FloodLight_Script_UI FScript;
	
	public void startBrowserSession()
	{
		capabilities = new DesiredCapabilities();
	    capabilities.setJavascriptEnabled(true);
	    if (getYamlVal("browser").equalsIgnoreCase("firefox")) {
		capabilities.setBrowserName("firefox");
		driver = new FirefoxDriver();
		}else if (getYamlVal("browser").equalsIgnoreCase("iexplore")){
			File file = new File("IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setJavascriptEnabled(true);
            Utilities.hardWait(5);
            driver = new InternetExplorerDriver(dc);
            
            Utilities.hardWait(5);

		} else if (getYamlVal("browser").equalsIgnoreCase("chrome")){
			capabilities.setBrowserName("chrome");
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
		}
		int ajax_timeout = Integer.parseInt(getYamlVal("ajax_timeout"));
        driver.manage().timeouts().implicitlyWait(ajax_timeout, TimeUnit.SECONDS);
        initPageObjects();
        driver.manage().window().maximize();

	}
	
	public void initPageObjects() {
		SiteCore = new WhichProgramIsRightForMe_UI(driver);
		CareerSchool = new TimeToCompleteCarrerSchools_UI(driver);
		Search = new SearchFunctionalityHomePageHeader_UI(driver);
		ChatNow = new ChatNowPageHeader_UI(driver);
		Program = new Program_Tab_UI(driver);
		enroll = new EnrollNowUi(driver);
		FScript = new FloodLight_Script_UI(driver);
	}
	
	public void launchUrl(String url)
	{
		driver.get(url);
		
	}
	
	public void stopBrowserSession() {
        driver.quit();
	}
	
	
	
	public void setUpDataFile(String dataFilePath) {
        Utilities.setYamlFilePath(dataFilePath);
    }
	
	public String getYamlVal(String yamlMapObj) {
        return Utilities.getYamlValue(yamlMapObj);
    }

}
