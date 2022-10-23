package Practicepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver\\\\chromedriver.exe";
		String url="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement list = driver.findElement(By.xpath("(//*[@class='col-lg-3'])[1]"));
        Select s=new Select(list);
        s.selectByIndex(2);
        System.out.println(s.getFirstSelectedOption().getText());
        System.out.println("===product lists===");
        List<WebElement> product = s.getOptions();
        for(WebElement dis:product)
        {
        	System.out.println(dis.getText());
        }
        WebElement li = driver.findElement(By.xpath("(//*[@id='animals'])[1]"));
        Select s1=new Select(li);
        s1.selectByValue("babycat");
        System.out.println("==animal list");
        List<WebElement> alllist = s1.getOptions();
        for(WebElement lists:alllist)
        {
        	System.out.println(lists.getText());
        }
        
	}

}
