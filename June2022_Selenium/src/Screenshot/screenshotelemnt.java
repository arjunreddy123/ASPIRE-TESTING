package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotelemnt 
{

	public static void main(String[] args) throws IOException 
	{

	       System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe");
	       String url="https://www.flipkart.com/";
	       WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
	       driver.get(url);
	       
	       Date d=new Date();
	       String time = d.toString().replace(":","_").replace(" ","");
	       System.out.println(time);
	       WebElement img = driver.findElement(By.xpath("(//*[@class='_396cs4 _3exPp9'])[1]"));
	       File source = img.getScreenshotAs(OutputType.FILE);
	       File desti=new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\ScreenShot\\"+time+".jpg");
	       FileHandler.copy(source, desti);

	}

}
