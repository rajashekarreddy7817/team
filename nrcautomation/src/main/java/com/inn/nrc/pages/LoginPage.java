package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class LoginPage extends TestBase {

	By username = By.id("username");
	By password = By.id("password");
	By submit = By.name("SUBMIT");

	public HomePage loginNRC(String usn, String pwd) {
		TestUtil.sendKeysOnElement(username, usn);
		TestUtil.sendKeysOnElement(password, pwd);
		TestUtil.clickOnByElement(submit);
		return new HomePage();

	}

}
