package BroserLaunching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.grid.Main;

public class BrowserOpening_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
//	driver.get("https://www.amazon.in/your-account");	
//	Thread.sleep(5000);
      List<WebElement> links = driver.findElements(By.xpath("//a"));
      System.out.println(links.size());
       
	driver.close();
	
	
	}

	}


