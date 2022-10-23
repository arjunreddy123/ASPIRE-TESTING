package Allxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathDateDROPDOWN 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="http://www.dypatil.edu/application-form/";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

        //date  dropdowan
        driver.findElement(By.xpath("//*[@type='date']")).sendKeys("02.09.2022");
		// Dropdown
        WebElement option = driver.findElement(By.xpath("//*[@id='school']"));
        Select s=new Select(option);
        //select by index(0)
        s.selectByIndex(3);
        Thread.sleep(3000);
        //select by value
        s.selectByValue("School of Pharmacy");
        Thread.sleep(3000);
        //select by visibletext
        s.selectByVisibleText("RAIT (School of Engineering )\r\n"
        		+ "                                ");
        Thread.sleep(3000);
        
        //get all elements in list
        List<WebElement> allelements = s.getOptions();
        
        for(WebElement elements:allelements)
        {
        	System.out.println(elements.getText());
        }
        
        //default selected option
        System.out.println(s.getFirstSelectedOption().getText());
        
        //get all selected option
        

	}

}
