package BroserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigate_3 
{

	public static void main(String[] args) throws InterruptedException 
	 {
	  	String key  ="webdriver.chrome.driver";
	  	String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url  ="https://www.facebook.com/";
        System.setProperty(key, value);
        
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.manage().window().minimize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
        
      }

}
