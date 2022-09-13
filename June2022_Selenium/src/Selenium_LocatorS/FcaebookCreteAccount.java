package Selenium_LocatorS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FcaebookCreteAccount 
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
		
		//fb date select by index
		WebElement birthdate = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		
		Select s=new Select(birthdate);
		s.selectByIndex(30);
		
		//fb month select by value
		
		WebElement birthmonth = driver.findElement(By.xpath("//*[@name='birthday_month']"));
		Select m=new Select(birthmonth);
		m.selectByValue("3");
		Thread.sleep(2000);
		
		//fb year selct by visible text
		WebElement birthyear = driver.findElement(By.xpath("//*[@name='birthday_year']"));
		Select y=new Select(birthyear);
		y.selectByVisibleText("1988");
		
		//facebook radiobuttons
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		
		//submit button
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		//re-enter email id
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("thearjuntrader@gmail.com");
		//again submit
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		
		
		

	}

}
