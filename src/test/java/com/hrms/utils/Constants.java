package com.hrms.utils;

public class Constants {
//	 	public static final String HRMS_URL="http://166.62.36.207/Syntax_HRM";
//	    public static final String BROWSER="chrome";
//	    
		//specify path to chrome & gecko driver
  		public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe";
	            
	    public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver.exe";
	    
	    //WAITTIMES
	    public static final int PAGE_LOAD_TIME=30;
	    
	    public static final int IMPLICIT_LOAD_TIME=10;
	    
	    public static final int EXPLICIT_LOAD_TIME=30;
	    
	    //PATHs
	    //path to browser use, password and username
	    public static final String CONFIGS_FILEPATH = System.getProperty("user.dir")
				+ "/src/test/resources/configs/Configuration.properties";
	    
	    public static final String XL_DATA_FILEPATH = System.getProperty("user.dir")
				+ "/src/test/resources/testdata/TestCaseMaybe.xlsx";
	    
	    //path for reports
	    public static final String REPORTS_FILEPATH = System.getProperty("user.dir")+ "/target/Report/Hrms_report.html";
	    
	    		//"./target/Report/Hrms_report.html";
	    
	    //get our operation system name to attach to our reports
	    public static final String OS_NAME=System.getProperty("os.name");
	    
	    //username of the tester to attach to our reports
	    public static final String PC_USER= System.getProperty("user.name");
	    
	    public static final String SCREENSHOTS_PATH = System.getProperty("user.dir")+ "/target/screenShots/";
	    
	  
	    
	    //password and username can be stored here too, if you don't want anybody to see it, you can use git ignore on this file when you push
//	    public static final String USERNAME = "Admin";
//	    public static final String PASSWORD = "Syntax@123";
	    
	}
	

