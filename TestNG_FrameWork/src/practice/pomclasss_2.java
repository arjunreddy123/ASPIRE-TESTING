package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class pomclasss_2 
{
	
	@FindBy (xpath="//*[@class='brand-image-xl logo-xl']") private WebElement img;
	pomclasss_2 (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@Test
	public void logo() throws EncryptedDocumentException, IOException
	{
		boolean expdisply = img.isDisplayed();
		boolean actlogo=utilityclass.getbooleandata("sheet1", 1, 4);
		if(expdisply==actlogo)
			System.out.println("logo pass");
		else
			System.out.println("logo fail");
	
	}
}
