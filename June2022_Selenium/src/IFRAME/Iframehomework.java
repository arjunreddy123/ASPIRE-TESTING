package IFRAME;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframehomework 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://chercher.tech/practice/frames-example-selenium-webdriver";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        String text = driver.findElement(By.xpath("//*[text()='Frames Examples in Selenium Webdriver']")).getText();
        System.out.println(text);
        String label = driver.findElement(By.xpath("//*[@style='font-size:40px']")).getText();
        System.out.println(label);
        
        driver.switchTo().frame("frame1");
    	Thread.sleep(2000);
    	driver.findElement(By.tagName("input")).sendKeys("Arjun");
    	driver.switchTo().frame("frame3");
    	driver.findElement(By.xpath("//*[@type='checkbox']")).click();
    	Thread.sleep(2000);
    	
    	
    	System.out.println(driver.findElement(By.xpath("//*[@style='color:green']")).getText());
    	Thread.sleep(2000);
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("frame2");
    	System.out.println(driver.findElement(By.xpath("//*[text()='Animals :']")).getText());
    	WebElement ele = driver.findElement(By.xpath("//*[@class='col-lg-3']"));
    	Select s=new Select(ele);
    	s.selectByIndex(2);
    	
    	List<WebElement> list = s.getOptions();
    	for(WebElement option:list)
    	{
    		System.out.println(option.getText());
    	}
        //driver.close();
	}

}
