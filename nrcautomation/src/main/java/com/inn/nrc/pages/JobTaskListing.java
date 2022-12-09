package com.inn.nrc.pages;



import org.openqa.selenium.By;


import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobTaskListing extends TestBase{
	
	By clickon3dots= By.xpath ("//div[@row-index='0']/descendant::mat-icon[@aria-label='mat icon']");
	By acquireBtn= By.xpath("//span[contains(text(),'Acquire')]");
	By executebtn=By.xpath("//mat-icon[@class='mat-icon notranslate icon-hover icomoon Like-Outline mat-icon-no-color ng-star-inserted']");
	By clickOn3DotSow = By.xpath("(//mat-icon[@class='mat-icon notranslate icon-hover material-icons mat-icon-no-color ng-star-inserted'])[2]");
	////mat-panel-title[n-ormalize-space()='Basic Details']
	By acquireSOWBtn= By.xpath("//span[contains(text(),'Acquire')]");
	By executeSOWBtn= By.xpath("//mat-icon[@class='mat-icon notranslate icon-hover icomoon Like-Outline mat-icon-no-color ng-star-inserted']");
	By executeSOW4thBtn=By.xpath("//button[@class='mat-focus-indicator mat-menu-item ng-star-inserted'])[4]");
	
  public void acquireTask() throws Exception {
	 TestUtil.waitTillElementVisible(clickon3dots);
	  driver.findElement(clickon3dots).click();
	TestUtil.waitTillElementVisible(acquireBtn);
		driver.findElement(acquireBtn).click();
		TestUtil.waitTillElementVisible(executebtn);
		driver.findElement(executebtn).click();
	 
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public void acquireSOWTask()
  {
	  TestUtil.waitTillElementVisible(clickOn3DotSow);
	  
	  driver.findElement(clickOn3DotSow).click();
	  TestUtil.waitTillElementVisible(acquireSOWBtn);
	  driver.findElement(acquireSOWBtn).click();
	  TestUtil.waitTillElementVisible(executeSOWBtn);
	  driver.findElement(executeSOWBtn).click();

	  

	  
  }
  

	
	
}
