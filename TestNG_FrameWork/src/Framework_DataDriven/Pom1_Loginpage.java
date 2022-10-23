package Framework_DataDriven;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom1_Loginpage 
{


@FindBy (id="Email") private WebElement unname;
@FindBy (id="Password") private WebElement pwd;
@FindBy (xpath="//*[@type='submit']") private WebElement login;

Pom1_Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


@Test
public void gettitle(WebDriver driver) throws EncryptedDocumentException, IOException
{
	String expTitle =GetExcel.getStringdata("sheet1",1,0);
	String actTitle = driver.getTitle();
	
	if(actTitle.equals(expTitle))
		System.out.println("Test case Title pass");
	else
		System.out.println("Test case Title fail");
}
@Test
	public void username() throws EncryptedDocumentException, IOException
	{
	unname.clear();
	unname.sendKeys(GetExcel.getStringdata("sheet1",1,1));
	}


@Test
	public void password() throws EncryptedDocumentException, IOException
	{
	    pwd.clear();
		pwd.sendKeys(GetExcel.getStringdata("sheet1",1,2));
	}

@Test
	public void submit()
	{
		login.click();
	}
}
