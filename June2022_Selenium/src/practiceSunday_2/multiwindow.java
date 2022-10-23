package practiceSunday_2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Practicepack.Arraylist;

public class multiwindow 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://www.amazon.in/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        //Single window handle
        String home = driver.getWindowHandle();
        System.out.println("Home Page="+home);
        driver.findElement(By.xpath("(//*[contains(text(),'Galaxy M13 (Midnight Blue, 4GB,')])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Samsung Galaxy M21 2021 Edition')]")).click();
        Set<String> windows = driver.getWindowHandles();
        for(String win:windows)
        {
        	System.out.println(win);
        }
        ArrayList<String>al= new ArrayList(windows);
        driver.switchTo().window(al.get(1));
        String price = driver.findElement(By.xpath("//*[@id='productTitle']")).getText();
        System.out.println(price);
        //focus chnage
        driver.switchTo().window(al.get(0));
        Thread.sleep(2000);
        driver.switchTo().window(al.get(1));
        Thread.sleep(2000);
        driver.switchTo().window(al.get(2));
        
        
        

	}

}
