package toolsQA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.SetOverrideType;
import org.testng.annotations.Test;

public class EDriven {
	
	@Test
	public void driven() throws IOException {
		 
		
		FileInputStream fis = new FileInputStream("F:\\data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet sheet = wb.getSheet("LIst");
		 XSSFRow row = sheet.getRow(4);
		 XSSFCell cell = row.getCell(4);
		double value = cell.getNumericCellValue(); 
		 
		// String value = cell.getStringCellValue();
		 System.out.println(value);
	}

	
	
}
