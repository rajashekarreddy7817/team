package com.inn.nrc.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.inn.nrc.base.TestBase;

public class ListnersNG extends TestBase implements ITestListener {

	ExtentTest test;
	ExtentReports extent = ExtentReportNG.getReportObject();

	public void onFinish(ITestContext Result) {
		extent.flush();
	}

	public void onStart(ITestContext Result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult Result) {
		test = extent.createTest(Result.getMethod().getMethodName());
		System.out.println("*********Test Case Started : Method Name = "+Result.getName() + "********* ");

	}

	// When Test case get failed, this method is called. 
	public void onTestFailure(ITestResult Result) {
		test.log(Status.FAIL, "The name of the testcase failed is :" + Result.getName());
		System.out.println("*********Test Case Failed: Method Name = "+Result.getName() + "********* ");

		try {
			test.fail(Result.getThrowable(), MediaEntityBuilder
					.createScreenCaptureFromBase64String(TestUtil.takeScreenshotAtEndOfTestFromBase64()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
		test.skip(Result.getThrowable());
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult Result) {
		test.log(Status.PASS, "The name of the testcase passed is :" + Result.getName());
		test.pass(Result.getMethod().getMethodName());
		System.out.println("The name of the testcase passed is :" + Result.getName());

	}
}