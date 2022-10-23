package Framework_POMpagefactory;

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
		public void logo() 
		{
			boolean disply = img.isDisplayed();
			System.out.println(disply);
		}

}
 

