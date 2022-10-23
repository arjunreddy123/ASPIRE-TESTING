package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartassigenment {

	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://www.flipkart.com/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
        for(WebElement element:list)
        {
        	System.out.println(element.getText());
        }

	}

}
