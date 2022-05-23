package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseOver {

	WebDriver driver;

	@BeforeClass
	public void BrowserInitialization() {
		// Setting webdriver Chrome.driver property
		//Setting webdriver Chrome.driver property
        System.setProperty("webdriver.chrome.driver", "D:\\NewChrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void MouseOverToElement() throws InterruptedException {
		driver.get("http://shopping.rediff.com/");
		WebElement Watches = driver.findElement(By.xpath("//span[@id='topcat5']"));

		Actions action = new Actions(driver);
		action.moveToElement(Watches).build().perform();
		Thread.sleep(5000);
		
		
		
	}

	@Test
	public void clickOnElement() throws InterruptedException {
		System.out.println("Entered in Click on Element");
		driver.findElement(By.linkText("Watches for Men")).click();
		Thread.sleep(5000);
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
