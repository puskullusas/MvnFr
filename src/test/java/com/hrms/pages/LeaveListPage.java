package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class LeaveListPage extends BaseClass {

	@FindBy (css="a.toggle.tiptip")//Leave List Lable text /baslik
	public WebElement leaveListLbl;
	//Constructor
	public LeaveListPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
