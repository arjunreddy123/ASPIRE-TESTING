package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullTable_2 
{

	public static void main(String[] args) 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //print Header
        System.out.println("*****\n Header list****");
        List<WebElement> header = driver.findElements(By.xpath("//*[@class='headerSort']"));
        for(WebElement temp:header)
        {
        	System.out.print(temp.getText()+" | ");
        }
        System.out.println();
        
        //full table
        List<WebElement> row = driver.findElements(By.xpath("(//*[contains(@class,'wikitable sortable jquery-tablesorter')])/tbody/tr[6]/td"));
             int  colmcount= header.size();
             int rowcount = row.size();
        for(int i=1;i<rowcount;i++)
        {
        	
			for(int j=1;j<colmcount;j++)
        	{
				
          String tableall = driver.findElement(By.xpath("//*[contains(@class,'wikitable sortable jquery-tablesorter')]/tbody/tr["+i+"]/td["+j+"]")).getText();
          System.out.print(tableall+" | ");
          
        	}
			System.out.println();
      

	}

	}
}
