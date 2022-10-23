package ActionClass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.w3.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://licindia.in/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        //single Element
        Actions act= new Actions(driver);
        WebElement custmer = driver.findElement(By.xpath("//*[@class='bar has-sub'][3]"));
        act.moveToElement(custmer).perform();
        Thread.sleep(2000);
        
        //multipleElemwnts
        List<WebElement> multielement = driver.findElements(By.xpath("//*[@class='tab-left']/ul/li"));
       
        for(WebElement ele:multielement)
        {
        	act.moveToElement(ele).perform();
        	 Thread.sleep(2000);
        }
	}

}
