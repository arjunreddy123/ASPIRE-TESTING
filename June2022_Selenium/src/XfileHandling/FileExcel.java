package XfileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileExcel 
{
	static Workbook wbt;
	
	public static String getExceldata(String Sheetname,int rownumber,int columnnumber)
	{
	    String data=wbt.getSheet(Sheetname).getRow( rownumber-1).getCell(columnnumber-1).getStringCellValue();
		return data;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
      
	   FileInputStream file=new  FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Test Data\\jyoti1.xlsx");
       wbt=WorkbookFactory.create(file);
       
       String name = getExceldata("Sheet1-R", 2, 1);
       System.out.println(name);
       
       String father = getExceldata("Sheet1-R", 2, 2);
       System.out.println(father);
       
       String surname = getExceldata("Sheet1-R", 2, 3);
       System.out.println(surname);
       
       String fathername = getExceldata("Sheet1-R", 2, 4);
       System.out.println(fathername);
       
       String mother = getExceldata("Sheet1-R", 2, 5);
       System.out.println(mother);
       

       String mothertounge = getExceldata("Sheet1-R", 2, 6);
       System.out.println(mothertounge);
       

       String gender = getExceldata("Sheet1-R", 2, 7);
       System.out.println(gender);
       

       String date = getExceldata("Sheet1-R", 2, 8);
       System.out.println(date);
       

       String catagory = getExceldata("Sheet1-R", 2, 11);
       System.out.println(catagory);
       

       String nationality = getExceldata("Sheet1-R", 2, 9);
       System.out.println(nationality);
       

       String religion = getExceldata("Sheet1-R", 2, 10);
       System.out.println(religion);
       

       String bloudgroup = getExceldata("Sheet1-R", 2, 12);
       System.out.println(bloudgroup);
       
       
       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dypatil.edu/application-form/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[1]/div/input")).sendKeys(name);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[2]/div/input")).sendKeys(father);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[3]/div/input")).sendKeys(surname);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[4]/div/input")).sendKeys(fathername);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[5]/div/input")).sendKeys(mother);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[6]/div/input")).sendKeys(mothertounge);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[1]/div/label[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[2]/div/input")).sendKeys(date);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[2]/label[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[2]/div[3]/div/input")).sendKeys(nationality);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[1]/div/input")).sendKeys(religion);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[3]/div[3]/div/input")).sendKeys(bloudgroup);
        
       
        
	}

}
