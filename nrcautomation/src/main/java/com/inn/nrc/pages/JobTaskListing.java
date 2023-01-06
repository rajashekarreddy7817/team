package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

import io.reactivex.rxjava3.functions.Action;

public class JobTaskListing extends TestBase {

	By clickOn3DotsMacro = By.xpath("//div[@row-index='0']/descendant::mat-icon[@aria-label='mat icon']");
	By acquireBtn = By.xpath("//span[text()='Acquire']");
	By executeFromActionList = By.xpath("(//div[@class='icon icon-hover'])[2]");
	By executebtn = By.xpath("//button[@role='menuitem']//span[text()='Execute']");
	By clickOn3DotSow = By.xpath(
			"(//mat-icon[@class='mat-icon notranslate icon-hover material-icons mat-icon-no-color ng-star-inserted'])[2]");
	//// mat-panel-title[n-ormalize-space()='Basic Details']
	By acquireSOWBtn = By.xpath("//span[contains(text(),'Acquire')]");
	By executeSOWBtn = By.xpath(
			"//mat-icon[@class='mat-icon notranslate icon-hover icomoon Like-Outline mat-icon-no-color ng-star-inserted']");
	By executeSOW4thBtn = By.xpath("//button[@class='mat-focus-indicator mat-menu-item ng-star-inserted'])[4]");
	By cancelacquire = By.xpath("//span[contains(text(),'Cancel Acquire')]");
	By cancelacquire1 = By.xpath("(//span[contains(text(),'Cancel Acquire')])[2]");
	By captureMacroRFTask = By.xpath("//div[contains(text(),'Capture MACRO RF')]");
	By captureSOWTask = By.xpath("//div[contains(text(),'Capture SOW')]");

	
	public void acquireTask() throws Exception {
//		TestUtil.clickOnByElement(captureMacroRFTask);
		TestUtil.clickOnByElement(clickOn3DotsMacro);

		try {
			driver.findElement(acquireBtn).isDisplayed();
			TestUtil.clickOnByElement(acquireBtn);
			TestUtil.clickOnByElement(executeFromActionList);
		} catch (Exception e) {
			driver.findElement(executebtn).isDisplayed();
			TestUtil.clickOnByElement(executebtn);
		}

	}

	public void cancelAcquire() {
		TestUtil.clickOnByElement(clickOn3DotsMacro);
		TestUtil.clickOnByElement(cancelacquire);
		TestUtil.clickOnByElement(cancelacquire1);
	}

	public void acquireSOWTask() {
		TestUtil.clickOnByElement(captureSOWTask);
		TestUtil.clickOnByElement(clickOn3DotSow);
		try {
			driver.findElement(acquireBtn).isDisplayed();
			TestUtil.clickOnByElement(acquireSOWBtn);
			TestUtil.clickOnByElement(executeSOWBtn);
		} catch (Exception e) {
			driver.findElement(executeSOWBtn).isDisplayed();
			TestUtil.clickOnByElement(executeSOWBtn);
		}
	}

}
