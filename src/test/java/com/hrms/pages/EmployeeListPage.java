package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class EmployeeListPage {
	@FindBy(xpath= "//div[@id='profile-pic']/h1")
	public WebElement picText;
	
	
	//add pageFactory!!!
	public EmployeeListPage (){
		PageFactory.initElements(BaseClass.driver, this); 
	}
}
