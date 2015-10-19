package microsoft.poi.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Spliterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class testReading {

	public static void main(String[] args) {

		try {

			FileInputStream file = new FileInputStream(new File("/home/tony/Desktop/test.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			JSONObject json = new JSONObject();
			System.out.println("hi");

			XSSFSheet sheet = workbook.getSheetAt(0);

			JSONArray jrow = new JSONArray();

			for (Iterator<Row> rowsIT = sheet.rowIterator(); rowsIT.hasNext();) {
				Row row = rowsIT.next();
				JSONObject jRow = new JSONObject();

				JSONArray cells = new JSONArray();
				for (Iterator<Cell> cellsIT = row.cellIterator(); cellsIT.hasNext();) {

					Cell cell = cellsIT.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						cells.add(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						cells.add(cell.getStringCellValue());
						break;
					}

				}
				System.out.println(cells.toString());
				jRow.put("cell", cells);
				jrow.add(jRow);

			}

			json.put("rows", jrow);
			System.out.println(json.toString());

			// Iterator<Row> rowIterator = sheet.iterator();
			// while(rowIterator.hasNext()){
			//
			// Row row = rowIterator.next();
			//
			// Iterator<Cell> cellIterator = row.cellIterator();
			//
			// while(cellIterator.hasNext()){
			//
			// Cell cell = cellIterator.next();
			//
			// switch (cell.getCellType()) {
			// case Cell.CELL_TYPE_BOOLEAN:
			// System.out.println(cell.getBooleanCellValue());
			// break;
			// case Cell.CELL_TYPE_NUMERIC:
			// System.out.println(cell.getNumericCellValue());
			// break;
			// case Cell.CELL_TYPE_STRING:
			// System.out.println(cell.getStringCellValue());
			// break;
			// }
			// System.out.println("");
			// }
			// file.close();
			// FileOutputStream out = new FileOutputStream(new
			// File("/home/tony/Desktop/test2.xlsx"));
			// workbook.write(out);
			// out.close();
			// }

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
