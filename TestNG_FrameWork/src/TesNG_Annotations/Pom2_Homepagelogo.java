package TesNG_Annotations;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pom2_Homepagelogo 
{

	    @FindBy(xpath="//*[@class='brand-image-xl logo-xl']") private WebElement img;
	    
	    Pom2_Homepagelogo  (WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
		@Test
		public void logo(WebDriver driver) throws EncryptedDocumentException, IOException 
		{
			 boolean expdisply = img.isDisplayed();
		     boolean Actdiply=utilityclass2.getbooleangdata("sheet1",1,4);
		     Assert.assertEquals(expdisply, Actdiply,"Test Case logo Fail");
		     utilityclass2.screenshot(driver);
		}
		
}
 

