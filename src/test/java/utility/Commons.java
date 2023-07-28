package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Commons {

	  public static String read_Data_From_Excel(int row, int cell) throws EncryptedDocumentException, IOException {

		String path = "C:\\Users\\ashok\\eclipse-workspace\\VisualCrossing\\Excel\\Weather_Forcast.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value = WorkbookFactory.create(file).getSheet("City").getRow(row).getCell(cell).getStringCellValue();
	    return value;
	
	
	
	}
}