package practiceSunday_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://licindia.in/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Actions act= new Actions(driver);
        WebElement mouse = driver.findElement(By.xpath("//*[contains(text(),'Customer Services ')]"));
        act.moveToElement(mouse).perform();
        Thread.sleep(2000);
        List<WebElement> product = driver.findElements(By.xpath("//*[@class='tab-left']/ul/li"));
        for(WebElement list:product)
        {
        	act.moveToElement(list).perform();
        	Thread.sleep(2000);
        }
        
	}

}
