package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 
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
       
        // print cell
        String text = driver.findElement(By.xpath("(//*[@style='text-align: left;'])[2]")).getText();
        System.out.println(text);
        
        //print column
        System.out.println("****Density column******");
        List<WebElement> column = driver.findElements(By.xpath("(//*[contains(@class,'wikitable sortable jquery-tablesorter')])/tbody/tr/td[10]"));
        for(WebElement temp:column)
        {
        	System.out.println(temp.getText());
        }
        System.out.println("Number of rows in table body="+column.size());
        
        System.out.println("**** 6 row print for tamilnadu row******\n");
        List<WebElement> row = driver.findElements(By.xpath("(//*[contains(@class,'wikitable sortable jquery-tablesorter')])/tbody/tr[6]/td"));
        for(WebElement temp:row)
        {
        	System.out.print(temp.getText()+"  |  ");
        }
        int colmcount = row.size();
        System.out.println("\n Number of colmn at row"+colmcount);
        
        //print Header
        System.out.println("*****\n Header list****");
        List<WebElement> header = driver.findElements(By.xpath("//*[@class='headerSort']"));
        for(WebElement temp:header)
        {
        	System.out.print(temp.getText()+" | ");
        }
        
        //full Table
        
	}

}
