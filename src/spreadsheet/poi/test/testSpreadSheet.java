package spreadsheet.poi.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import microsoft.poi.test.JSONHashMap;

public class testSpreadSheet {

	static int rowCount = 0;

	static Map<String, String> item = null;
	static List<String> attributes = null;
	static List<String> values = null;
	static List<Map<String, String>> json = null;

	public static void main(String[] args) {

		File file = null;
		FileInputStream fileInputStream = null;
		XSSFWorkbook workbook = null;
		XSSFSheet sheet = null;

		attributes = new ArrayList<>();
		values = new ArrayList<>();
		json = new ArrayList<>();

		try {
			file = new File(
					"/home/tony/Desktop/Spread_Sheet_Simple/2015 Winter_Final Marks_L1_Grammar_Ildiko Horvath.xlsx");
			fileInputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(fileInputStream);
			sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.rowIterator();

			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();

					if (rowCount < 1) {
						switch (cell.getCellType()) {

						case Cell.CELL_TYPE_BLANK:
							attributes.add("");

							break;

						case Cell.CELL_TYPE_NUMERIC:
							attributes.add(String.valueOf(cell.getNumericCellValue()));
							break;

						case Cell.CELL_TYPE_STRING:
							attributes.add(cell.getStringCellValue());
							break;

						}

					} else {

						switch (cell.getCellType()) {

						case Cell.CELL_TYPE_BLANK:
							values.add("");

							break;

						case Cell.CELL_TYPE_NUMERIC:
							values.add(String.valueOf(cell.getNumericCellValue()));
							break;

						case Cell.CELL_TYPE_STRING:
							values.add(cell.getStringCellValue());
							break;

						}

					}

				} // finished all cells in one row

				System.out.println(values);
				if (rowCount >= 1 && values.size() == attributes.size()) {

					item = new JSONHashMap<String, String>();

					for (int i = 0; i < attributes.size(); i++) {

						item.put(attributes.get(i), values.get(i));
					}
					json.add(item);
				}

				values.clear();
				rowCount++;

			} // finish all rows in one sheet

			System.out.println(attributes);
			System.out.println(values);
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
