package BroserLaunching;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserOpening_2 
{
   
   
	

	
	public static void main(String[] args) throws InterruptedException
	{
		
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
		//String url="https://www.flipkart.com/";
		//String url1="https://www.google.co.in/";
		String url3="https://en-gb.facebook.com/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url3);
		//driver.get(url1);
		System.out.println(" CHEK FRAMEWORk");
		driver.findElement(By.name("email")).sendKeys("arjunugile@gmai.com");
		
		Thread.sleep(5000);
		driver.close();
		

	}

}

