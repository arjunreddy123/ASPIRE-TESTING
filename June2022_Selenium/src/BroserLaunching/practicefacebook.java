package BroserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicefacebook 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement year = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		Select s=new Select(year);
		s.selectByIndex(30);

	}

}
