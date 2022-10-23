package BroserLaunching;
import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice 
{

	public static void main(String[] args) throws InterruptedException 
	{
        String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
		String url="https://www.facebook.com/login/";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(500,400);
		driver.manage().window().setPosition(p);
		
		System.out.println( driver.findElement(By.xpath("//*[@class='_9axz']")).getText());
		
		System.out.println(driver.findElement(By.linkText("Forgotten account?")).getText());
		Thread.sleep(3000);
        driver.close();
	}

}
