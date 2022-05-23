package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumLocators {
 
    public static void main(String[] args) {
         
        //Creating a driver object referencing WebDriver interface
       // WebDriver driver;
         
        //Setting webdriver Chrome.driver property
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\anigot01\\OneDrive - Arm\\Desktop\\Tasks\\Downloads\\chromedriver.exe");
         
        //Instantiating driver object and launching browser
         WebDriver  driver = new ChromeDriver();
         
        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
        System.out.println("Browser launched Successfully");
        
         
        //Closing the browser
        driver.quit();
  
    }
  
}