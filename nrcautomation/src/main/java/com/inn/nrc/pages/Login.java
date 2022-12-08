package com.inn.nrc.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;

public class Login extends TestBase {
	
	
	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//button[@id=\"kc-login\"]")
	WebElement submit;
	
	
	//Initilization the pagefactory
		public   Login() {
			PageFactory.initElements(driver, this);
		}
		
		public homepage login(String usn, String pwd) {
		username.sendKeys(usn);
		password.sendKeys(pwd);	
		submit.click();	
			return new homepage();
			
		}
		
		
		
}
