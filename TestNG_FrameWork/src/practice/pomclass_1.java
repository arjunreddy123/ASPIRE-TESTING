package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

    public class pomclass_1 
    {
    	
    @FindBy  (xpath="//*[@id='RememberMe']") 	 private  WebElement checkbox;
	@FindBy (xpath="//*[@id='Email']")    private  WebElement usname;
	@FindBy (xpath="//*[@id='Password']") private  WebElement pwd;
	@FindBy (xpath="//*[@type='submit']") private  WebElement log;
	
	pomclass_1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@Test
	public void title(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		String acttitle=(utilityclass.getexceldata("sheet1", 1, 0));
		String expTitle = driver.getTitle();
		if(expTitle.equals(acttitle))
			System.out.println("Test case title pass");
		else
			System.out.println("Test case title fail");
	}
	
	
	@Test
	public void chekbox(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		boolean expected = checkbox.isEnabled();
		System.out.println(expected);
		boolean actcheck=utilityclass.getbooleancheck("check", 1, 3);
		if(expected==actcheck)
			System.out.println("checkbox is pass");
		else
			System.out.println("checkbox is failed");
		
	}
	
	
	
    @Test
	public void username() throws EncryptedDocumentException, IOException 
	{
      usname.clear();
      usname.sendKeys(utilityclass.getexceldata("sheet1", 1, 1));
    

	}
    @Test
	public void password() throws EncryptedDocumentException, IOException 
	{
      pwd.clear();
      pwd.sendKeys(utilityclass.getexceldata("sheet1", 1, 2));

	}
    @Test
	public void login() 
	{
      log.click();
	}

}
