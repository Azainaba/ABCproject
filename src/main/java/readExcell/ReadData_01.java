package readExcell;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_01 {

	public static void main(String[] args) throws IOException {
		//Enter into the Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data2/ReadData.xlsx");
		//Get Sheet
		XSSFSheet sheet = wb.getSheet("sheet1");
		//get Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Get Column Count
		int columnCount = sheet.getRow(1).getLastCellNum();
		System.out.println(columnCount);
		
		
	        for (int i = 1; i <=rowCount; i++) {
			for (int j = 0; j <columnCount; j++) {
				//Get Row 
				XSSFRow row = sheet.getRow(i);
				
				//Get Column/Cell
				XSSFCell cell = row.getCell(j);
				
				//Action-Particular Cell Value
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}//ends column loop
		}//ends row loop
	}

}
