package com.inn.nrc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inn.nrc.base.TestBase;

public class JobPage extends TestBase{

	@FindBy(id="global-search-input")
	WebElement globalSearchBox;
	@FindBy(xpath = "//div[contains(text(),' istMOD0ab1306 ')]")
	WebElement selectjob;
	@FindBy(xpath = "//span[text()='Tasks']")
	WebElement clickontasks;
	
	
	public JobPage() {
	PageFactory.initElements(driver, this);
	}
	
	
	public void searchJobNo() throws Exception
	{
		globalSearchBox.sendKeys("istMOD0ab1306");
		Thread.sleep(5000);
		globalSearchBox.sendKeys(Keys.RETURN);
		selectjob.click();
		clickontasks.click();
		
	}
	
	
	
	
	
}
