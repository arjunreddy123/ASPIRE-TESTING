package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsDefination 
{
	WebDriver driver=null;


@Given("user browser launch")
public void user_browser_launch()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\ZCucumberFramework\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}
@When("user enters url {string}")
public void user_enters_url(String str) 
{
	driver.get(str); 
}

@When("user enters login creditioanls as below")
public void user_enters_login_creditioanls_as_below(DataTable data) throws Exception 
{
	
	    List<List<String>> d = data.asLists();
	    driver.findElement(By.xpath("//*[@id='Email']")).clear();
	    driver.findElement(By.xpath("//*[@id='Password']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(d.get(2).get(1));    //admin@yourstore.com
	    driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(d.get(2).get(2)); //admin
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='Email']")).clear();
	    driver.findElement(By.xpath("//*[@id='Password']")).clear();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(d.get(1).get(1));
	    driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(d.get(1).get(2)); 
}

@When("user click on login")
public void user_clickon_login() 
{
	   driver.findElement(By.xpath("//*[@type='submit']")).click();
}
@Then("validate remember checkbox status")
public void validate_remember_checkbox_status() 
{
  boolean actstatus = driver.findElement(By.xpath("//*[@id='RememberMe']")).isSelected();
  System.out.println(actstatus);
  Assert.assertFalse(actstatus);
}
@When("user enters login creditioanls as {string} and {string}")
public void user_enters_login_creditioanls_as_and(String str1, String str2) throws InterruptedException 
{
	driver.findElement(By.xpath("//*[@id='Email']")).clear();
    driver.findElement(By.xpath("//*[@id='Password']")).clear();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(str1);    //admin@yourstore.com
    driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(str2); //admin
    Thread.sleep(2000);
    
}

@Then("validate user successfuly logged in application")
public void validate_user_successfuly_logged_in_application() throws InterruptedException 
{
//         String Expectedurl = "https://admin-demo.nopcommerce.com/admin/";
//         System.out.println(Expectedurl);
//         String Actualurl = driver.getCurrentUrl();
//         System.out.println( Actualurl);
//         Assert.assertEquals(Expectedurl, Actualurl,"Landing page is differnt");
         Thread.sleep(2000);
         driver.quit();
}

}
