package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="http://demo.guru99.com/test/simple_context_menu.html";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        Actions act=new Actions(driver);
        //double click
        WebElement doubleclick = driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
        act.moveToElement(doubleclick).doubleClick().build().perform();
        Thread.sleep(2000);
        //or this Approch use
        //act.doubleClick(doubleclick).perform();
        //Alertbox
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
        //Right click
        WebElement rightclick = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
        act.moveToElement(rightclick).contextClick().build().perform();
        
        //or this Approch use
        //act.contextClick(rightclick).perform();

	}

}
