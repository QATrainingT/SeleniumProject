package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Synchronisation {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Implicit
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		//Explicit
		WebDriverWait wait =new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		
		//Fluent
		//Fluent wait find the element repeatedly regular intervals of time until  the timeout  or
		//till the objects gets found, it checks regular interval based on polling 2 sec we mentioned
	}
	
	@Test
	public void EnterDataIntofield()
	{
		driver.get("https://www.flipkart.com/");
		
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
