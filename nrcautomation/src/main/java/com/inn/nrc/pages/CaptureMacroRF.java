package com.inn.nrc.pages;

import org.openqa.selenium.By;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureMacroRF extends TestBase {
	By basicdetails = By.xpath("//mat-panel-title[contains(text(),' Basic Details ')]");
	// By allRequiredSupportingDocumentationBeenUploadedRadioBtn=
	// By.xpath("//mat-radio-button[@id='mat-radio-128']//span[@class='mat-radio-container']");
	By Verification = By.xpath("//mat-panel-title[contains(text(),'Verification')]");
	By Antennatipheight = By.xpath("//*[@id='mat-input-384']");
	//By structuretype = By.xpath("//mat-option[@id='mat-option-246']//span[@class='mat-option-text']");

	public void capturemacrorf() throws Exception {
		TestUtil.waitTillElementVisible(basicdetails);
		driver.findElement(basicdetails).click();
		// TestUtil.waitTillElementVisible(allRequiredSupportingDocumentationBeenUploadedRadioBtn);
		// driver.findElement(allRequiredSupportingDocumentationBeenUploadedRadioBtn).click();
		TestUtil.waitTillElementVisible(Verification);
		driver.findElement(Verification).click();
		//TestUtil.waitTillElementVisible(structuretype);
		//driver.findElement(structuretype).click();
		TestUtil.waitTillElementVisible(Antennatipheight);
		driver.findElement(Antennatipheight).sendKeys("100");
	

	}

}
