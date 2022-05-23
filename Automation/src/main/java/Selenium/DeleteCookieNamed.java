package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteCookieNamed {
	
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
		driver.get("https://www.flipkart.com/");
		
		//Will Delete based on Cookie Name
		driver.manage().deleteCookieNamed("gpv_pn");
		
		//Will Delete all Cookies, if need to clear all saved data in the application
		driver.manage().deleteAllCookies();
		
		
		
		Set<Cookie> CookieList = driver.manage().getCookies();
		for(Cookie GetCookies:CookieList)
		{
			System.out.println(GetCookies);
		}
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
