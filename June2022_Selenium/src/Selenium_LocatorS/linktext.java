package Selenium_LocatorS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext 
{

	public static void main(String[] args) throws InterruptedException
    {
		String key="webdriver.chrome.driver";
		String value ="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://www.facebook.com/";
        
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
      
        driver.findElement(By.id("email")).sendKeys("arjunugile@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("arjun111");
        
        //linktext
        driver.findElement(By.linkText("Forgotten password?")).click();
       //partialLinkText
        driver.findElement(By.partialLinkText("Forgotten ")).click();
        
        driver.findElement(By.name("login")).click();
       

	}

}
