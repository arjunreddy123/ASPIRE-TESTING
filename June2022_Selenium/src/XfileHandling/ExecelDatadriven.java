package XfileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

     public class ExecelDatadriven 
    {
	static Workbook wbf;

	public static void main(String[] args) throws IOException 
	{
		//Excel To Console
		
		//String excelfile="\"C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Test Data\\File_1.xlsx\"";
		
		FileInputStream file = new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\June2022_Selenium\\Test Data\\arjun.xlsx");
		wbf = WorkbookFactory.create(file);
		String name = getExcelStringData("Sheet1-R", 1, 1);
		System.out.println(name);
		
		String surname=getExcelStringData("Sheet1-R", 1, 3);
		System.out.println(surname);
		//Console To UI

	}

	private static String getExcelStringData(String sheetName, int rowNumber, int cellNumber) 
	{
		String Sdata = wbf.getSheet(sheetName).getRow(rowNumber-1).getCell(cellNumber-1).getStringCellValue();
		return null;
	}

}
