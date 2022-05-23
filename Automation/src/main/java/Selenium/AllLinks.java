package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllLinks {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void AllLinks()
	{
		driver.get("https://money.rediff.com/index.html");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		ArrayList<String> data = new ArrayList<String>();
		
		//Using Loop
		for(int i=0;i<=links.size();i++)
		{
			//data.add(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
		System.out.println("Data Size be"+data.size());
		
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

}
