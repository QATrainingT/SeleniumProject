package Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddItemsToCart {
	
	WebDriver driver;
	String[] names= {"Brocolli","Cucumber"};
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
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	List<WebElement> vegetables = driver.findElements(By.xpath("//h4[@class='product-name']"));
	
	for (int i=0;i<vegetables.size();i++)
	{
		String name=vegetables.get(i).getText();
		if (name.contains("Cucumber"))
				{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				}
	}
	
	for (int i=0;i<vegetables.size();i++)
	{
		String name=vegetables.get(i).getText();
		
		//Another way add to the cart for the Vegetables in String Array
		List ItemsNeeded=Arrays.asList(names);
		if (ItemsNeeded.contains(name))
		{
		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		}
	}
	
	
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		//driver.quit();
	}

}
