package Allxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://mytestingthoughts.com/Sample/home.html";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Ugile");
		driver.findElement(By.xpath("(//*[@name='inlineRadioOptions'])[1]")).click();
		
		WebElement Hobbis = driver.findElement(By.xpath("//*[@id='exampleFormControlSelect2']"));
		Select s=new Select(Hobbis);
		   s.selectByIndex(2);
		//Select s1=new Select(Hobbis);
		   
		List<WebElement> list = s.getOptions();
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		WebElement deparment = driver.findElement(By.xpath("//*[@name='department']"));
		Select s2=new Select(deparment);
		s2.selectByIndex(3);
		//Select s3=new Select(deparment);
		List<WebElement> depart = s2.getOptions();
		System.out.println("===Department office===");
		for(WebElement d:depart)
		{
			System.out.println(d.getText());
		}
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("Arjun");
		driver.findElement(By.xpath("//*[@name='user_password']")).sendKeys("Arjun@111");
		driver.findElement(By.xpath("(//*[@class='form-control'])[1]")).sendKeys("Arjun@111");
		driver.findElement(By.xpath("//*[@placeholder='E-Mail Address']")).sendKeys("thearjuntrader@gmai.com");
		driver.findElement(By.xpath("//*[@name='contact_no']")).sendKeys("(022)7775977");
		driver.findElement(By.xpath("//*[@id='exampleFormControlTextarea1']")).sendKeys("At.post udgir Dist-Latur");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("===Thank you So much");
	
    }
}