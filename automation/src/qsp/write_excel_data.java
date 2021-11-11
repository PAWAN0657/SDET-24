package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_excel_data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		w.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("pass");
		FileOutputStream f=new FileOutputStream("./data/testscript.xlsx");
		w.write(f);
		w.close();
	}}
