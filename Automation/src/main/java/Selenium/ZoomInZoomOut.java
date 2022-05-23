package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZoomInZoomOut {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization() throws InterruptedException
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void EnterDataIntofield() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		 //We need to cast our driver with Jacascript executor and this code go down till pixel Spefied
	    ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='40%'");
	    Thread.sleep(5000);
	    ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
	    Thread.sleep(5000);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

}
