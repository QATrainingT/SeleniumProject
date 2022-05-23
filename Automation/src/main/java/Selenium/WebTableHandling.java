package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTableHandling {

	WebDriver driver;

	@BeforeClass
	public void BrowserInitialization() {
		// Setting webdriver Chrome.driver property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void WebTable() {
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		int RowsNo = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
		System.out.println("No Of Rows are" + RowsNo);

		// Get the first Column
		int ColumnNo = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
		System.out.println("No Of Rows are" + ColumnNo);

		// If we want to Get the IFCI LTD Price even the Row got changed, then we can
		// use below code
		String CompanyName = driver
				.findElement(By.xpath("//a[contains(text(),'IFCI Ltd.')]/parent::*/following-sibling::td[3]"))
				.getText();
		System.out.println(CompanyName);

	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
