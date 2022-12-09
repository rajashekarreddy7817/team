package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;

public class HomePage extends TestBase{

	By menuBar= By.xpath("//mat-icon[@class='mat-icon notranslate icon-hover icomoon menu mat-icon-no-color ng-star-inserted']");
	By jobModule= By.xpath("//label[contains(text(),'Jobs')]");
	
	
	public void navigateToJob() throws Exception {
		Thread.sleep(3000);
		driver.findElement(menuBar).click();
		driver.findElement(jobModule).click();
		}






}

