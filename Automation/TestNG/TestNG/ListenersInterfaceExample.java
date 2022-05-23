package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenersInterfaceExample implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("Successfully Stared");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I Successfully Executed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I Failed" +result.getTestName());
		System.out.println(result.getStatus());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Percentage");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("OnStart");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("OnFinish");
	}
	
	
}
