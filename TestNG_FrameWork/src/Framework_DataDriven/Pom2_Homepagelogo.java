package Framework_DataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom2_Homepagelogo 
{

	    @FindBy(xpath="//*[@class='brand-image-xl logo-xl']") private WebElement img;
	    
	    Pom2_Homepagelogo  (WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
		@Test
		public void logo() throws EncryptedDocumentException, IOException 
		{
			 boolean expdisply = img.isDisplayed();
		     boolean Actdiply=GetExcel.getbooleangdata("sheet1",1,4);
			
			 if(expdisply==(Actdiply))
			 System.out.println("Test Case Logo pass ");
			 else
		     System.out.println("Test case Logo Fail");
		}

}
 

