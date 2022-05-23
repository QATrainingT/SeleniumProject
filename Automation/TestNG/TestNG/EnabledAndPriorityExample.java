package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnabledAndPriorityExample {
	
	@Test(priority = 2)
	public void Priority3()
	{
		System.out.println("Priority 3");
	}
	
	@Test(priority = 3)
	public void Priority2()
	{
		System.out.println("Priority 2");
	}
	
	@Test(enabled = false)
	public void EnableApiLogin()
	{
		System.out.println("TO Enable");
	}
	
	@Test(priority = 1)
	public void EndOnApiLogin()
	{
		System.out.println("Pririty 1");
	}
	

}
