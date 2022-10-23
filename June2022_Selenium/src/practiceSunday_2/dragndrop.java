package practiceSunday_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://demoqa.com/droppable";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Actions act=new Actions(driver);
        
        driver.findElement(By.xpath("//*[@id='droppableExample-tab-preventPropogation']")).click();
        
        WebElement drag = driver.findElement(By.xpath("//*[@id='dragBox']"));
        Thread.sleep(2000);
        act.moveToElement(drag).perform();
        WebElement drop = driver.findElement(By.xpath("//*[@id='notGreedyInnerDropBox']"));
        Thread.sleep(2000);
        act.moveToElement(drop).perform();
        act.dragAndDrop(drag, drop).perform();
	}

}
