package Multiwindowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbibank 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://www.onlinesbi.sbi/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        driver.findElement(By.xpath("//*[contains(text(),'SBI Salary Account')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(" (//*[contains(text(),'SBI Mutual Fund')])[3]")).click();
        Thread.sleep(2000);
        
        Set<String> list = driver.getWindowHandles();
        for(String ids:list)
        {
        	System.out.println(ids);
        }
        
        ArrayList<String> al=new <String>ArrayList(list);
        
        driver.switchTo().window(al.get(1));
        
        String text = driver.findElement(By.xpath("//*[@class='or-slink f-size18']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("//*[@placeholder='Enter User ID']")).sendKeys("ug12345");
        Thread.sleep(3000);
        
        //focus change on differnt window
        driver.switchTo().window(al.get(1));
        Thread.sleep(3000);
        driver.switchTo().window(al.get(2));
        Thread.sleep(3000);
        driver.switchTo().window(al.get(1));
        Thread.sleep(3000);
        driver.switchTo().window(al.get(0));
       
	}

}
