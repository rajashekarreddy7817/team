package com.inn.nrc.pages;

import org.openqa.selenium.By;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureSow extends TestBase{
	By structureStatusSectionDropDown=By.xpath(" //mat-panel-title[contains(text(),'Structure Status Section ')]");
	By lat_Long_GEUpdate= By.xpath("//div[@class='mat-select-trigger ng-tns-c203-77']");
	By selectLat_Long_GEUpdateYes= By.xpath("(//span[contains(text(),'No')])[3]");
	By groundElevation=By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c123-382 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']");
	By overallHeight =By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c123-382 ng-invalid cdk-text-field-autofill-monitored ng-touched ng-dirty']");
			
	By structureHeight=By.xpath("//input['//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c123-86 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']");

	public void fillStructureStatusSection()
	{
		TestUtil.waitTillElementVisible(structureStatusSectionDropDown);
		driver.findElement(structureStatusSectionDropDown).click();
		TestUtil.waitTillElementVisible(lat_Long_GEUpdate);
		driver.findElement(lat_Long_GEUpdate).click();
		
		driver.findElement(selectLat_Long_GEUpdateYes).click();
		driver.findElement(groundElevation).clear();
		driver.findElement(groundElevation).sendKeys("12");
		driver.findElement(structureHeight).clear();
		driver.findElement(structureHeight).sendKeys("100");
		driver.findElement(overallHeight).clear();
		driver.findElement(overallHeight).sendKeys("100");
		
		
	}
}
