package Framework_POMpagefactory;
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
	public void username()
	{
	unname.clear();
	unname.sendKeys("admin@yourstore.com");
	}
@Test
	public void password()
	{
	    pwd.clear();
		pwd.sendKeys("admin");
	}
@Test
	public void submit()
	{
		login.click();
	}
}
