package Findelements;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googllelist 
{
	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://www.google.com/";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String exoption="flipkart big billion days";
        
        driver.findElement(By.name("q")).sendKeys("flipkart");
        Thread.sleep(2000);
        
        List<WebElement> list = driver.findElements(By.xpath(("//ul[@class='G43f7e']/li")));
        Thread.sleep(2000);
		  
        for(WebElement option:list)
        {
        	System.out.println(option.getText());
        }
 
      //1.Array
      System.out.println("====Array sort===");
      String a[]=new String[list.size()];
      for(int i=0;i<list.size();i++)
      {
    	  a[i]=list.get(i).getText()+" ";
      }
//      Arrays.sort(a);
//      for(String temp:a)         
//      {
//       System.out.print(temp);
//      }
      
      //2.Treeset
      System.out.println("****TreeSet****");
      TreeSet<String> tr=new TreeSet<String>();
      for(WebElement option:list)
      {
      	tr.add(option.getText());
      }
      System.out.println(tr);
      
      //selct one flipkart big billion day
      for(WebElement option:list)
      {
      	String Actoption=option.getText();
      	if(exoption.equals(Actoption))
      	{
      		option.click();
      		break;
      	}
      }
        
	}
}
//1.Array
//String a[]=new String[list.size()];
//Arrays.sort(a);
//for(String temp:a)         
//{
// System.out.print(a);
//}