package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedExample {
	
	@Parameters({"UserName","Password"})
	@Test
	public void SuiteLogin(String UserName, String Password)
	{
		System.out.println(UserName);
		System.out.println(Password);
	}
	
	
	

}
