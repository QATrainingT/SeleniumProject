package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllRadioButtons {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void Allradios()
	{
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> RadioButtonList = driver.findElements(By.xpath("//input[@name='group1']"));
		
		for(WebElement e:RadioButtonList)
		{
			System.out.println(e.getAttribute("value"));
			if(e.getAttribute("value").equals("Cheese"))
			{
				e.click();
			}
		}
	}
	
	@AfterClass
	public void CloseBrowser()
	{
	 driver.quit();
	}

}
