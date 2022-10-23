package practiceSunday_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartaction 
{

	public static void main(String[] args) 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://www.flipkart.com/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Actions act=new Actions(driver);
        driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
        
        WebElement fashion = driver.findElement(By.xpath("(//*[@class='xtXmba'])[4]"));
        act.moveToElement(fashion).perform();
        
        WebElement kidswear = driver.findElement(By.xpath("//*[@class='_6WOcW9'][8]"));
        act.moveToElement(kidswear).perform();
        List<WebElement> kids = driver.findElements(By.xpath("//*[@class='_6WOcW9 _3YpNQe']"));
        for(WebElement list:kids)
        {
        	System.out.println(list.getText());
        }
	}

}
