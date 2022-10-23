package com.nopcom.QA.Login;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.nopcom.Base.Baseclass;
import com.nopcom.DashBoard.Pom2_Homepagelogo;
import com.nopcom.Login.Pom1_Loginpage;

public class TestLogin extends Baseclass
{  
	
	@Test
	public void loginpage() throws InterruptedException, EncryptedDocumentException, IOException
    {
		browseropen();
		
		Pom1_Loginpage pl=new Pom1_Loginpage (driver);
		pl.gettitle(driver);
		Thread.sleep(2000);
		pl.chekbox(driver);
		Thread.sleep(2000);
		pl.username();
		Thread.sleep(2000);
		pl.password();
		Thread.sleep(2000);
		pl.submit();
		Thread.sleep(2000);
		
		Pom2_Homepagelogo  ph=new Pom2_Homepagelogo (driver);
		Thread.sleep(2000);
		ph.logo(driver);
		driver.close();
	}

     
}
