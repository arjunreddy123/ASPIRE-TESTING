import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownlist 
{
    @Test
	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
		String url="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        
        WebElement products = driver.findElement(By.xpath("(//*[@class='col-lg-3'])[1]"));
        Select s=new Select(products);
        s.selectByIndex(2);
        
        System.out.println(s.getFirstSelectedOption().getText());
        
        WebElement animal = driver.findElement(By.xpath("(//*[@class='col-lg-3'])[2]"));
        Select s1=new Select(animal);
        s1.selectByIndex(1);
        //multiselctable list box
       WebElement foodlist = driver.findElement(By.xpath("//select[@id='second']"));
       Select s3=new Select(foodlist);
       s3.selectByIndex(1);
       Thread.sleep(2000);
       s3.selectByValue("donut");
       Thread.sleep(2000);
       s3.selectByVisibleText("Burger");
       Thread.sleep(2000);
       s3.deselectByIndex(1);
       System.out.println("=====selected list==");
       List<WebElement> selectedoption = s3.getAllSelectedOptions();
       for(WebElement alloption:selectedoption)
       {
    	   System.out.println(alloption.getText());
       }
       System.out.println("--all dropdownlist---");
       List<WebElement> alllist = s3.getOptions();
       for(WebElement list:alllist)
       {
    	   System.out.println(list.getText());
       }
	}

}
