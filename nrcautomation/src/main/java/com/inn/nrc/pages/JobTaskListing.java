package com.inn.nrc.pages;



import org.openqa.selenium.By;


import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobTaskListing extends TestBase{
	
	By clickon3dots= By.xpath ("//div[@row-index='0']/descendant::mat-icon[@aria-label='mat icon']");
	By acquireBtn= By.xpath("//span[contains(text(),'Acquire')]");
	By executebtn=By.xpath("//mat-icon[@class='mat-icon notranslate icon-hover icomoon Like-Outline mat-icon-no-color ng-star-inserted']");
	
	////mat-panel-title[normalize-space()='Basic Details']
	
	
  public void acquireTask() throws Exception {
	 TestUtil.waitTillElementVisible(clickon3dots);
	  driver.findElement(clickon3dots).click();
	TestUtil.waitTillElementVisible(acquireBtn);
		driver.findElement(acquireBtn).click();
		TestUtil.waitTillElementVisible(executebtn);
		driver.findElement(executebtn).click();
	 
	  
  }


	
	
}
