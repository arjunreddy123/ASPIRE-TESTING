package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTable11 
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
        
        //print one cell for maharashtra
        String celltext = driver.findElement(By.xpath("(//*[@style='text-align: left;'])[2]")).getText();
        System.out.println(celltext);
        
        //density column
        List<WebElement> column = driver.findElements(By.xpath("//*[@class='wikitable sortable jquery-tablesorter']/tbody/tr/td[10]"));
        for(WebElement temp:column)
        {
        	System.out.println(temp.getText());
        }
        System.out.println("\n Number of rows in Table body="+column.size());
        
       
      
        // 6th row print Tamilnadu in table
        List<WebElement> row = driver.findElements(By.xpath("//*[@class='wikitable sortable jquery-tablesorter']/tbody/tr[6]/td"));
        for(WebElement temp:row)
        {
        	System.out.print(temp.getText()+"  |  ");
        }
        
        
        //Header List
        List<WebElement> header = driver.findElements(By.xpath("//*[@class='headerSort']"));
        for(WebElement head:header)
        {
        	System.out.print(head.getText()+"  |  ");
        }
        
        System.out.println();
        //Full Table print
        int colmcount= header.size();
        int rowcount=column.size();
        
        
        for(int i=1;i<rowcount;i++)
        {
        	
			for(int j=1;j<colmcount;j++)
        	{
				
          String tableall = driver.findElement(By.xpath("//*[contains(@class,'wikitable')]/tbody/tr["+i+"]/td["+j+"]")).getText();
          System.out.print(tableall+" | ");
          
        	}
			System.out.println();
        	
        
	}

	}}
//*[@class='wikitable sortable jquery-tablesorter'])/tbody/tr/td[10]