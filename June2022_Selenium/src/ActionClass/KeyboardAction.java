package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction 
{

	public static void main(String[] args) throws InterruptedException 
	{

	  	String key  ="webdriver.chrome.driver";
	  	String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url  ="https://en-gb.facebook.com/";
        System.setProperty(key, value);
        
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Actions act =new Actions(driver);
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
       
        Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='month']")).click();
       
        
        int size = driver.findElements(By.xpath("//*[@title='Month']/option")).size();
        System.out.println(size);
        for(int i=1;i<=size;i++)
        {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(2000);
        }
        for(int i=1;i<=6;i++)
        {
        	act.sendKeys(Keys.ARROW_UP).perform();
        	Thread.sleep(2000);
        }
        act.sendKeys(Keys.ENTER).perform();
        
        
	}

}
