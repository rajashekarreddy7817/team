package com.inn.nrc.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureSow extends TestBase {

	By structureStatusSectionDropDown = By
			.xpath("//mat-panel-title[contains(text(),' Structure Status Section ')]//following::span[1]");
	By lat_Long_GEUpdate = By.xpath(
			"(//div[contains(@class,'mat-select-value ng-tns')]//following::span[contains(@class,'mat-select-placeholder mat-select-min-line ng-tns')])[1]");
	By selectLat_Long_GEUpdateYes = By.xpath("(//span[contains(text(),'No')]//following::div[1])[4]");

	By groundElevation = By.xpath(
			"//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c123-382 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']");
	By overallHeight = By.xpath(
			"//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c123-382 ng-invalid cdk-text-field-autofill-monitored ng-touched ng-dirty']");

	By structureHeight = By.xpath(
			"//input['//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c123-86 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']");
	By heightfields = By.xpath("");

	public void fillStructureStatusSection() throws Exception {

		TestUtil.clickOnByElement(structureStatusSectionDropDown);
		TestUtil.clickOnByElement(selectLat_Long_GEUpdateYes);
		TestUtil.clearElement(groundElevation);
		TestUtil.sendKeysOnElement(groundElevation, "12");
		TestUtil.clearElement(structureHeight);
		TestUtil.sendKeysOnElement(structureHeight, "100");
//		driver.findElement(structureHeight).sendKeys("100");
		TestUtil.clearElement(overallHeight);
//		driver.findElement(overallHeight).sendKeys("100");

		TestUtil.sendKeysOnElement(overallHeight, "100");

////		List<WebElement> heightGroundElevationClear = driver.findElements(heightfields);
////		for (int i = 0; i < heightGroundElevationClear.size(); i++) {
////			System.out.println(heightGroundElevationClear.size());
////			TestUtil.waitThreadSleep(groundElevation);
////			heightGroundElevationClear.get(0).clear();
//		}

	}
}
