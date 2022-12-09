package com.inn.nrc.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inn.nrc.base.TestBase;
import com.inn.nrc.pages.CaptureMacroRF;
import com.inn.nrc.pages.CaptureSow;
import com.inn.nrc.pages.HomePage;
import com.inn.nrc.pages.JobPage;
import com.inn.nrc.pages.JobTaskListing;
import com.inn.nrc.pages.LoginPage;
import com.inn.nrc.util.TestUtil;

public class JobTaskListingTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	JobPage jobPage;
	JobTaskListing jobTaskListing;
	TestUtil testUtil;
	CaptureMacroRF capturemacrorf;
	CaptureSow captureSow ;

	@BeforeMethod
	public void setUp() throws Exception {
		initilization();
		loginPage = new LoginPage();
			homePage = loginPage.loginNRC(prop.getProperty("username"), prop.getProperty("password"));
		homePage = new HomePage();
			homePage.navigateToJob();
		jobPage = new JobPage();
			jobPage.searchJobNo();
		jobTaskListing =new JobTaskListing();
		testUtil= new TestUtil();
		capturemacrorf =new CaptureMacroRF();
		captureSow = new CaptureSow();
	}	
	
	
	@Test
	public void acquireTaskTest() throws Exception {
		
		jobTaskListing.acquireTask();
		capturemacrorf.capturemacrorf(); 
		 
		
	}
	@Test
	public void excuteSOWTest() throws Exception{
		jobTaskListing.acquireSOWTask();
		captureSow.fillStructureStatusSection();
		
	}
	
}
