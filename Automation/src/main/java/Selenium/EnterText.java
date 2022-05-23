package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnterText {
	
	WebDriver driver;
	
	@BeforeTest
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "D:\\NewChrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void LaunchDemoqa() throws InterruptedException
	{
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ANIL");
//		Thread.sleep(30000);
//		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
//		Thread.sleep(30000);
		
		Thread.sleep(10000);
		
	}
	
	@Test
	public void HomePageSearch() throws InterruptedException
	{
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ANIL");
//		Thread.sleep(30000);
//		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
//		Thread.sleep(30000);
		
		Thread.sleep(2000);
		
	}
	
	
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.quit();
	}

}
