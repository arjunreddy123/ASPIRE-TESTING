package Framework_TestNG;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

       public class Firstsample_1 
       {
    	   
	    WebDriver driver=null;
	    
	   @BeforeClass
	   public void Brouserlunch() throws InterruptedException
	   {
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Driver\\chromedriver.exe";
		String url="https://en-gb.facebook.com/";
        System.setProperty(key, value);
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
      }
	    @Test(priority=1)
        public void enterUN() 
        {
        	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("arnav@gamil.com");
        	 System.out.println("username");
        }
	    @Test(priority=2)
        public void enterPW() 
        {
        	 driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("arnav@123");
        	 System.out.println("password");
        }
	    @Test(priority=3)
        public void login()
        {
        	driver.findElement(By.xpath("//*[@name='login']")).click();
        	 System.out.println("login");
        }
	  
	    @AfterClass
	    public void closer() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	driver.close();
	    }
        
   }


