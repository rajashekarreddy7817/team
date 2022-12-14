package com.inn.nrc.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.pages.HomePage;
import com.inn.nrc.pages.LoginPage;

@Listeners(com.inn.nrc.util.ListnersNG.class)
public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	

	@BeforeMethod
	public void setUp() 
	{
		initilization();
		loginPage =new LoginPage() ;
		homePage=loginPage.loginNRC(prop.getProperty("username"), prop.getProperty("password"));
		homePage= new HomePage();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//its a global wait applicable to all WebElement which driver interact
		
	}

	@Test
	public void navigateToJobTest() throws Exception 
	{
		homePage.navigateToJob();
		System.out.println("############# User Navigated To Job Page #############");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
