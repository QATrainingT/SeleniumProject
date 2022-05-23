package Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddCookieNamed {
	
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
		
		Cookie cookie = new Cookie("CustomCookie", "123456");
		driver.manage().addCookie(cookie);
		
		//For example, when automating Online Shopping Application, you many need to automate test scenarios like place order, View Cart, Payment Information, order confirmation, etc.
		//If cookies are not stored, you will need to perform login action every time before you execute above listed test scenarios. This will increase your coding effort and execution time.
		//The solution is to store cookies in a File. Later, retrieve the values of cookie from this file and add to it your current browser session. As a result, you can skip the login steps in every Test Case because your driver session has this information in it.
		
		
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
