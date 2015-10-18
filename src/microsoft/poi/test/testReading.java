package microsoft.poi.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testReading {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream file = new FileInputStream(new File("/home/tony/Desktop/test.xlsx"));
			System.out.println(file);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()){
				
				Row row = rowIterator.next();
				
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while(cellIterator.hasNext()){
					
					Cell cell = cellIterator.next();
					
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.println("Hi1");
						System.out.println(cell.getBooleanCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.println(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.println(cell.getStringCellValue());
						break;
					}
					System.out.println("");
				}
				file.close();
				FileOutputStream out = new FileOutputStream(new File("/home/tony/Desktop/test2.xlsx"));
				workbook.write(out);
				out.close();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
