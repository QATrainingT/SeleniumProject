package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	@Test
	public void WebLogin()
	{
		System.out.println("Personal WebLogin");
		Assert.assertEquals("Anil", "Gottipati");
	}
	
	@Test
	public void MobileLogin()
	{
		System.out.println("Personal MobileLogin");
	}
	
	@Test(groups = {"Smoke"})
	public void ApiLogin()
	{
		System.out.println("Personal ApiLogin");
	}

}
