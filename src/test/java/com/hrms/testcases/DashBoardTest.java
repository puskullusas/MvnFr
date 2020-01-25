package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;

public class DashBoardTest extends LoginPage {

	@Test
	public void dBoardActions() {
		//login into app 
		//check if the dashboard  header is present
		//get the title of the page
		//check if the dropdown menu is clickable
		//click on the links in dropdown menu
		
	LoginPage obj = new LoginPage();//object of LoginPage in pages package
	obj.login("Admin","Syntax@123");
	//dashboard header is displayed?
	DashboardPage obj1 = new DashboardPage();
	Assert.assertTrue(obj1.dBoardHeader.isDisplayed());
	
	//getTitle
//	String expectedT = "Syntax HRM";
//	String actualT=driver.getTitle();
//	System.out.println(actualT);
//	Assert.assertEquals(actualT, expectedT);
	//get current url
//	String expUrl = "http://166.62.36.207/Syntax_HRM/symfony/web/index.php/dashboard";
//	String actualUrl = driver.getCurrentUrl();
//	Assert.assertEquals(actualUrl, expUrl, "this is what is on there " +actualUrl);
	
	click(obj1.welcome);
	click(obj1.about);
	//modal pop-up
	click(obj1.closeX);
	
	
	}
}
