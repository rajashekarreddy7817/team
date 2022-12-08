package com.inn.nrc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(name = "SUBMIT")
	WebElement submit;

	// Initilization the pagefactory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage loginNRC(String usn, String pwd){
		username.sendKeys(usn);
		password.sendKeys(pwd);
		submit.click();
		return new HomePage();

	}

}
