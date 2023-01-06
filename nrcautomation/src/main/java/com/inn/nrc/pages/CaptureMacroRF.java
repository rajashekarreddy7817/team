package com.inn.nrc.pages;

import org.openqa.selenium.By;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureMacroRF extends TestBase {
	By basicdetails = By.xpath("//mat-panel-title[contains(text(),' Basic Details ')]");

	By allRequiredSupportingDocumentationBeenUploadedRadioBtn = By.xpath("(//mat-label[contains(text(),'No')])[4]");
	By DesignationOrCategory = By.xpath("(//mat-label[contains(text(),'No')])[1]");
	By Verification = By.xpath("//mat-panel-title[contains(text(),'Verification')]");
	By structureType = By.xpath("(//mat-select[@role='combobox'])[3]");
	By structureTypeMonopole = By.xpath("//span[contains(text(),'Monopole')]");
	By MethodOfEvaluation = By.xpath("(//mat-select[@role='combobox'])[4]");
	By methodOfEvaluationRoofview = By.xpath("//span[contains(text(),'Roofview')]");
	By RFSafetyMitigation = By.xpath("(//mat-label[contains(text(),'No')])[5]");
	By AntennaBottomTipHeight = By.xpath("//input[contains(@class,'ng-invalid cdk-text-field-autofill-monitored')]");
	By cancelbtn = By.xpath("//span[contains(text(),'Cancel')]");
	By submitBtn = By.xpath("//span[contains(text(),'Submit')]//parent::span//parent::button");
	
	public void capturemacrorf() throws Exception {
		TestUtil.clickOnByElement(basicdetails);
		TestUtil.clickOnByElement(allRequiredSupportingDocumentationBeenUploadedRadioBtn);
		TestUtil.clickOnByElement(DesignationOrCategory);
		TestUtil.clickOnByElement(Verification);
		TestUtil.sendKeysOnElement(AntennaBottomTipHeight, "100");
		TestUtil.clickOnByElement(structureType);
		TestUtil.clickOnByElement(structureTypeMonopole);
		TestUtil.clickOnByElement(MethodOfEvaluation);
		TestUtil.clickOnByElement(methodOfEvaluationRoofview);
		TestUtil.clickOnByElement(RFSafetyMitigation);
		//TestUtil.clickOnByElement(cancelbtn);
		driver.findElement(submitBtn).click();
		driver.findElement(submitBtn).click();
	}

}
