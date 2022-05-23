package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ObjectRepository.GoogleHomePage;
import ObjectRepository.GoogleHomePageFactory;

public class GoogleSearchResultsPageFactory {
	
	WebDriver driver;
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
		 System.setProperty("webdriver.chrome.driver", "D:\\NewChrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void DynamicDropdownExample() throws InterruptedException
	{
		
		driver.get("https://www.google.com/");
		
		//Here constructor Method will be called in GoogleHomePage, so that it knows that needs to run in which Driver
		GoogleHomePageFactory gh = new GoogleHomePageFactory(driver);
		gh.Search().sendKeys("AnilGottipati");
		
		
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
