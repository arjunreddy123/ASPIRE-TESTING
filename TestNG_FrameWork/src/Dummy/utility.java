package Dummy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility 
{
	static Workbook wbf;

	public static boolean execlBooleanData1(String sheetName, int rowNumber, int cellNumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\TestNG_FrameWork\\Test Data\\File1.xlsx");
		wbf=WorkbookFactory.create(file);
		return  wbf.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getBooleanCellValue();
	
     }
}