package com.projectName.generics;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author PAWAN0657
 *
 */
public class Filelib {
/**
 * 	
 * @param key
 * @return
 * @throws IOException
 */
	public String getPropertyValue(String key) throws IOException
{
FileInputStream f=new FileInputStream("./data/commondata.property");
Properties p= new Properties();
p.load(f);
String value = p.getProperty(key);
return value;
}
	/**
	 * 
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * 
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String Sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fi=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fi);
	wb.getSheet(Sheetname).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fo=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fo);
	wb.close();
	}	
}
