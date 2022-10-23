package Framework_DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogin 
{  
	WebDriver driver=null;
	@Test
	public void browseropen() throws InterruptedException, EncryptedDocumentException, IOException
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		Pom1_Loginpage pl=new Pom1_Loginpage (driver);
		
		pl.gettitle(driver);
		pl.username();
		Thread.sleep(2000);
		pl.password();
		Thread.sleep(2000);
		pl.submit();
		Thread.sleep(2000);
		
		
		Pom2_Homepagelogo  ph=new Pom2_Homepagelogo (driver);
		Thread.sleep(2000);
		ph.logo();
		driver.close();
	}

	

}
