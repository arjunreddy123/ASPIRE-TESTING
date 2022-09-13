package Findelements;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://www.google.com/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String exoption="mobile phone";
        driver.findElement(By.name("q")).sendKeys("mobile");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
        Thread.sleep(2000);
        for(WebElement option:list)
        {
        	System.out.println(option.getText());
        }
        //list disply in Ascending order
        TreeSet<String> tr=new TreeSet<String>();
        for(WebElement option:list)
        {
        	tr.add(option.getText());
        }
        System.out.println(tr);
        Thread.sleep(2000);
        //click on one element out off
        for(WebElement option:list)
        {
        	String str=option.getText();
        	if(exoption.equals(str))
        	{
        		option.click();
        		break;
        	}
        }
       // driver.close();
	}

}
