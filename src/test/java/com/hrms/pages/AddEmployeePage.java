package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmployeePage {

@FindBy(id="lastName")
	public WebElement empLName;

@FindBy(id="middleName")
public WebElement middleName;

@FindBy(id ="firstName")
public WebElement empFName;

@FindBy(id="btnSave")
	public WebElement btnSave;

//add pageFactory!!!
public AddEmployeePage (){
	PageFactory.initElements(BaseClass.driver, this); 
}

	public void addNewEmployee (String firstName, String midName, String lastName ) {
		CommonMethods.sendText(empFName, firstName);
		CommonMethods.sendText(middleName, midName);
		CommonMethods.sendText(empLName, lastName);
		CommonMethods.click(btnSave);
	}

}