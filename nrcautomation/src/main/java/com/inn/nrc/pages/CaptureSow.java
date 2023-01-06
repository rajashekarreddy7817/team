package com.inn.nrc.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureSow extends TestBase {

	By structureStatusSectionDropDown = By
			.xpath("//mat-panel-title[contains(text(),' Structure Status Section ')]//following::span[1]");
	By lat_Long_GEUpdate = By.xpath("(//mat-select[@role='combobox'])[7]");
	By selectLat_Long_GEUpdateno = By.xpath("//span[text()='No']");
	By groundElevation = By.xpath("(//input[@type='text' and @maxlength='10'])[2]");
	By overallHeight = By.xpath("(//input[@type=\"text\" and @maxlength='10'])[5]");
	By structureHeight = By.xpath("(//input[@type='text' and @maxlength='10'])[4]");
	
	public void fillStructureStatusSection() throws Exception {
		Thread.sleep(4000);
		TestUtil.clickOnByElement(structureStatusSectionDropDown);
		// TestUtil.clickOnByElement(selectLat_Long_GEUpdateno);
		TestUtil.clearElement(groundElevation);
		TestUtil.sendKeysOnElement(groundElevation, "12");
		TestUtil.clearElement(structureHeight);
		TestUtil.sendKeysOnElement(structureHeight, "100");
//		driver.findElement(structureHeight).sendKeys("100");
		TestUtil.clearElement(overallHeight);
//		driver.findElement(overallHeight).sendKeys("100");

		TestUtil.sendKeysOnElement(overallHeight, "100");

		
		
		
	
		
		
		
		
		
		
		
		//		List<WebElement> heightGroundElevationClear = driver.findElements(heightfields);
//		for (int i = 0; i < heightGroundElevationClear.size(); i++) {
//			System.out.println(heightGroundElevationClear.size());
//			TestUtil.waitThreadSleep(groundElevation);
//			heightGroundElevationClear.get(0).clear();
//		}

	}
}
