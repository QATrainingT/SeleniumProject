package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Driver will get the capability of Action methods
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[2]"))).build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("amazon").build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();
			

	}

}
