package i.Parameterrization28thDec2021;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ParameterizationUsingForLoopEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "E:\\Software Engineer\\Velocity Notes\\z.SeleniumParameterizationProgram\\ParameterizationUsingForLoopEx1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		Sheet s = WorkbookFactory.create(file).getSheet("Rahul");
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		
		Row r = s.getRow(0);
		int cellcount = r.getLastCellNum();		
		System.out.println(cellcount);
		
		for (int i = 0; i<=rowcount; i++)
		{
			for (int j = 0; j<cellcount; j++)
			{
				String str = s.getRow(i).getCell(j).getStringCellValue();
				System.out.print(str + " ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
