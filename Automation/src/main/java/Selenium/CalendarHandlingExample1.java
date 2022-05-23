package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalendarHandlingExample1 {

	WebDriver driver;

	String ExpectedDate = "June 2020";

	@BeforeClass
	public void BrowserInitialization() {
		// Setting webdriver Chrome.driver property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void LaunchApplication() throws InterruptedException {
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);

		WebElement Month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		System.out.println(Month);
		while (true) {
			
			if (Month.getText().equals(ExpectedDate)) {
				break;
			} else {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@title='Next']")).click();
				System.out.println(Month);
			}

		}

	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
