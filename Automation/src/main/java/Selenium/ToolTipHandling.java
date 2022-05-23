package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTipHandling {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void ToolTip()
	{
		driver.get("http://shopping.rediff.com/");
		String ToolTip = driver.findElement(By.xpath("//*[@id=\"topcart\"]/a")).getAttribute("title");
		System.out.println(ToolTip);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

}
