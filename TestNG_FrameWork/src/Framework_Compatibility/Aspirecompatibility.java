package Framework_Compatibility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Aspirecompatibility 
{
	
	static WebDriver driver=null;
	
	@Test
	@Parameters (value="browsername")
	public void browserLaunch(String browser)throws InterruptedException
	{	
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.print("chrome is Running");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.print("FireFox is Running");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		System.out.print("edge is Running");
		}
		else
		{
			System.out.println("Headless browser");
			//driver = new HtmlUnitDriver();
		}
		driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
	}
}
/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
<parameter name="browsername" value="edge"/>
<test thread-count="5" name="Test">
  <classes>
  <class name="Framework_Compatibility.Aspirecompatibility"/>
  </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
*/
