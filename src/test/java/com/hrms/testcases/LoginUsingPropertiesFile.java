package com.hrms.testcases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReaderDontUse;


public class LoginUsingPropertiesFile extends BaseClass{//why do i need to extend

	Properties prop;
	
	@Test(groups = "smoke")
	//calling method to read properties file
	public void reading() {
	ConfigsReaderDontUse.readProperties("Configuration");
	String passWord = ConfigsReaderDontUse.getProperty("password");
	String userName = ConfigsReaderDontUse.getProperty("username");
	
	
	LoginPage obj = new LoginPage();
	obj.login(userName, passWord);
	
	DashboardPage dP= new DashboardPage();
	Assert.assertEquals(dP.welcome.getText(), "Welcome Admin");
	 
	CommonMethods.takeScreenshoti("LoginUsingProperties");
	
	}
	}
	

