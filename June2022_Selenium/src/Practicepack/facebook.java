package Practicepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://www.facebook.com/r.php?locale=en_GB&display=page";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys("Arnav");
		driver.findElement(By.name("lastname")).sendKeys("Reddy");
		driver.findElement(By.name("reg_email__")).sendKeys("thearjuntrader@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("arnav@111");
		//birthday
		
		WebElement date = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		Select s=new Select(date);
		//s.selectByIndex(30);
		Thread.sleep(2000);
		//s.selectByValue("30");
		Thread.sleep(2000);
		s.selectByVisibleText("9");
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		boolean male = driver.findElement(By.xpath("(//*[@type='radio'])[2]")).isSelected();
		System.out.println(male);
		
		

	}

}
