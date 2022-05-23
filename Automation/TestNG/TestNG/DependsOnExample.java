package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnExample {
	
	@Test
	public void DependsOnCloudLogin()
	{
		System.out.println("depends on Mobile Login");
	}
	
	@Test(dependsOnMethods = {"DependsOnCloudLogin"})
	public void DependsOnMobileLogin()
	{
		System.out.println("Mobile Login");
	}
	
	@Test
	public void DependsOnApiLogin()
	{
		System.out.println("API Login");
	}
	
	@Test(enabled = false)
	public void EnableApiLogin()
	{
		System.out.println("TO Enable");
	}
	
	

}
