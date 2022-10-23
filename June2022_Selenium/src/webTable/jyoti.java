package webTable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

      public class jyoti 
     {

	public static void main(String[] args) throws InterruptedException 
	{

     String key="webdriver.chrome.driver";
	 String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
	  String url="https://demoqa.com/webtables";
	  System.setProperty(key, value);
	  WebDriver driver =new ChromeDriver();
	  
	  driver.get(url);
	  
	  driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
	  Thread.sleep(1000);
	  
	 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gaurang");
	  Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("xyz");
	  Thread.sleep(1000);
	 
	  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Gaurang@gmail.com");
	 Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='age']")).sendKeys("33");
	 driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("30000");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='department']")).sendKeys("IT");
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//button[@id='submit']")).click();
	 Thread.sleep(2000);
	// driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//*[@placeholder='Type to search']")).sendKeys("a");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='basic-addon2']")).click();
	 Thread.sleep(3000);
	 ///print table header
	 List<WebElement> header = driver.findElements(By.xpath("//div[@class='rt-tr']/div"));
	 System.out.println("***Header of table***\n");
	 for(WebElement temp:header)
	  {
		 System.out.print(temp.getText()+" | ");
	  }
	 
	 System.out.println("\n");
	 System.out.println("**Table containt***\n");
	   for(int i=1;i<=3;i++)
	   {
		 for(int j=1;j<=7;j++)
		 {
		WebElement text = driver.findElement(By.xpath("//div[@class='rt-tbody']/div["+i+"]/div/div["+j+"]"));
		 System.out.print(text.getText()+" | ");
		 }
		 System.out.println();
	 }
  
 
}
}




