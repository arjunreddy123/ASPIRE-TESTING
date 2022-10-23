package XfileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorkbook;

public class ArnavExcel 
{
	static Workbook wbt;
	
	public static String getexceldata(String sheetname,int rownumber,int cellnumber)
	{
		String data = wbt.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
		return data;
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream ("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Test Data\\arnav.xlsx");
	    wbt	=WorkbookFactory.create(file);
	    
	    String name=getexceldata("Sheet1", 1, 0);
	    System.out.println(name);
	    String father=getexceldata("Sheet1", 1, 1);
	    System.out.println(father);
	    String surname=getexceldata("Sheet1",1,2);
	    System.out.println(surname);
	    String name1=getexceldata("Sheet1", 2, 0);
	    System.out.println(name1);
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Driver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dypatil.edu/application-form/");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[1]/div/input")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[2]/div/input")).sendKeys(father);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/div[1]/div[3]/div/input")).sendKeys(surname);
	}

}
