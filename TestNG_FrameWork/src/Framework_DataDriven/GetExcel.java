package Framework_DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcel 
{
	public static String getStringdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Test Data\\File1.xlsx");
		Workbook wbt=WorkbookFactory.create(file);
		return wbt.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	//for boolean
	public static boolean getbooleangdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Test Data\\File1.xlsx");
		Workbook wbt=WorkbookFactory.create(file);
		return wbt.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
	}

}
  
	