package com.extentManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.basePackage.BaseClass;

public class ExtentManager {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void setExtent() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/"
				+ "MyReport_" + BaseClass.getCurrentTime() + ".html");

		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");
		
		/*
		 * htmlReporter.config().setDocumentTitle("Automation Test Report");
		 * htmlReporter.config().setReportName("My Store Test Automation Report");
		 * htmlReporter.config().setTheme(Theme.STANDARD);
		 */

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Host Name", "My Host");
		extent.setSystemInfo("Project Name", "My Store");
		extent.setSystemInfo("Tester", "Shafiul");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Browser", "Chrome");

	}

	public static void endReport() {
		extent.flush();
	}

}
