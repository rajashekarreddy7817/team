package com.inn.nrc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobPage extends TestBase{

	By globalSearchBox=By.xpath("//input[@id='global-search-input']");
	By selectjob=By.xpath("//div[contains(text(),' 243407 ')]");
	By clickontasks=By.xpath("//span[text()='Tasks']");
	
	

	
	public void searchJobNo() throws Exception
	{
		TestUtil.waitTillElementVisible(globalSearchBox);
		driver.findElement(globalSearchBox).sendKeys("istMOD0ab1306");
		driver.findElement(globalSearchBox).sendKeys(Keys.RETURN);
		driver.findElement(selectjob).click();
		driver.findElement(clickontasks).click();
		
	}
	
	
	
	
	
}
