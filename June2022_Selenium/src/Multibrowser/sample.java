package Multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// for chromrdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//firefoxdriver
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		//Edge browser
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();

		//Htmlheadless browser
//		
//		WebDriver driver=new HtmlUnitDriver();
//
//       
//        driver.get("https://www.flipkart.com/");
//        Thread.sleep(3000);
//        String text = driver.findElement(By.xpath("//p[@class='_1-pxlW']")).getText();
//        System.out.println(text);
//        Thread.sleep(3000);
        
       
        driver.close();
	}

}
