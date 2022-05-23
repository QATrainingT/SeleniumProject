package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandletableGrid {
	
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
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22659/rsa-vs-aus-2nd-t20i-australia-tour-of-south-africa-2020");
		
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
