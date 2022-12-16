package com.inn.nrc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inn.nrc.base.TestBase;

public class TestUtil extends TestBase{


	public static String takeScreenshotAtEndOfTestFromBase64() throws IOException
	{
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File descFile=new File("screenshot/"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(scrFile, descFile);
		byte[] imageByte =IOUtils.toByteArray(new FileInputStream(descFile)); 
		return Base64.getEncoder().encodeToString(imageByte);
	}

	public static void waitTillElementVisible(By by) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element. "+by);
		}
	}
	
	public static void waitTillElementToBeClickable(By by) {
		try {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element. "+by);
		}
	}
	public static void waitThreadSleep(By by) {
		try {
			Thread.sleep(5000);		
			}
		catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element. "+by);
		}
	}

	public void clickable(By by)
	{
		driver.findElement(by).click();

	}
}
