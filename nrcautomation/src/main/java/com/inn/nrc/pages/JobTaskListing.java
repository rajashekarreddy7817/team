package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobTaskListing extends TestBase {

	By clickOn3DotsMacro = By.xpath("//div[@row-index='0']/descendant::mat-icon[@aria-label='mat icon']");
	By acquireBtn = By.xpath("//span[text()='Acquire']");
	By executeFromActionList=By.xpath("(//div[@class='icon icon-hover'])[2]");
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

	public void acquireTask() throws Exception {
		// waitTillElementVisible(clickon3dots)
		TestUtil.waitTillElementVisible(clickOn3DotsMacro);
		driver.findElement(clickOn3DotsMacro).click();
		try {
			driver.findElement(acquireBtn).isDisplayed();
			driver.findElement(acquireBtn).click();
			driver.findElement(executeFromActionList).click();
		} catch(Exception e) {
			driver.findElement(executebtn).isDisplayed();
			driver.findElement(executebtn).click();
			
		}

	}

	
	public void cancelAcquire() throws Exception {
		driver.findElement(clickOn3DotsMacro).click();
		TestUtil.waitTillElementToBeClickable(cancelacquire);
		driver.findElement(cancelacquire).click();
		Thread.sleep(3000);
		driver.findElement(cancelacquire1).click();

	}

	public void acquireSOWTask() {
		TestUtil.waitThreadSleep(clickOn3DotSow);
		TestUtil.waitTillElementVisible(clickOn3DotSow);
		driver.findElement(clickOn3DotSow).click();
		TestUtil.waitTillElementVisible(acquireSOWBtn);
		driver.findElement(acquireSOWBtn).click();
		TestUtil.waitTillElementVisible(executeSOWBtn);
		driver.findElement(executeSOWBtn).click();

	}

}
