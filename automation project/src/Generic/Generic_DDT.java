package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_DDT {
	static String path ="C:\\Users\\user\\OneDrive\\Documents\\REGISTRATION DETAILS.xlsx";
	static String value;
public static String read_data(String sheet, int row,int cell) {
	try {
	FileInputStream fis = new FileInputStream(path);
	value =WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).toString();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return value;
}
}
