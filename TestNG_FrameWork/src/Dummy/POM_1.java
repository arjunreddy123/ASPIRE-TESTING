package Dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_1
{

	@FindBy (xpath=("//input[@id='RememberMe']"))private WebElement checkbox;
	
	@FindBy (xpath=("//input[@id='Email']"))      private WebElement email;

	@FindBy (xpath=("//input[@id='Password']"))    private WebElement password;

	@FindBy (xpath=("//button[@class='button-1 login-button']")) private WebElement submit;		

	public  POM_1(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	String expTitle="Your store.Login";
	@Test
	public void checkboxvalidation()
	{
		//by default checkbox selection is false
		boolean actcheck=checkbox.isSelected();
		boolean exptcheck=false;
		if(exptcheck==actcheck)
		{
			System.out.println("Default checkbox status TC002 is pass");
		}
		else
		{
			System.out.println("Default checkbox status TC002 is fail");
		}
	}
	@Test
	public void un()
	{   email.clear();
		email.sendKeys("admin@yourstore.com");
	}
	@Test
	public void pwd()
	{
		password.clear();
		password.sendKeys("admin");
	}
	@Test	
	public void loginbutton()
	{
		submit.click();
	}
	
	
}


