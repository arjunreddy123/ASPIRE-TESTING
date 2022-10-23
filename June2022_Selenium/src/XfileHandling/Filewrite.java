package XfileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filewrite 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//UI to console				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.dypatil.edu/application-form/");
				
				String headerText = driver.findElement(By.xpath("//h1[@class='title text-center']")).getText();
				System.out.println(headerText);
				
				String notetext = driver.findElement(By.xpath("(//*[@class='col-xs-12'])[2]")).getText();
				System.out.println(notetext);
				
		        //Console to excel
				
				String excelFile="C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Test Data\\jyoti1.xlsx";
				FileInputStream file =new FileInputStream(excelFile);
				Workbook wbf = WorkbookFactory.create(file);
				wbf.getSheet("Sheet2-W").createRow(3).createCell(0).setCellValue(headerText);
				wbf.getSheet("Sheet2-W").getRow(3).createCell(2).setCellValue(notetext);
				FileOutputStream OPFile = new FileOutputStream(excelFile);
				
				wbf.write(OPFile);
			
	}

}
