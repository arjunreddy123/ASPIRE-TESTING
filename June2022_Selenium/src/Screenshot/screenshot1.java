package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1
{
	public static void main(String[] args) throws IOException 
	{
		
	
	String key="webdriver.chrome.driver";
	String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
    String url="https://www.facebook.com/";
	
	System.setProperty(key, value);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	
	//fullwebpage screenshot
	
	TakesScreenshot t=(TakesScreenshot)driver;// Takescreenshot ha inteface ahe driver la cast kela ahe takscren interface mdhe
	File source = t.getScreenshotAs(OutputType.FILE);
	
	
	//date formating
	Date d=new Date();
	String timetamp = d.toString().replace(":", "-").replace(" ","-");
	System.out.println(timetamp);
	File destination = new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\ScreenShot\\"+timetamp+".jpg");
	FileHandler.copy(source, destination);
//	
//	WebElement img = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//	File source1=img.getScreenshotAs(OutputType.FILE);
//	File destination = new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\ScreenShot\\ugile.jpg");
//	FileHandler.copy(source1, destination);
//	
}
}
