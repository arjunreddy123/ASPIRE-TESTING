package Selenium_LocatorS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Locatotrs 
{

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
		String url="https://en-gb.facebook.com/";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
        // id
		driver.findElement(By.id("email")).sendKeys("arjunugile@gmai.com");
		
		//name
		driver.findElement(By.name("pass")).sendKeys("arnav@1111");
		
		//classname
		driver.findElement(By.className("_8eso")).getText();
		
		//tagname
		//driver.findElement(By.tagName("button")).click();
		
		//linktext
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partiallinktext
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//cssselecter
		driver.findElement(By.cssSelector("#identify_email")).sendKeys("arnav@gmail.com");;
		
		//xapth
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("The End");
	}
	
}
