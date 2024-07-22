package genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String getDataFromPropertryFile(String path, String Key) throws IOException {

		FileInputStream f = new FileInputStream(path);
		Properties p = new Properties();
		p.load(f);
		return p.getProperty(Key);

	}

	public String getDataFromExcelFile(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		return cell.getStringCellValue();
	}

	public int getRowCount(String path, String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		return sheet.getLastRowNum();

	}

}
