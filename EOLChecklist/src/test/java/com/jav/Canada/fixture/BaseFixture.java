package com.jav.Canada.fixture;
import com.jav.Canada.fixture.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.WebDriver;


import com.jav.Canada.pageobjects.EOLCanadaReceiveInfo_UI;
import com.jav.Canada.pageobjects.EOLCanadaReceiveInfo_nocourse_UI;
//import com.jav.Domestic.pageobjects.EOLEnrollNow_UI;
//import com.jav.Domestic.pageobjects.EOLEnrollNow_nocourse_UI;
import com.jav.Canada.util.Utilities;


public class BaseFixture {
	
	public WebDriver driver;
	public DesiredCapabilities capabilities;
	
	
	
	EOLCanadaReceiveInfo_nocourse_UI ICSCanada;
	EOLCanadaReceiveInfo_UI CanReciveInfo;
//	EOLEnrollNow_UI DomEnrollNow;
//	EOLEnrollNow_nocourse_UI DomEnrollNowNoCourse;
	
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
                    if((System.getProperty("os.name")).contains("Linux")){
                    DesiredCapabilities caps = DesiredCapabilities.chrome();             
                    caps.setJavascriptEnabled(true);
                    System.setProperty("webdriver.chrome.driver","chromedriver");
                    driver = new ChromeDriver(caps);        
                } else if((System.getProperty("os.name")).contains("Windows")){
                    capabilities.setBrowserName("chrome");
                    System.setProperty("webdriver.chrome.driver",
                    "chromedriver.exe");
                    driver = new ChromeDriver();
		}
                }
		int ajax_timeout = Integer.parseInt(getYamlVal("ajax_timeout"));
        driver.manage().timeouts().implicitlyWait(ajax_timeout, TimeUnit.SECONDS);
        initPageObjects();

	}
	
	public void initPageObjects() {
		
		ICSCanada = new EOLCanadaReceiveInfo_nocourse_UI(driver);
		CanReciveInfo = new EOLCanadaReceiveInfo_UI(driver);
//		DomEnrollNow = new EOLEnrollNow_UI(driver);
//		DomEnrollNowNoCourse = new EOLEnrollNow_nocourse_UI(driver);
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
