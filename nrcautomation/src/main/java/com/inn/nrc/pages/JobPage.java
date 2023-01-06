package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobPage extends TestBase {

	By globalSearchBox = By.xpath("//input[@id='global-search-input']");
//	By selectjob = By.xpath("//div[contains(text(),'istMOD0ab1306')]");
	By selectjob = By.xpath("//div[contains(text(),'"+prop.getProperty("jobnumber")+"')]");
	By clickontasks = By.xpath("//span[text()='Tasks']");

	public void searchJobNo() {
		TestUtil.waitTillElementVisible(globalSearchBox);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		TestUtil.sendKeysOnElement(globalSearchBox, prop.getProperty("jobnumber"));
		TestUtil.waitThreadSleep(globalSearchBox);
		driver.findElement(globalSearchBox).sendKeys(Keys.ENTER);
		TestUtil.clickOnByElement(selectjob);
		TestUtil.clickOnByElement(clickontasks);

	}

}
