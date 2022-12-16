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

	public void capturemacrorf() throws Exception {
		TestUtil.clickOnByElement(basicdetails);	
//		driver.findElement(basicdetails).click();
		TestUtil.clickOnByElement(allRequiredSupportingDocumentationBeenUploadedRadioBtn);
//		driver.findElement(allRequiredSupportingDocumentationBeenUploadedRadioBtn).click();
		Thread.sleep(2000);
		TestUtil.clickOnByElement(DesignationOrCategory);		
	//	driver.findElement(DesignationOrCategory).click();
		TestUtil.clickOnByElement(Verification);
	//	driver.findElement(Verification).click();
		TestUtil.sendKeysOnElement(AntennaBottomTipHeight,"100");
//		driver.findElement(AntennaBottomTipHeight).sendKeys("100");
		TestUtil.clickOnByElement(structureType);
//		driver.findElement(structureType).click();
		TestUtil.clickOnByElement(structureTypeMonopole);
//		driver.findElement(structureTypeMonopole).click();
		TestUtil.clickOnByElement(MethodOfEvaluation);
//		driver.findElement(MethodOfEvaluation).click();
		TestUtil.clickOnByElement(methodOfEvaluationRoofview);
//		driver.findElement(methodOfEvaluationRoofview).click();
		TestUtil.clickOnByElement(RFSafetyMitigation);
		driver.findElement(RFSafetyMitigation).click();
		TestUtil.clickOnByElement(cancelbtn);
		
//		driver.findElement(cancelbtn).click();

	
	}

}
