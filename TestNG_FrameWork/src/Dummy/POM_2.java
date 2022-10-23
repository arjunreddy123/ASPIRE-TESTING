package Dummy;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class POM_2 
{
	   @FindBy (xpath="(//img[@class='brand-image-xl logo-xl'])") private WebElement logo;
		
		public POM_2 (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		// logo display
		@Test
		public void logoValidation() throws EncryptedDocumentException, IOException
		{
			boolean explogoresult=utility.execlBooleanData1("sheet1",1,4);
			boolean actlogoresult=logo.isDisplayed();
			if(explogoresult==actlogoresult)
			{
				System.out.println("tc01 is pass");
			}
			else
			{
				System.out.println("tc01 is fail");
			}
			
		}

	}


