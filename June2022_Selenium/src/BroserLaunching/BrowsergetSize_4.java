package BroserLaunching;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsergetSize_4 
{

	public static void main(String[] args) throws InterruptedException  
	{
		String key="webdriver.chrome.driver";
		String value ="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://www.flipkart.com/";
        
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        System.out.println(driver.manage().window().getSize());//or
        //Dimension defdim = driver.manage().window().getSize();
        //System.out.println( defdim);
        Thread.sleep(3000);
      
        Thread.sleep(2000);
        
        Dimension d1 = new Dimension(600,200);
        
        driver.manage().window().setSize(d1);
        Thread.sleep(3000);
        Dimension d2=new Dimension(900,500);
        driver.manage().window().setSize(d2);
        Thread.sleep(3000);
        
        //System.out.println(driver.manage().window().);
        driver.close();
        
        
	}

}
