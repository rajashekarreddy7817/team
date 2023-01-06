package com.inn.nrc.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.inn.nrc.base.TestBase;

public class ExtentReportNG extends TestBase{

	public static ExtentReports getReportObject() {
		ExtentSparkReporter spark = new ExtentSparkReporter(".//NRCExtentreport.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Extent Report of NRC");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;
	}
}
