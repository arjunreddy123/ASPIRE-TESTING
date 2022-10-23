package Allxpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlllinksonwebpage 
{

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value ="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://www.facebook.com/login/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
      //To get all links count on webpage
        List<WebElement> allinks = driver.findElements(By.xpath("//a"));
        System.out.println(allinks.size());
        
        //Print all links on webpage
        for(WebElement linklist:allinks)
        {
        	System.out.println(linklist.getText());
        }

	}

}
