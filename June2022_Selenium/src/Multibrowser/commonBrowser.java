package Multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class commonBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;
		String browser="firfox";         //select brwoser
		
		// for chromrdriver
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
				
		//firefoxdriver
		else if(browser.equals("firefox")) 
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		}
		
		//Edge browser
		else if(browser.equals("edge")) 
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		//Html driver
		else
		{
			driver=new HtmlUnitDriver();
		}
		
		       
     driver.get("https://www.flipkart.com/");
     Thread.sleep(3000);
     String text = driver.findElement(By.xpath("//p[@class='_1-pxlW']")).getText();
     System.out.println(text);
     Thread.sleep(3000);
		        
     driver.close();
	}

}
