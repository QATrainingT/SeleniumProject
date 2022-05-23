package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptHandling {
	
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
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		JavascriptExecutor WebDriver = (JavascriptExecutor)driver;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();		
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
        String TitleName = js.executeScript("return document.title;").toString();			
        System.out.println("Title of the page = "+TitleName);		
		System.out.println(DomainName);
		System.out.println(url);
		System.out.println(TitleName);
		
		
		WebDriver.executeScript("document.getElementById('login1').setAttribute('value','Selenium@gmail.com')");
		
		WebDriver.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@name='proceed']")));
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	
			
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
