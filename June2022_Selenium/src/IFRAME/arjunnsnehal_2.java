package IFRAME;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class arjunnsnehal_2 
{
      public static void main(String[] args) throws InterruptedException 
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_selenium\\Driver2\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.get("https://en-gb.facebook.com/");
    		Thread.sleep(3000);
    		driver.close();
    		String tag = driver.findElement(By.tagName("a")).getText();
    		System.out.println(tag);
    	}

}
