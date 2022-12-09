package com.inn.nrc.pages;

import org.openqa.selenium.By;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class CaptureMacroRF extends TestBase{
	By basicdetails=By.xpath("//mat-panel-title[normalize-space()='Basic Details']");
	By allRequiredSupportingDocumentationBeenUploadedRadioBtn=By.xpath("//label[@for='mat-radio-51-input']//span[@class='mat-radio-outer-circle']");
	
	
	
	
	
public void capturemacrorf() {
	TestUtil.waitTillElementVisible(basicdetails);
	driver.findElement(basicdetails).click();
	TestUtil.waitTillElementVisible(allRequiredSupportingDocumentationBeenUploadedRadioBtn);
	driver.findElement(allRequiredSupportingDocumentationBeenUploadedRadioBtn).click();
}

}
