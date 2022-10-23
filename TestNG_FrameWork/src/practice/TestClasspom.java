package practice;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClasspom 
{
	@Test
	public void brouserlaunch() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		pomclass_1 po=new pomclass_1 (driver);
		po.title(driver);
		Thread.sleep(2000);
		po.username();
		Thread.sleep(2000);
		po.chekbox(driver);
		Thread.sleep(2000);
		po.password();
		Thread.sleep(2000);
		po.login();
		
		pomclasss_2 pm=new pomclasss_2(driver);
		pm.logo();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
