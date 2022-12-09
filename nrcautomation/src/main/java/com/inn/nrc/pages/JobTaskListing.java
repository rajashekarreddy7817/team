package com.inn.nrc.pages;



import org.openqa.selenium.By;


import com.inn.nrc.base.TestBase;
import com.inn.nrc.util.TestUtil;

public class JobTaskListing extends TestBase{
	
	By clickon3dots= By.xpath ("//mat-icon[contains(text(),' more_vert')][@xpath='1']");
	By acquireBtn= By.xpath("//span[contains(text(),'Acquire')]");
	
	
	
	
	
//	WebElement  element=driver.findElement(By.xpath"//span[contains(text(),'Acquire')]");  

//	
//	public void waitTillElementVisible(By by) {
//		try {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//		}
//		catch (Exception e) {
//			System.out.println("Exception occured while waiting for the Element. "+by);
//		}
//	}
//	
	
	
  public void acquireTask() throws Exception {
	 //waitTillElementVisible(clickon3dots)
	TestUtil.waitTillElementVisible(clickon3dots);
	  driver.findElement(clickon3dots).click();
	TestUtil.waitTillElementVisible(acquireBtn);
		driver.findElement(acquireBtn).click();
	  
	  
  }


	
	
}
