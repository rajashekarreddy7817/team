package com.inn.nrc.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.pages.HomePage;
import com.inn.nrc.pages.JobPage;
import com.inn.nrc.pages.LoginPage;
import com.inn.nrc.util.TestUtil;


@Listeners(com.inn.nrc.util.ListnersNG.class)
public class JobPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	JobPage jobPage;
	TestUtil testUtil ;

	@BeforeMethod
	public void setUp() throws Exception {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.loginNRC(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		homePage.navigateToJob();
		jobPage = new JobPage();
		jobPage.searchJobNo();
		testUtil = new TestUtil();
	}

	@Test
	public void searchJobNoTest() throws Exception {
		Thread.sleep(2000);
		jobPage.searchJobNo();		
		}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
