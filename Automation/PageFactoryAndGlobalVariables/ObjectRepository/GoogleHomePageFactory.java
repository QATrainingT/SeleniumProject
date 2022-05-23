package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageFactory {
	
	WebDriver driver;
	
	public GoogleHomePageFactory(WebDriver driver)
	{
		this.driver=driver;
		//driver is Test case argument and we are initializing to local argument
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement GoogleSearch;
	
	public WebElement Search ()
	{
		return GoogleSearch;
	}
	
	

}
