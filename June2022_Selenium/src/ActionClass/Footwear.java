package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Footwear 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://www.flipkart.com/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
        Actions act=new Actions(driver);
        
        WebElement fasion = driver.findElement(By.xpath("(//*[@class='xtXmba'])[4]"));
        act.moveToElement(fasion).perform();
        Thread.sleep(2000);
        WebElement footwer = driver.findElement(By.xpath("//*[@class='_6WOcW9'][3]"));
        act.moveToElement(footwer).perform();
        List<WebElement> list =driver.findElements(By.xpath("//*[@class='_6WOcW9 _3YpNQe']"));
        for(WebElement ele:list)
        {
        	System.out.println(ele.getText());
        }

	}

}
//*[@class='_6WOcW9 _2-k99T']//*[@class='_6WOcW9 _3YpNQe']