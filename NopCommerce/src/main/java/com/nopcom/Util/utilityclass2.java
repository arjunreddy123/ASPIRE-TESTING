package com.nopcom.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass2 
{
	static WebDriver driver=null;
	//for String data
	public static String getStringdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\NopCommerce\\Test Data\\File1.xlsx");
		Workbook wbt=WorkbookFactory.create(file);
		return wbt.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	//for boolean
	public static boolean getbooleangdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\NopCommerce\\Test Data\\File1.xlsx");
		Workbook wbt=WorkbookFactory.create(file);
		return wbt.getSheet(sheet).getRow(row).getCell(cell).getBooleanCellValue();
	}
	//for Screenshot
	public static void screenshot(WebDriver driver) throws IOException 
	{
		Date d=new Date();
		String time = d.toString().replace(":", "_").replace(" ", "_");
		TakesScreenshot t=(TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\arnav\\OneDrive\\Desktop\\JAVA PROJECT\\NopCommerce\\ScreenShot\\Maven\\"+time+".jpg");
		FileHandler.copy(source, desti);
	}

}
  
	