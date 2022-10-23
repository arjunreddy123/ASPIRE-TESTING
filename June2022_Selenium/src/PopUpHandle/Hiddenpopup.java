package PopUpHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup 
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
        driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("arjunugile");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//*[@class='_1-pxlW']")).getText());
        driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();

	}

}
