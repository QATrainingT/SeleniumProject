package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DynamicDropDown {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void DynamicDropdownExample() throws InterruptedException
	{
		driver.get("https://www.spicejet.com/default.aspx");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@text='Goa (GOI)']")).click();
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		
		//Will not identify since same 2 states exits
		//driver.findElement(By.xpath("//a[@text='Gwalior (GWL)']")).click();
		// Using Index
		//driver.findElement(By.xpath("(//a[@text='Gwalior (GWL)'])[2]")).click();
		//Parent Child relation ship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Gwalior (GWL)']")).click();
		                            
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
