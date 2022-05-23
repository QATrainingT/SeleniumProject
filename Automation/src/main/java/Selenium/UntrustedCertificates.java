package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedCertificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELINIUM_FEB24\\chromedriver.exe");
		
DesiredCapabilities cap=DesiredCapabilities.chrome();


//profile.setAcceptUntrustedCertificates(true);
cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
	}

}


