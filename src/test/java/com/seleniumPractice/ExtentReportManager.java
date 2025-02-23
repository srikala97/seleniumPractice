package com.seleniumPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void start(ITestContext context) 
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir") +"/testdata/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer Name", "Localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("Browser Name", "Chrome");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		
		test=extent.createTest(result.getName());
		test.log(Status.PASS, "Test is passed" +result.getName());
		
		
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case Failed:" +result.getName());
		test.log(Status.FAIL, "Test case Failed cause is:" +result.getThrowable());
		
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case Skipped is: " +result.getName());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
