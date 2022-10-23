package practiceSunday_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractcice 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://demoqa.com/nestedframes";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes"); 
        Thread.sleep(2000);
        
        //switch focus on frame
        //driver.switchTo().frame(0);
        driver.switchTo().frame("frame1");
        //WebElement parent = driver.findElement(By.xpath("//*[@width='500px']"));
       // driver.switchTo().frame(parent);
        Thread.sleep(2000);
      
        // iframe text
        String parent1 = driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
        System.out.println(parent1);
        driver.switchTo().frame(0);
        String child = driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
        System.out.println(child);

	}

}
