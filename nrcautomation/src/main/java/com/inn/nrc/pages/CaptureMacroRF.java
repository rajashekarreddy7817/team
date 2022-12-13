package com.inn.nrc.pages;

import org.openqa.selenium.By;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureMacroRF extends TestBase {
	By basicdetails = By.xpath("//mat-panel-title[contains(text(),' Basic Details ')]");

	By allRequiredSupportingDocumentationBeenUploadedRadioBtn = By.xpath("(//mat-label[contains(text(),'No')])[4]");
	By DesignationOrCategory = By.xpath("(//mat-label[contains(text(),'No')])[1]");
	By Verification = By.xpath("//mat-panel-title[contains(text(),'Verification')]");
	By structureType = By.xpath("//div[@class='mat-select-trigger ng-tns-c203-65']");
	By structureTypeMonopole = By.xpath("//span[contains(text(),'Monopole')]");
	By MethodOfEvaluation = By.xpath("//div[@class='mat-select-value ng-tns-c203-72']");
	By methodOfEvaluationRoofview = By.xpath("//span[contains(text(),'Roofview')]");
	By RFSafetyMitigation = By.xpath("(//mat-label[contains(text(),'No')])[5]");
	By AntennaBottomTipHeight = By.xpath("//input[contains(@class,'ng-tns-c123-68 ng-untouched')]");
	By cancelbtn = By.xpath("//span[contains(text(),'Cancel')]");

	public void capturemacrorf() throws Exception {
		TestUtil.waitThreadSleep(basicdetails);
		driver.findElement(basicdetails).click();
		TestUtil.waitTillElementVisible(allRequiredSupportingDocumentationBeenUploadedRadioBtn);
		driver.findElement(allRequiredSupportingDocumentationBeenUploadedRadioBtn).click();
		Thread.sleep(2000);
		driver.findElement(DesignationOrCategory).click();
		TestUtil.waitTillElementVisible(Verification);
		driver.findElement(Verification).click();
		TestUtil.waitThreadSleep(structureType);
		driver.findElement(structureType).click();
		TestUtil.waitTillElementVisible(structureTypeMonopole);
		driver.findElement(structureTypeMonopole).click();
		TestUtil.waitTillElementVisible(MethodOfEvaluation);
		driver.findElement(MethodOfEvaluation).click();
		TestUtil.waitTillElementVisible(methodOfEvaluationRoofview);
		driver.findElement(methodOfEvaluationRoofview).click();
		TestUtil.waitTillElementVisible(RFSafetyMitigation);
		driver.findElement(RFSafetyMitigation).click();
		TestUtil.waitTillElementVisible(AntennaBottomTipHeight);
		driver.findElement(AntennaBottomTipHeight).sendKeys("100");
		driver.findElement(cancelbtn).click();

	}

}
