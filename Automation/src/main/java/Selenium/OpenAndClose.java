package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenAndClose {
	
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
		driver.get("https://www.hdfcbank.com/sme");
		
		 String DropDown = driver.findElement(By.xpath("//div[@class='drp2']/div")).getAttribute("class");
		 System.out.println(DropDown);
		 
		 //Based on this condition we can check Open Or Close validations
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

}
