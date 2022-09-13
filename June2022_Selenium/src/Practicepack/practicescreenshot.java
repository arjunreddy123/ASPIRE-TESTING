package Practicepack;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practicescreenshot 
{

	public static void main(String[] args) throws IOException 
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe");
       String url="https://www.flipkart.com/";
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get(url);
        
        TakesScreenshot t=(TakesScreenshot)driver;
        Date d=new Date();
        String timtamp = d.toString().replace(":","_").replace(" ", "_");
        System.out.println(timtamp);
        File source = t.getScreenshotAs(OutputType.FILE);
        File desti=new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\ScreenShot\\"+timtamp+".jpg");
        FileHandler.copy(source, desti);
	}

}
