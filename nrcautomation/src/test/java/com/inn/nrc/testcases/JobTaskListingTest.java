package com.inn.nrc.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.pages.CaptureMacroRF;
import com.inn.nrc.pages.CaptureSow;
import com.inn.nrc.pages.HomePage;
import com.inn.nrc.pages.JobPage;
import com.inn.nrc.pages.JobTaskListing;
import com.inn.nrc.pages.LoginPage;
import com.inn.nrc.util.TestUtil;

@Listeners(com.inn.nrc.util.ListnersNG.class)
public class JobTaskListingTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	JobPage jobPage;
	JobTaskListing jobTaskListing;
	TestUtil testUtil;
	CaptureMacroRF capturemacrorf;
	CaptureSow captureSow;

	@BeforeMethod
	public void setUp() throws Exception {
		initilization();
		loginPage = new LoginPage();
		homePage = loginPage.loginNRC(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
		homePage.navigateToJob();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		jobPage = new JobPage();
		jobPage.searchJobNo();
		jobTaskListing = new JobTaskListing();
		testUtil = new TestUtil();
		capturemacrorf = new CaptureMacroRF();
		captureSow = new CaptureSow();
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test
	public void acquireTaskTest() throws Exception {

		jobTaskListing.acquireTask();
		capturemacrorf.capturemacrorf();
		jobTaskListing.cancelAcquire();

	}

	@Test
	public void excuteSOWTest() throws Exception {
		jobTaskListing.acquireSOWTask();
		captureSow.fillStructureStatusSection();
	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
