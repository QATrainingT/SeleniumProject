package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLoginPage {
	
	WebDriver driver;
	
	public FaceBookLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
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
	
	
	public void Click(String text) {

		driver.findElement(By.xpath("//*[text()='"+text+"']")).click();
	}

}
