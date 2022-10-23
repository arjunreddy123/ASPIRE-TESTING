package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String key="webdriver.chrome.driver";
		String value="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe";
        //String url="https://www.amazon.com/";
		String url="https://www.amazon.in/b/?_encoding=UTF8&node=27063338031&pf_rd_r=7JHZKFT715RDCFVA64E2&pf_rd_p=2723ecbd-91e0-4fb1-9740-39850db10603&pd_rd_r=f517dc74-fba0-431e-8691-b00ee79e3667&pd_rd_w=iFnrl&pd_rd_wg=x9d1D&ref_=pd_gw_unk";
        System.setProperty(key, value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"nav-xshop-container\"]"));
        Thread.sleep(3000);
        for(WebElement element:list)
        {
        	System.out.println(element.getText());
        }

	}

}
