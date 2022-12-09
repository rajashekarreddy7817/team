package com.inn.nrc.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.inn.nrc.base.TestBase;

public class JobTaskListing extends TestBase{
	
	@FindBy(xpath ="//mat-icon[contains(text(),' more_vert')][@xpath='1']")
	WebElement clickon3dots;
	@FindBy(xpath = "//span[contains(text(),'Acquire')]")
	WebElement acquireBtn;
	
	
	
	public JobTaskListing() {
	PageFactory.initElements(driver, this);
	}
	
//	WebElement  element=driver.findElement(By.xpath"//span[contains(text(),'Acquire')]");  

	
  public void acquireTask() throws Exception {
	 Actions action= new Actions(driver);
	 action.moveToElement(acquireBtn).click(acquireBtn);
	  Thread.sleep(4000);
	  clickon3dots.click();
	  Thread.sleep(2000);
	  acquireBtn.click();
	  Thread.sleep(2000);
	  clickon3dots.click();
	  
	  
	  
  }


	
	
}
