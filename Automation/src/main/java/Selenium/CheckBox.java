package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckBox {
	
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
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
		
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
