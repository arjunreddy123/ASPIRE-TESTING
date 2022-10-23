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

public class practicescreenshot 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://www.flipkart.com/";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		Date d=new Date();
		String timetamp = d.toString().replace(":", "-").replace(" ","-");
		System.out.println(timetamp);
		//File source = t.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\ScreenShot\\"+timetamp+".jpg");
        //FileHandler.copy(source, destination);
        
        WebElement img = driver.findElement(By.xpath("(//*[@class='_396cs4 _3exPp9'])[1]"));
        File source1 = img.getScreenshotAs(OutputType.FILE);
        File desti=new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\ScreenShot\\"+timetamp+".jpg");
        FileHandler.copy(source1, desti);
        
        Thread.sleep(5000);
        driver.close();
	}

}
