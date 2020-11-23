package javapractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnection {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
// FileInputStream is java class
FileInputStream fis = new FileInputStream("./ExcelFile/ZipCode.xls");
Workbook wb = WorkbookFactory.create(fis);
// WorkBook is class , WorkbookFactory is class, create() is method
Sheet sh = wb.getSheet("sheet1");// note- Sheet is class, Sheet import from ss.usermodel
 String value = sh.getRow(1).getCell(1).getStringCellValue();// note-getRow(),
 //getCell(), GetStringCellValue are methods of sheet
 System.out.println(value);

//for (int i = 0; i <= sh.getLastRowNum(); i++) {
//String value = sh.getRow(1).getCell(1).getStringCellValue();
//System.out.println(value);
//System.out.println();

}

}

