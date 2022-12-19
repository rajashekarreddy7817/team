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

import com.github.dockerjava.zerodep.shaded.org.apache.hc.core5.util.Timeout;
import com.inn.nrc.base.TestBase;

public class TestUtil extends TestBase {

	public static String takeScreenshotAtEndOfTestFromBase64() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File descFile = new File("screenshot/" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(scrFile, descFile);
		byte[] imageByte = IOUtils.toByteArray(new FileInputStream(descFile));
		return Base64.getEncoder().encodeToString(imageByte);
	}

	public static void waitTillElementVisible(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element. " + by);
		}
	}

	public static void waitTillElementToBeClickable(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element= " + by);
		}
	}

	public static void waitThreadSleep(By by) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element= " + by);
		}
	}

	public static void sendKeysOnElement(By by, String data) {
		driver.findElement(by).sendKeys(data);
	}

	public static void clearElement(By by) {
		driver.findElement(by).clear();
	}

	public static void clickOnByElement(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			driver.findElement(by).click();
		} catch (Exception e) {
			System.out.println("Exception occured when we click on the Element= " + by);
		}
	}

	public static void clickOnWebElement(WebElement element, long waitTime) {

		try {
			WebDriverWait wait = new WebDriverWait(driver,5000);
			WebElement elements = null;
			elements = wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println("Exception occured while waiting for the Element. " + element);
		}
	}
}
