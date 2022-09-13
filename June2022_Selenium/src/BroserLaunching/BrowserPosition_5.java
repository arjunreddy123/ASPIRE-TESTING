package BroserLaunching;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPosition_5 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value ="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
        String url="https://www.amazon.com/";
        System.setProperty(key, value);
        
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
       
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getPosition());
        Point p=new Point(500,300);
        driver.manage().window().setPosition(p);
        

        Thread.sleep(3000);
        driver.close();
        
        
	}

}
