package Selenium_LocatorS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_n_Css 
{

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value ="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://www.facebook.com/";
		
        
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //Xpath
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arjunugile@gmail.com");
        //css
        driver.findElement(By.cssSelector("#pass")).sendKeys("arjun@777");
        //name
        driver.findElement(By.name("login")).click();
        
        //driver.close();
  
	}

}
