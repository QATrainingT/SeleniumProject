package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
public class CalenderHandlingExample2 
{  
	public static void main(String[] args) throws Exception {  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='calOnward hasDatepicker']")).click();
		
		List<WebElement> noofdays=driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		System.out.println(noofdays.size());
		for (int i=0;i<noofdays.size();i++) {
			System.out.println("LootEntered");
			
			String Date=driver.findElements(By.xpath("//*[@class='ui-state-default']")).get(i).getText();
			System.out.println(Date);
			if (Date.equalsIgnoreCase("28")) {
				System.out.println("Lootcccccntered");
				driver.findElements(By.xpath("//*[@class='ui-state-default']")).get(i).click();	
				break;
				}
			
		}
	}
}