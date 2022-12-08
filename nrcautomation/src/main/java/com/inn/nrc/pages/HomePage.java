package com.inn.nrc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath= "//mat-icon[@class='mat-icon notranslate icon-hover icomoon menu mat-icon-no-color ng-star-inserted']")
	WebElement menuBar;
	
	@FindBy(xpath = "//label[contains(text(),'Jobs')]")
	WebElement jobModule;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToJob() throws Exception {
		Thread.sleep(3000);
		menuBar.click();
		jobModule.click();
	}






}

