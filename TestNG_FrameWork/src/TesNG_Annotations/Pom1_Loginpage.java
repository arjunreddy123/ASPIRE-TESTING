package TesNG_Annotations;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import practice.utilityclass;

public class Pom1_Loginpage 
{
@FindBy (xpath="(//*[@name='RememberMe'])[1]") private WebElement chkBox;
@FindBy (id="Email")                           private WebElement unname;
@FindBy (id="Password")                        private WebElement pwd;
@FindBy (xpath="//*[@type='submit']")          private WebElement login;

Pom1_Loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


@Test
public void gettitle(WebDriver driver) throws EncryptedDocumentException, IOException
{
	String expTitle =utilityclass2.getStringdata("sheet1",1,0);
	String actTitle = driver.getTitle();
	Assert.assertEquals(expTitle,actTitle,"Test case Title fail");
}
@Test
public void chekbox(WebDriver driver) throws EncryptedDocumentException, IOException
{
	boolean expected = chkBox.isSelected();
	boolean actcheck=utilityclass.getbooleandata("check", 1, 3);
	Assert.assertEquals(actcheck, expected,"Chekbox not selected");
	
}
@Test
	public void username() throws EncryptedDocumentException, IOException
	{
	unname.clear();
	unname.sendKeys(utilityclass2.getStringdata("sheet1",1,1));
	}


@Test
	public void password() throws EncryptedDocumentException, IOException
	{
	    pwd.clear();
		pwd.sendKeys(utilityclass2.getStringdata("sheet1",1,2));
	}

@Test
	public void submit()
	{
		login.click();
	}
}
