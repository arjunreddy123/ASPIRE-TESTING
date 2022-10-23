package Dummy;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testclass 
{
	WebDriver driver=null;
	@Test
	public void brouseropen() throws EncryptedDocumentException, IOException
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\chromedriver.exe";
		String url="https://admin-demo.nopcommerce.com/login";
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		
		POM_1 pm=new POM_1(driver);
		pm.checkboxvalidation();
		pm.un();
		pm.pwd();
		pm.loginbutton();
		
		POM_2 pm2=new POM_2(driver);
		pm2.logoValidation();
		
		driver.close();
		
   }
	
}
