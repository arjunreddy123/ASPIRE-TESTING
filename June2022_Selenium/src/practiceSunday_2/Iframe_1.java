package practiceSunday_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe";
        String url="https://demoqa.com/nestedframes";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes"); 
        
        //first string
        System.out.println(driver.findElement(By.xpath("//*[contains(text(),' Iframe page')]")).getText());
        Thread.sleep(3000);
        
        
       // driver.switchTo().frame(0);
        //Thread.sleep(2000);
        //driver.switchTo().frame("frame1");
        Thread.sleep(3000);
        WebElement parentf = driver.findElement(By.xpath("//*[@width='500px']"));
        driver.switchTo().frame(parentf);
       
        String paraent=driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        System.out.println(paraent);
        //driver.switchTo().frame(0);
        WebElement childe = driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childe);
        String child = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
        System.out.println(child);
        Thread.sleep(3000);
       // driver.close();
	}

}
