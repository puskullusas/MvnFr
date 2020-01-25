package com.hrms.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPage;
import com.hrms.pages.LeaveListPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;

public class LeaveListPageTest extends CommonMethods {

	@Test(groups = "regression")
	public void leaveLabelvalid() {
		LoginPage loginObj = new LoginPage();
		DashboardPage dashboard = new DashboardPage();
		LeaveListPage leavelist = new LeaveListPage();
			test.info("Loggin into application"); //we can add it optional to see on reports
		//we have already created a method for login in in LoginPage, to use it we also need an obj, cause it is not static
		loginObj.login("Admin","Syntax@123");
			test.info("Navigating to the LeaveList"); //optional to see on reports
		jsClick(dashboard.leaveList);
			test.info("Validating Leave List Label");
		Assert.assertTrue(leavelist.leaveListLbl.isDisplayed(), "Label is Not Displayed");
	}
}
