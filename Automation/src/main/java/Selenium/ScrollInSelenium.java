package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollInSelenium {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void EnterDataIntofield() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		
		
		//We need to cast our driver with Jacascript executor and this code will go down vertically
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//We need to cast our driver with Jacascript executor and this code will go Up vertically
	    ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	    Thread.sleep(5000);
	    
	  //We need to cast our driver with Jacascript executor and this code go down till pixel Spefied
	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
	    Thread.sleep(5000);
	    //We need to cast our driver with Jacascript executor and this code go Up till pixel Spefied
	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1500)");
	    Thread.sleep(5000);
	    
	  //We need to cast our driver with Jacascript executor and this code go till to the Object Specified
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[@id='topcat5']")));
	    Thread.sleep(5000);
	    
	  //It mostly happens in Chrome so if you are mostly working with Firefox or IE then you will not be getting this exception.
	  //Chrome does not calculate the exact location of element
	  //Chrome always click in the middle of Element.
	  //Sometimes you will get this exception due to Sync issue also.

	  ////Find an element
	  //WebElement elementToClick = driver.findElement(By.xpath("Your xpath"));

	  //Scroll the browser to the element's Y position
	  //((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");

	  //Click the element
	  //elementToClick.click();

	  //Find an element
	  //WebElement elementToClick = driver.findElement(By.xpath("Your xpath"));

	  //Scroll the browser to the element's X position
	  //((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().x+")");

	  //Click the element
	  //elementToClick.click();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

}
