package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	
	@Test(dataProvider = "GetData")
	public void SuiteLogin(String UserName, String Password)
	{
		System.out.println(UserName);
		System.out.println(Password);
	}
	
	
	@DataProvider
	public Object[][] GetData()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0]="FirstUserName";
		data[0][1]="FirstPassword";
		
		data[1][0]="SecondUserName";
		data[1][1]="SecondPassword";
		
		data[2][0]="ThirdUserName";
		data[2][1]="ThirdPassword";
		
		return data;
	}
	

}
