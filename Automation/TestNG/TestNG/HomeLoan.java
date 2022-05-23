package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {
	
	
	
	@AfterTest
	public void Stop()
	{
		System.out.println("I will execute Last");
	}
	
	@Test
	public void BuildingName()
	{
		System.out.println("Name of Building DLF");
	}
	
	@BeforeTest
	public void Start()
	{
		System.out.println("I will execute First");
	}

}
