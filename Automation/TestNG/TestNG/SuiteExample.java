package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	@Test
	public void SuiteLogin()
	{
		System.out.println("Suite WebLogin");
	}
	
	@BeforeSuite
	public void SuiteMobileLogin()
	{
		System.out.println("I am number One");
	}
	
	@AfterSuite
	public void SuiteApiLogin()
	{
		System.out.println("I am number Last");
	}
	
	

}
