package i.Parameterrization28thDec2021;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParameterizationClassPracticeEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "E:\\Software Engineer\\Velocity Notes\\z.SeleniumParameterizationProgram\\ParameterizationClassPracticeEx1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		String str = WorkbookFactory.create(file).getSheet("Marks").getRow(0).getCell(0).getStringCellValue();
		System.out.println(str);
		
		FileInputStream file1 = new FileInputStream(path);
		Double d = WorkbookFactory.create(file1).getSheet("Marks").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(d);
		
		FileInputStream file2 = new FileInputStream(path);
		String str1 = WorkbookFactory.create(file2).getSheet("Marks").getRow(0).getCell(1).getStringCellValue();
		System.out.println(str1);
		
		FileInputStream file3 = new FileInputStream(path);
		Double d1 = WorkbookFactory.create(file3).getSheet("Marks").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(d1);
		
		FileInputStream file4 = new FileInputStream(path);
		CellType c = WorkbookFactory.create(file4).getSheet("Marks").getRow(0).getCell(0).getCellType();		// choosing apache usermodel for CellType
		System.out.println(c);
		
		FileInputStream file5 = new FileInputStream(path);
		CellType c1 = WorkbookFactory.create(file5).getSheet("Marks").getRow(1).getCell(0).getCellType();		// choosing apache usermodel for CellType
		System.out.println(c1);
		
	}

}
