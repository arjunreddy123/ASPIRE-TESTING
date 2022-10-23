package IFRAME;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arjunnsnehal 
{

	public static void main(String[] args) 
	{
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demoqa.com/nestedframes");
        
         driver.switchTo().frame("frame1");
         System.out.println("inside parent");
         String parent = driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
         System.out.println(parent);
         driver.switchTo().frame(0);
        
         WebElement child = driver.findElement(By.xpath("//*[text()='Child Iframe']"));
        
         System.out.println(child.getText());
         driver.switchTo().defaultContent();
         System.out.println("inside default");
        
	}

}
