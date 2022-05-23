package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SSLCertificates {
	
	WebDriver driver;
	
	@BeforeClass
	public void BrowserInitialization()
	{
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
        
        //Desired Capabilities will customize the browser, General Chrome Profile and merging with Local Chrome Driver	
       // SSL Secure Sockets Layer certificate
         DesiredCapabilities Cap = DesiredCapabilities.chrome();
         Cap.acceptInsecureCerts();
         ChromeOptions co= new ChromeOptions();
         co.merge(Cap);
         WebDriver driver = new ChromeDriver(co);
	}
	
	@Test
	public void EnterDataIntofield() throws InterruptedException
	{
		driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select select = new Select(day);
		select.selectByIndex(1);
		select.selectByValue("22");
		select.selectByVisibleText("29");
		Thread.sleep(5000);
		
		WebElement FirstOption = select.getFirstSelectedOption();
		System.out.println(FirstOption.getText());
		//Will Get Display only the Selected Text Property with Tag
		List<WebElement> firstoption1 = select.getAllSelectedOptions();
		System.out.println("Printing the getAllSelectedOptions"+ firstoption1);
		//Will Get Display All the List Options Text Property with Tag
		List<WebElement> firstoption2 = select.getOptions();
		System.out.println("Printing the getOptions"+ firstoption2);
		int TotalCount = select.getOptions().size();
		for(WebElement e:firstoption2)
		{
			if(e.getText().equals("20"))
			{
				System.out.println("Loop Entered");
				System.out.println(e.getText());
				select.selectByVisibleText(e.getText());
			}
		}
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}

}
