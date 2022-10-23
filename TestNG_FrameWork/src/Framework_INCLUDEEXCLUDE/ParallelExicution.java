package Framework_INCLUDEEXCLUDE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExicution 
{
	 WebDriver driver;
	
	@Test
	public void chromebrowser() throws Exception
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 System.out.print("chrome is Running");
	 Thread.sleep(3000);
	 
	}
	@Test
	public void edgebrowser() throws Exception
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\msedgedriver.exe");
	 driver=new EdgeDriver();
	System.out.print("Edge is Running");
	 Thread.sleep(3000);
	}
	
	@Test
	public void firefoxbrowser() throws Exception
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\geckodriver.exe");
	 driver=new FirefoxDriver();
	System.out.print("Firefox is Running");
	 Thread.sleep(3000);
	}
	
	@Test
	public void UrLlaunchn() throws InterruptedException 
	{
	    driver.get("https://www.facebook.com/");
		String text = driver.findElement(By.xpath("//*[@class='_8eso']")).getText();
		System.out.println(text);
	
		Thread.sleep(5000);
		driver.close();
		
	}
}
/* <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  <test thread-count="5" name="Chrome">
    <classes>
      <class name="Framework_INCLUDEEXCLUDE.ParallelExicution">
      <methods>
      <include name="chromebrowser"/>
      <include name="UrLlaunchn">
      </include>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
  
    <test thread-count="5" name="Firefox">
    <classes>
      <class name="Framework_INCLUDEEXCLUDE.ParallelExicution">
      <methods>
      <include name="firefoxbrowser"/>
      <include name="UrLlaunchn">
      </include>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
  
    <test thread-count="5" name="Edge">
    <classes>
      <class name="Framework_INCLUDEEXCLUDE.ParallelExicution">
      <methods>
      <include name="edgebrowser"/>
      <include name="UrLlaunchn">
      </include>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
*/
