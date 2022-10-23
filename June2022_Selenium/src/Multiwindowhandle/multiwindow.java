package Multiwindowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://www.amazon.in/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        
        //single window handle
        String singlewindow = driver.getWindowHandle();
        System.out.println(singlewindow );
        Thread.sleep(2000);
        // multi window
        
        driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
        Thread.sleep(2000);
        Set<String> list = driver.getWindowHandles();
        for(String ids:list)
        {
        	System.out.println(ids);
        }
        Thread.sleep(2000);
        ArrayList<String> al=new <String>ArrayList(list);
        driver.switchTo().window(al.get(1));
        String text = driver.findElement(By.xpath("(//*[@class='a-price-whole'])[5]")).getText();
        System.out.println(text);
        
        Thread.sleep(2000);
        //focus change on differnt window
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);
        driver.switchTo().window(al.get(1));
        Thread.sleep(2000);
        driver.switchTo().window(al.get(2));

	}

}
