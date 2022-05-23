package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ObjectRepository.GoogleHomePage;

public class GoogleSearchResults {
	
	WebDriver driver;
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
		 System.setProperty("webdriver.chrome.driver", "D:\\NewChrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void DynamicDropdownExample() throws InterruptedException, IOException
	{
		Properties pros = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\Desktop\\QATrainigs\\Datadriven.properties");
		pros.load(fis);
		
		
		driver.get("https://www.google.com/");
		
		
		//Here constructor Method will be called in GoogleHomePage, so that it knows that needs to run in which Driver
		GoogleHomePage gh = new GoogleHomePage(driver);
		System.out.println(pros.getProperty("Searchstring"));
		gh.Search().sendKeys(pros.getProperty("Searchstring"));
		
		
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
//		driver.quit();
	}

}
