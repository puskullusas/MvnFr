package com.hrms.testbase;
//SETTING UP OUR WEBDRIVER
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.hrms.utils.ConfigsReaderAsel;
import com.hrms.utils.Constants;
public class BaseClass {
	
    public static WebDriver driver;
    public static ExtentHtmlReporter html;
    public static ExtentReports report; 
    public static ExtentTest test;
    
    @BeforeTest(alwaysRun=true)
    public void generateReport() {
    	ConfigsReaderAsel.readProperties(Constants.CONFIGS_FILEPATH);
    	//to create reports we need to use 2 classes, setting up the config for HTML page
    	//1.
    	html = new ExtentHtmlReporter(Constants.REPORTS_FILEPATH);
    	html.config().setTheme(Theme.DARK);
    	html.config().setDocumentTitle("Syntax Report");
    	html.config().setReportName("HRM Execution Report");
    	//2.
    	report = new ExtentReports();
    	report.attachReporter(html);
    	//passing info on my report, what i want to see
    	report.setSystemInfo("QA Engineer", Constants.PC_USER);
    	report.setSystemInfo("Environment", "Test");
    	report.setSystemInfo("OS name", Constants.OS_NAME);
    	report.setSystemInfo("Browser", ConfigsReaderAsel.getProperty("browser"));
    	    	
    }
    @AfterTest (alwaysRun=true)
    public void writeReport() {
    	report.flush();
    	    }
    
    @BeforeMethod (alwaysRun=true)
    	public void setUp() {
    	//browser will be read from Properties file
    	//ConfigsReaderAsel.readProperties(Constants.CONFIGS_FILEPATH);//reads entire file and initializes static variable prop
       // switch (Constants.BROWSER.toLowerCase()) {//browser is in constants file of in properties file
      
    	switch (ConfigsReaderAsel.getProperty("browser").toLowerCase()) { //trying to get property of browser, which equals to Chrome in Constants class
    	case "chrome":
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
            break;
        case "firefox":
            System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
            driver = new FirefoxDriver();
            break;
        default:
            System.err.println("Browser is not supported");
        }
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
       // driver.manage().window().maximize();
        //driver.get(Constants.HRMS_URL);//old version 
        driver.get(ConfigsReaderAsel.getProperty("url"));
    }
    
      @AfterMethod(alwaysRun=true)
    public void tearDown() {
    	 	
        if (driver != null) {
            driver.quit();
        }
    }
}
