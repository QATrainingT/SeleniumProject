package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IFramesDragAndDropable {

	@Test
	public void IFrameHandling() throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		WebElement source=driver.findElement(By.xpath("//*[@id='draggable']/p"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
	
	}

}
