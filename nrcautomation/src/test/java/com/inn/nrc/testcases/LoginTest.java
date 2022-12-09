package com.inn.nrc.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.inn.nrc.base.TestBase;
import com.inn.nrc.pages.HomePage;
import com.inn.nrc.pages.LoginPage;

public class LoginTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage ;
	//ExtentTest test;
//	ExtentSparkReporter spark ;
	

	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage =new LoginPage() ;
		homePage= new HomePage();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//its a global wait applicable to all WebElement which driver interact
		
	}

	@Test(priority=1)
	public void loginTest() {
		//System.out.println(prop.getProperty("username")+ prop.getProperty("password"));
		homePage=loginPage.loginNRC(prop.getProperty("username"), prop.getProperty("password"));
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
}
