package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehomework 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://chercher.tech/practice/frames-example-selenium-webdriver";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        String text = driver.findElement(By.xpath("//*[text()='Frames Examples in Selenium Webdriver']")).getText();
        System.out.println(text);
        String label = driver.findElement(By.xpath("//*[@style='font-size:40px']")).getText();
        System.out.println(label);
        //driver.switchTo().frame("frame1");
        //driver.switchTo().frame(0);
       // WebElement topictext = driver.findElement(By.xpath("//*[@style='color:red']"));
        //driver.switchTo().frame(topictext);
        //String topict = driver.findElement(By.xpath("//*[@id='topic']")).getText();
        //System.out.println(topict);
        driver.switchTo().frame("frame1");
    	Thread.sleep(2000);
    	driver.findElement(By.tagName("input")).sendKeys("Arjun");
    	Thread.sleep(2000);
        driver.close();
	}

}
