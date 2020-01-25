package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;
import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class AddEmpUsingProvider extends CommonMethods {

	@Test(dataProvider = "getData")
	public void usingProvider(String firstName, String midName, String lastName ) throws InterruptedException {
		//Loggin into app HRMS
		LoginPage obj = new LoginPage();
		obj.loginUsingProperties();
		
		//navigate to AddEmployee page from DashBoard
		DashboardPage obj1 = new DashboardPage();
		obj1.navigateToAddEmployee();
		//add employee		
		AddEmployeePage obj2 = new AddEmployeePage();
//		sendText(obj2.empFName, firstName);
//		sendText(obj2.middleName, midName);
//		sendText(obj2.empLName, lastName);
//		click(obj2.btnSave);
		
		//or can be done using method available inside pages
		obj2.addNewEmployee(firstName, midName, lastName);
		
		Thread.sleep(3000);
		//Verification
		EmployeeListPage obj3 = new EmployeeListPage();
		String expected = firstName+" "+midName+" "+lastName;
		String actual = obj3.picText.getText();
		Assert.assertEquals(actual, expected);
	}
		@DataProvider
		public Object[][] getData(){
			return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "addEmpl");
		}
		
		
	}

