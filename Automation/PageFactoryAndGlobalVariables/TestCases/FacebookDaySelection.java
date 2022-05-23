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

import ObjectRepository.FaceBookLoginPage;
import ObjectRepository.GoogleHomePage;

public class FacebookDaySelection {
	
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
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Folder3\\Overall Backup\\ANILFEB21ALLConcepts\\Automation\\Datadriven.properties");
	
		pros.load(fis);
		driver.get(pros.getProperty("FacebookURL"));
		
		
		//Here constructor Method will be called in GoogleHomePage, so that it knows that needs to run in which Driver
		FaceBookLoginPage fl = new FaceBookLoginPage(driver);
		GoogleHomePage f2 = new GoogleHomePage(driver);
		f2.Selectmonth(pros.getProperty("Month"));
		Thread.sleep(2000);
		fl.Click(pros.getProperty("AlreadyHaveAccount"));
		Thread.sleep(8000);
		
			
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
