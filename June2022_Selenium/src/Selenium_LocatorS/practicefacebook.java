package Selenium_LocatorS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practicefacebook 
{

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://www.facebook.com/r.php?locale=en_GB&display=page";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys("Arnav");
		driver.findElement(By.name("lastname")).sendKeys("Reddy");
		driver.findElement(By.name("reg_email__")).sendKeys("thearjuntrader@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("arnav@111");
		
		WebElement date = driver.findElement(By.cssSelector("select[name=birthday_day]"));
		Select s=new Select(date);
		s.selectByIndex(30);
		WebElement month = driver.findElement(By.cssSelector("select[name=birthday_month]"));
		Select s1=new Select(month);
		s1.selectByValue("2");
		WebElement year = driver.findElement(By.cssSelector("select[name=birthday_year]"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2020");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		boolean male = driver.findElement(By.xpath("(//input[@name='sex'])[2]")).isSelected();
		System.out.println("male option is selected ="+male);
		//driver.findElement(By.xpath("//*[@id=\"u_0_s_jW\"]")).click();
		String v = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div[2]")).getText();
		System.out.println(v);


	}

}
