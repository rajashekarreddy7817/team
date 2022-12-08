package com.inn.nrc.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	//public static ExtentTest test;
	

	public TestBase()   {
		
		try {
			prop= new Properties();
			FileInputStream fis = new FileInputStream("C:\\software\\team_project_att\\nrcautomation\\com.inn.nrc.config\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}	

	}

	public static void initilization()
	{
		
			String browser=prop.getProperty("browser");
			
			if (browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
			}
			else
				if(browser.equalsIgnoreCase("edge"))
				{
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
				}

		//		driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//its a global wait applicable to all WebElement which driver interact
			driver.get(prop.getProperty("url"));
	
	}


}
