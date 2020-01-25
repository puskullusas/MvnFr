package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReaderAsel;
import com.hrms.utils.Constants;
//import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class LoginPageTest extends CommonMethods {
	@Test (groups="smoke")
	public void loginN() {
		LoginPage obj =new LoginPage();
//		obj.login("Admin","Syntax@123");//based on method "login" in LoginPage
		
		//or based on properties File config we actually don't need to call reader Method 
		//ConfigsReaderAsel.readProperties(Constants.CONFIGS_FILEPATH);
		//and then call method getProperty
		sendText(obj.username, ConfigsReaderAsel.getProperty("username"));
		sendText(obj.password, ConfigsReaderAsel.getProperty("password"));
		click(obj.loginBtn);
	}

	@Test (groups="regression")
	public void negativeLogin() {
		LoginPage obj = new LoginPage();
		sendText(obj.username, ConfigsReaderAsel.getProperty("username"));
		click(obj.loginBtn);
		
		String expected = "Password cannot be empty";
	    Assert.assertEquals(obj.errorMsg.getText(), expected );
	}
/////		Assert.assertEquals(login.errorMsg().getText(),expected );
//	//logging in with different credentials example from excel file 
//	@Test(dataProvider = "getData")
//	public void multipleLogin(String uid, String pwd) {
//		LoginPage obj =new LoginPage();
//		sendText(obj.username, uid);
//		sendText(obj.password, pwd);
//		click(obj.loginBtn);
//	}
//	
//	@DataProvider
//	public Object[][] getData(){
//		return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "addEmpl");
//	}
//	//our login credentials will be coming from Excel, then loaded into 2D Array, then loaded into Data provider, then into testMethod
	}

