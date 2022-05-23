package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IframeHandling {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void IFrameHandling()
	{
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		//We can use the below one if we are having only single Frame
		// driver.switchTo().frame(0);
		//We can use the below one by Using the frame Name
		// driver.switchTo().frame(nameOrId);
		
		//We can use the below one by Using the Element Name
	    driver.switchTo().frame(driver.findElement(By.xpath("//button[@aria-label='Play']")));
	    
	    //If we have Frame within the Frame
	   // driver.switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		
		driver.switchTo().defaultContent();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
