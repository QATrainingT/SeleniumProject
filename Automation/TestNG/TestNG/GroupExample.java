package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupExample {
	
	@Test(groups = {"Smoke"})
	public void GroupLogin()
	{
		System.out.println("Group WebLogin");
	}
	
	
	@Test(groups = {"Smoke"})
	public void GroupLogout()
	{
		System.out.println("Group WebLogout");
	}
	
	

}
