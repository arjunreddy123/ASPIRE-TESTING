package practiceSunday_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseclick 
{

	public static void main(String[] args) throws InterruptedException
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
		String url="http://demo.guru99.com/test/simple_context_menu.html";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Actions act=new Actions(driver);
        WebElement dobileclick = driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
        act.moveToElement(dobileclick).doubleClick().build().perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        WebElement rightclick = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
        act.moveToElement(rightclick).contextClick().build().perform();

	}

}
