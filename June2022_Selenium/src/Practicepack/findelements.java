package Practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://www.flipkart.com/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
       // driver.findElement(By.xpath("//*[@name='q']")).sendKeys("mobile");
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//*[@class='_37M3Pb']"));
        for(WebElement all:list)
        {
        	System.out.println(all.getText());
        }

	}

}
