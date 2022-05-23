package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test
	public void WebLogin()
	{
		System.out.println("CarLoan WebLogin");
	}
	
	@Test
	public void MobileLogin()
	{
		System.out.println("CarLoan MobileLogin");
	}
	
	
	
	@Test
	public void ApiLogin()
	{
		System.out.println("CarLoan ApiLogin");
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	

}
