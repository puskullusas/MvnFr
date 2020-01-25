package com.hrms.testbase;

//import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
//import com.hrms.utils.CommonMethods;

public class Listener extends BaseClass implements ITestListener {
//getting name of test
	public void onTestStart(ITestResult result) {
		System.out.println("Test started " + result.getName());
		test = report.createTest(result.getName());
	}

//takin pic if success
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed " + result.getName());
//		String imagePath = CommonMethods.takeScreenshoti("passed/" + result.getName());// creating folder passed/
//		try {
//			test.addScreenCaptureFromPath(imagePath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

//taking pic if fails
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed " + result.getName());
		test.fail("Test failed " + result.getName());
//		String imagePath = CommonMethods.takeScreenshoti("failed/" + result.getName());
//		try {
//			test.addScreenCaptureFromPath(imagePath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
