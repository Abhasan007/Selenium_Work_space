package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_from_excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fish = new FileInputStream("C:\\Users\\Dell\\Desktop\\DDTselenium.xlsx");
	Workbook book = WorkbookFactory.create(fish);
	Sheet sh = book.getSheet("Sheet1");
	Row r = sh.getRow(2);
	Cell c = r.getCell(1);
	String value = c.getStringCellValue();
	System.out.println(value);
}
}
