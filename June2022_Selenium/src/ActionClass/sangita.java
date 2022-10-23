package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sangita 
{

	public static void main(String[] args) throws InterruptedException 
	{
		{
			String key="webdriver.chrome.driver";
			String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		    driver.get("https://www.flipkart.com/");
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    Actions act=new Actions(driver);
		    
			WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
			act.moveToElement(fashion).perform();
			Thread.sleep(2000);
			WebElement Wware = driver.findElement(By.xpath("(//*[@class='_6WOcW9'])[4]"));
			act.moveToElement(Wware).perform();
			List<WebElement> list = driver.findElements(By.xpath("//*[@class='_6WOcW9 _3YpNQe']"));
			for(WebElement temp:list)
			{
				System.out.println(temp.getText());
			}
			
		}
		

	}

}
