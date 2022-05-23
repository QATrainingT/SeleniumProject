package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GoogleHomePage {
	
	WebDriver driver;
	
	public GoogleHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By GoogleSearch=By.xpath("//input[@name='q']");
	
    By Month=By.xpath("//*[@id='month']");
	
	By Day=By.xpath("//*[@id='day']");
	

	public void Selectmonth(String text) {

		WebElement month = driver.findElement(Month);
		Select select = new Select(month);
		select.selectByVisibleText(text);
	}
	
	public void SelectDay(String text) {

		WebElement day = driver.findElement(Day);
		Select select = new Select(day);
		select.selectByVisibleText(text);
	}
	
	public WebElement Search ()
	{
		return driver.findElement(GoogleSearch);
	}
	
	

}
