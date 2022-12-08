package com.inn.nrc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.inn.nrc.base.TestBase;

public class TestUtil extends TestBase{


	public static String takeScreenshotAtEndOfTestFromBase64() throws IOException
	{
		File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		File descFile=new File(currentDir+"//screenshots"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(scrFile, descFile);
		byte[] imageByte =IOUtils.toByteArray(new FileInputStream(descFile)); 
		return Base64.getEncoder().encodeToString(imageByte);
	}


}
