package i.Parameterrization28thDec2021;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParameterizationClass {

	public static void main (String [] args ) throws EncryptedDocumentException, IOException {
		
		String path = "E:\\Software Engineer\\Velocity Notes\\z.SeleniumParameterizationProgram\\ParameterizationClass.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		String str = WorkbookFactory.create(file).getSheet("Rahul").getRow(0).getCell(0).getStringCellValue();
		System.out.println(str);
		
		FileInputStream file1 = new FileInputStream(path);
		Double d = WorkbookFactory.create(file1).getSheet("Rahul").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(d);
		
		FileInputStream file2 = new FileInputStream(path);
		CellType c = WorkbookFactory.create(file2).getSheet("Rahul").getRow(0).getCell(0).getCellType();
		System.out.println(c);
		
		FileInputStream file3 = new FileInputStream(path);
		CellType c1 = WorkbookFactory.create(file3).getSheet("Rahul").getRow(1).getCell(0).getCellType();
		System.out.println(c1);
		
		
		
	}
}
