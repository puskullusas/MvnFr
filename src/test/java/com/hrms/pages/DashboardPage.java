package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPage extends CommonMethods {
	//some elements of this page
		
	@FindBy(xpath="//span[text()='Leave List']")
	public WebElement leaveList;
	//if we want to navigate to Leave List page, we will need to create new page with elements of that page
		
	//PIM
	@FindBy(linkText="PIM")
	public WebElement pim;
	
	@FindBy(linkText="Add Employee")
	public WebElement addEmp;
	
	@FindBy(xpath ="//a[text()='Welcome Admin']")
	public WebElement welcome;
	
	@FindBy(xpath = "//div[@class='head']/h1")
	public WebElement dBoardHeader;
	
	@FindBy(linkText="About")
	public WebElement about;
	
	@FindBy(xpath ="//h3[text()='About']/preceding-sibling:: a")
	public WebElement closeX;
	
	//PAGE FACTORY Constructor to initialize variables using webdrivr
	public DashboardPage(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	//METHODS FOR NAVIGATION can be developed for ex
	public void navigateToLeaveList() {
		jsClick(leaveList);
	}
	
	public void navigateToAddEmployee() {
		jsClick(pim);
		jsClick(addEmp);
	}
	

}
