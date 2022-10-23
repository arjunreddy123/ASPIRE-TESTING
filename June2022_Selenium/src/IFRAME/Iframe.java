package IFRAME;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     public class Iframe 
   {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        String url="https://demoqa.com/nestedframes";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        
        String text = driver.findElement(By.xpath("//*[contains(text(),'Iframe page')]")).getText();
        System.out.println(text);
        
        //By index
        //driver.switchTo().frame(0);
        
        //By string
        // driver.switchTo().frame("frame1");
        
        //By web element
        WebElement web = driver.findElement(By.xpath("//*[@width='500px']"));
        driver.switchTo().frame(web);
    	

        String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
        System.out.println(parenttext );
        
        //Child by Index
        //driver.switchTo().frame(0);
        //child by frame
        //driver.switchTo().frame("");
        
        //By Element child
        WebElement child = driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(child);
        String childttext = driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
        System.out.println(childttext);
        //driver.close();
   
	}

}
