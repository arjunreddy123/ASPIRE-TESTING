package Practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaotrs 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe");
       String url="https://www.flipkart.com/";
       // String url="https://www.facebook.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(url);
        //name locators
        //driver.findElement(By.name("q")).sendKeys("samsung");
        //tagname
        //System.out.println(driver.findElement(By.tagName("h2")).getText());
        //class name
        //driver.findElement(By.className("_3704LK")).sendKeys("laptops");
        //linktext
        //driver.findElement(By.linkText("Forgotten password?")).click();
        //partiallinktext
       // driver.findElement(By.linkText("Forgotten")).click();
        //cssselctor
        //driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
        //xpath
      //driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abc@gmail.com");
        
        //text
        
       //System.out.println(driver.findElement(By.xpath("(//*[text()='Best of Electronics'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//*[(contains(text(),'Beauty,Food,Toys&more'))])[1]")).getText());
	}

}
