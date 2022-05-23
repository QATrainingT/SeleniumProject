package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MultipleWindows {

	WebDriver driver;

	@BeforeClass
	public void BrowserInitialization() {
		// Setting webdriver Chrome.driver property
		 System.setProperty("webdriver.chrome.driver", "D:\\NewChrome\\chromedriver.exe");
			driver = new ChromeDriver();
	}

	@Test
	public void EnterDataIntofield() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//li[@class='youtube']")).click();

		// We will get all Windows ID
		Set<String> windowsId = driver.getWindowHandles();
		System.out.println(windowsId);
		Iterator<String> itr = windowsId.iterator();
		String ParentID = itr.next();
		String ChildID = itr.next();

		// Switch To Child
		driver.switchTo().window(ChildID);
		driver.close();
		// Switch To Parent
		driver.switchTo().window(ParentID);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[@class='facebook']")).click();
		Thread.sleep(5000);

		// we can use by Using Iterator

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		while (itr.hasNext()) {
			String child_window = itr.next();
			System.out.println(child_window);
			// Here we will compare if parent window is not equal to child window then we
			// �����������will close
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}

}
