package XfileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arnavExcelwrite 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.dypatil.edu/application-form/");
	String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/h1")).getText();
	System.out.println(text);
	String text1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/h1[1]")).getText();
	System.out.println(text1);
	
	String excelfile=("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Test Data\\arnav.xlsx");
	FileInputStream file=new FileInputStream(excelfile);
	Workbook wbt = WorkbookFactory.create(file);
	//wbt.getSheet("Sheet2").createRow(1).createCell(2).setCellValue(text);
	Thread.sleep(2000);
	wbt.getSheet("Sheet2").createRow(4).createCell(3).setCellValue(text1);
	Thread.sleep(2000);
	FileOutputStream outfile=new FileOutputStream(excelfile);
	wbt.write(outfile);
	
	}

}
