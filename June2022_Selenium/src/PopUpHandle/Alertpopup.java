package PopUpHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup 
{

	public static void main(String[] args) throws InterruptedException 
	{

		String key="webdriver.chrome.driver";
		String value="C:\\\\Users\\\\arnav\\\\OneDrive\\\\Desktop\\\\JAVA PROJECT\\\\June2022_Selenium\\\\Driver2\\\\chromedriver.exe";
		String url="https://chandanachaitanya.github.io/selenium-practice-site/?vehicle5=Sedan&languages=Java&enterText=";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //Alertbox
        //driver.findElement(By.xpath("//*[@id='alertBox']")).click();
       // Alert alrtbox = driver.switchTo().alert();
       // System.out.println(alrtbox.getText());
        //Thread.sleep(2000);
        //alrtbox.accept();
       // alrtbox.dismiss();
        
        //ConfirmBox
        //driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
        //Alert cnfrm = driver.switchTo().alert();
        //System.out.println(cnfrm.getText());
        //Thread.sleep(2000);
        //cnfrm.accept();
        //cnfrm.dismiss();
        
        //promotBox
        driver.findElement(By.xpath("//*[@id='promptBox']")).click();
        Alert promo = driver.switchTo().alert();
       // System.out.println(promo.getText());
        Thread.sleep(2000);
        //promo.accept();
        promo.dismiss();

	}

}
