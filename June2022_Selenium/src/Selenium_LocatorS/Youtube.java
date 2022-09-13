package Selenium_LocatorS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("software testing");
		driver.findElement(By.id("search-icon-legacy")).click();

		
	}

}
