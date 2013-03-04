package com.jav.automation.fixture;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.WebDriver;


import com.jav.automation.pageobjects.EOLDomesticReceiveInfo_UI;
import com.jav.automation.pageobjects.EOLDomesticReceiveInfo_nocourse_UI;
import com.jav.automation.pageobjects.EOLEnrollNowInfo_UI;
import com.jav.automation.util.Utilities;


public class BaseFixture {
	
	public WebDriver driver;
	public DesiredCapabilities capabilities;
	
	
	
	EOLDomesticReceiveInfo_nocourse_UI PanFoster;
	EOLDomesticReceiveInfo_UI DomReciveInfo;
	EOLEnrollNowInfo_UI DomEnrollNow;
	
	public void startBrowserSession()
	{
		capabilities = new DesiredCapabilities();
	    capabilities.setJavascriptEnabled(true);
	    if (getYamlVal("browser").equalsIgnoreCase("firefox")) {
		capabilities.setBrowserName("firefox");
		driver = new FirefoxDriver();
		}else if (getYamlVal("browser").equalsIgnoreCase("iexplore")){
		capabilities.setBrowserName("iexplore");
		driver = new InternetExplorerDriver();
		} else if (getYamlVal("browser").equalsIgnoreCase("chrome")){
		capabilities.setBrowserName("chrome");
		System.setProperty("webdriver.chrome.driver",
                "chromedriver.exe");
		driver = new ChromeDriver();
		}
		int ajax_timeout = Integer.parseInt(getYamlVal("ajax_timeout"));
        driver.manage().timeouts().implicitlyWait(ajax_timeout, TimeUnit.SECONDS);
        initPageObjects();

	}
	
	public void initPageObjects() {
		
		PanFoster = new EOLDomesticReceiveInfo_nocourse_UI(driver);
		DomReciveInfo = new EOLDomesticReceiveInfo_UI(driver);
		DomEnrollNow = new EOLEnrollNowInfo_UI(driver);
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
