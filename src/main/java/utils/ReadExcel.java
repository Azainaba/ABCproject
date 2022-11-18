package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	//public static String[][] main(String[] args) throws IOException {
	
	public String[][] readExcel() throws IOException {
		
		//Enter into the Workbook
				XSSFWorkbook wb = new XSSFWorkbook("./Data2/ReadData.xlsx");
				
				//Get Sheet
				//XSSFSheet sheet = wb.getSheet("Sheet1");
				
				XSSFSheet sheet = wb.getSheetAt(0);
				
				//get Row Count
				int rowCount = sheet.getLastRowNum();
				System.out.println(rowCount);
				System.out.println("RowCount Length " + rowCount);
				
				//Get Column Count
				int columnCount = sheet.getRow(1).getLastCellNum();
				System.out.println(columnCount);
				
				String[][] data = new String[rowCount][columnCount];
				
				
			        for (int i = 1; i <=rowCount; i++) {
					for (int j = 0; j <columnCount; j++) {
						//Get Row 
						XSSFRow row = sheet.getRow(i);
						
						//Get Column/Cell
						XSSFCell cell = row.getCell(j);
						
						//Action-Particular Cell Value
						String cellValue = cell.getStringCellValue();
						
						data[i-1][j]= cellValue;
						
						System.out.println(cellValue);
					}
				
			        }   
			        return data;
	}

}
