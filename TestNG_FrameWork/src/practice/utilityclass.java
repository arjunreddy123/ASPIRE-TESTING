package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class utilityclass 
{
       @Test
	   public static String getexceldata(String sheet,int row,int cell ) throws EncryptedDocumentException, IOException
	   {
		   FileInputStream file =new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Test Data\\File1.xlsx");
		   Workbook wbt = WorkbookFactory.create(file);
		   return wbt.getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
	   }

       //for logo
       @Test
       public static boolean getbooleandata(String sheet,int row,int cell ) throws EncryptedDocumentException, IOException
	   {
		   FileInputStream file =new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Test Data\\File1.xlsx");
		   Workbook wbt = WorkbookFactory.create(file);
		   return wbt.getSheet("sheet1").getRow(row).getCell(cell).getBooleanCellValue();
	   }
       
       //for checkbox
       @Test
       public static boolean getbooleancheck(String sheet,int row,int cell ) throws EncryptedDocumentException, IOException
	   {
		   FileInputStream file =new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Test Data\\File1.xlsx");
		   Workbook wbt = WorkbookFactory.create(file);
		   return wbt.getSheet("sheet1").getRow(row).getCell(cell).getBooleanCellValue();
	   }
	

}
