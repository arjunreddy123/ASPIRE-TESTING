package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_N_drop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://demoqa.com/droppable";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        Actions act =new Actions(driver);
        Thread.sleep(2000);
        
        //Drag_N_Drop Action
        driver.findElement(By.xpath("//*[@role='tab'][3]")).click();
        
        WebElement dragelement = driver.findElement(By.xpath("//*[@id='dragBox']"));
        Thread.sleep(2000);
        
        WebElement droptopinner = driver.findElement(By.xpath("//*[@id='notGreedyInnerDropBox']"));
        Thread.sleep(2000);
        
        act.dragAndDrop(dragelement, droptopinner).perform();
        
       
        //Scroll Actions
        Thread.sleep(2000);
        WebElement scrollelement = driver.findElement(By.xpath("//*[@class='btn btn-light active']"));
        act.scrollToElement(scrollelement).perform();
        
        
   

	}

}
