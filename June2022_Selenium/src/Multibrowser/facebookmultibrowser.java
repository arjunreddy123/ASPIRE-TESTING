package Multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookmultibrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//chrome broswer
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
		
        //firefox browser
	   //System.setProperty("webdriver.gecko.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\geckodriver.exe");
        //WebDriver driver=new FirefoxDriver();
		
        //Edge browser
         System.setProperty("webdriver.edge.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\msedgedriver.exe");
         WebDriver driver=new EdgeDriver();
         
        driver.manage().window().maximize();
        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//*[@class='_8eso']")).getText();
        System.out.println(text);
        driver.close();
	}

}
