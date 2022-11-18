package readExcell;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcell_01 {

	public static void main(String[] args) throws IOException {
		//open or Enter a WorkBook
		XSSFWorkbook wb = new XSSFWorkbook("./Data2/ReadData.xlsx");
		
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//Get Row 
		XSSFRow row= sheet.getRow(1);
		
		//Get column
		XSSFCell cell = row.getCell(2);
		System.out.println(cell);
		
		//Action Read Value
		String CellValue = cell.getStringCellValue();
		System.out.println(CellValue);
		

	}

}
