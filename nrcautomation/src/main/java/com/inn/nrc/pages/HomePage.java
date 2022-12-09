package com.inn.nrc.pages;

import org.openqa.selenium.By;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class HomePage extends TestBase{

	By menuBar= By.xpath("//mat-icon[@class='mat-icon notranslate icon-hover icomoon menu mat-icon-no-color ng-star-inserted']");
	By jobModule= By.xpath("//label[contains(text(),'Jobs')]");


	public void navigateToJob() throws Exception {
		TestUtil.waitTillElementVisible(menuBar);
		driver.findElement(menuBar).click();
		driver.findElement(jobModule).click();
	}






}

