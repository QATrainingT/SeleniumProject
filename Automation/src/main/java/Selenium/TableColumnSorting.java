package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TableColumnSorting {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void EnterDataIntofield()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Steps:
		//1.Retrive all the values in name column
		//2.Store in ArrayList
		//3.Take a copy and Apply Sort Mechanism and should not change the order
		//4.Then compare with originial Array
		
	List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
	
	
	ArrayList<String> originalList=new ArrayList<String>();
	for(int i=0;i<firstColList.size();i++)
	{

	originalList.add(firstColList.get(i).getText());
	}
	
	ArrayList<String> copiedList =new ArrayList<String>();
	for(int i=0;i<originalList.size();i++)
	{

		copiedList.add(originalList.get(i));
	}

	//string
	Collections.sort(copiedList);
	
	//For veryfing the reverse order
	//Collections.reverse("");
	// Collections.reverse(copiedList);
	for(String s1:originalList )
	{
	System.out.println(s1);
	}
	System.out.println("*******************");

	for(String s2:copiedList )
	{
	System.out.println(s2);
	}
	Assert.assertTrue(originalList.equals(copiedList));
	}

	
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
