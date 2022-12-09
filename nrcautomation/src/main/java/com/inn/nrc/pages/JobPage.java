package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobPage extends TestBase{

	By globalSearchBox=By.xpath("global-search-input");
	By selectjob=By.xpath("//div[contains(text(),' istMOD0ab1306 ')]");
	By clickontasks=By.xpath("//span[text()='Tasks']");
	
	

	
	public void searchJobNo() throws Exception
	{
		TestUtil.waitTillElementVisible(globalSearchBox);
		driver.findElement(globalSearchBox).sendKeys(prop.getProperty("jobnumber"));
		driver.findElement(globalSearchBox).sendKeys(Keys.RETURN);
		driver.findElement(selectjob).click();
		driver.findElement(clickontasks).click();
		
	}
	
	
	
	
	
}
