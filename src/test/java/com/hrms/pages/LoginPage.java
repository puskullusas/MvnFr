package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReaderAsel;
import com.hrms.utils.Constants;
//storing WebElements of this particular WebPage
public class LoginPage extends CommonMethods{
//	//will initialize these variables first, so we have to make sure that elements are visible at the time of initializing
//	public WebElement username =driver.findElement(By.xpath("//input[@name='txtUsername']"));
//	public WebElement passwrd =driver.findElement(By.id("txtPassword"));
//	public WebElement logButtn =driver.findElement(By.id("btnLogin"));
	//public WebElement errMssg = driver.findElement(By.id("spanMessage")); //this element is only visible if the password entered incorrectly, so
	//if initialized right now, it will give nosuchelement exception

	
	
//	public WebElement errMssg() {
//	WebElement errMssg = driver.findElement(By.id("spanMessage"));
//	return errMssg;
//	}
	@FindBy(xpath = "//div[@id='divLogo']")
	public WebElement logo;

	@FindBy(id="logInPanelHeading")
	public WebElement loginLabel;

	@FindBy(name="txtUsername")
	public WebElement username;

	@FindBy(css="input#txtPassword")
	public WebElement password;

	@FindBy(css="input[name='Submit']")
	public WebElement loginBtn;

	@FindBy(id="spanMessage")
	public WebElement errorMsg;

	public LoginPage() {//constructor
	PageFactory.initElements(BaseClass.driver, this);
	}
	
	//we can also develop functions/methods in here to reuse them
	//LOGIN METHOD non-static, cannot make it static cause elements inside this method are non-static
	public void login(String uid, String pwd) {
		sendText(username, uid);//(webelement username is from loginpage is non-static, + string actual Username " ")
		sendText(password, pwd);
		click(loginBtn);
	}
	
	public void loginUsingProperties() {
		//ConfigsReaderAsel.readProperties(Constants.CONFIGS_FILEPATH); no need to use this, it is already in Base Class
		sendText(username, ConfigsReaderAsel.getProperty("username"));
		sendText(password, ConfigsReaderAsel.getProperty("password"));
		click(loginBtn);
		
	}
}
