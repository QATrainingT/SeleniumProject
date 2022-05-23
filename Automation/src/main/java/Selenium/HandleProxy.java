package Selenium;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SELINIUM_FEB24\\chromedriver.exe");
		
//		Some application also has SSL certificate enabled or you can say as the secure site like banking, 
//		insurance company etc. 
//		To access these site you also have to handle certificates it is expired.
		
			  // Create proxy class object
			  Proxy p=new Proxy();
			  
		
			 
			  // Set HTTP Port to 7777
			  p.setHttpProxy("localhost:7777");
			 
			  // Create desired Capability object
			  DesiredCapabilities cap=new DesiredCapabilities();
			 
			  // Pass proxy object p
			  cap.setCapability(CapabilityType.PROXY, p);
			  System.setProperty("webdriver.chrome.driver", "D:\\SELINIUM_FEB24\\chromedriver.exe");		 
			 
			  // Open  firefox browser
			  WebDriver driver = new ChromeDriver();
			  // from here onwards code will be same as normal script
			 
			 }
	}
			 


