package com.hrms.testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
//TC: Add Employee
//Step 1. navigate to the application
//Step 2: login into the application
//Step 3: navigate to add employee page
//Step 4: add employee by providing fname. mname, lname
//Step 5: verify employee has been added successfully
public class AddEmpVerification extends CommonMethods {
	
	@Test (groups = "regression") 
	public void login() {
		LoginPage login = new LoginPage();
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
		click(login.loginBtn);
//	@Test
//	public void navigateToEmpPage() {
		DashboardPage dash=new DashboardPage();
		jsClick(dash.pim);
		jsClick(dash.addEmp);
	
//	@Test
//	public void addEmp() {
		
		AddEmployeePage addEmp = new AddEmployeePage();
		sendText(addEmp.empFName, "Kuku");
		sendText(addEmp.empLName, "Mikikiki");
		click(addEmp.btnSave);
		
		EmployeeListPage empList = new EmployeeListPage();
		String expected = "Kuku Mikikiki";
		String actual = (empList.picText.getText());
		Assert.assertEquals(actual, expected);
			
		//takeScreenshoti("EmpVrfctn");
		
	}	
	}
//}
