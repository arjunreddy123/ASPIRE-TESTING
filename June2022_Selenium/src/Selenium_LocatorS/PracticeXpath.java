package Selenium_LocatorS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath 
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
		driver.findElement(By.xpath(" //*[@name='first_name']")).sendKeys("arjun");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("aru111");
		//Xpath radio
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	    boolean radiooptionclick = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	    System.out.println("male option is select ="+radiooptionclick);
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		boolean radiofemale=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();
		System.out.println("Female option is select ="+radiofemale);
		
		driver.close();

	}

}
