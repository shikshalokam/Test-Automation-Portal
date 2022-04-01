package com.sikshalokam.report;

import com.aventstack.extentreports.ExtentTest;

public class SikshaLokamReport {

	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	public static ExtentTest getExtentTest() {
		return extentTest.get();
	}

	public static void setExtentTest(ExtentTest extentTest) {
		SikshaLokamReport.extentTest.set(extentTest);
	}

}
