package microsoft.poi.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testReading {

	static int rowCount = 0;

	static Map<String, String> item = null;
	static List<String> attributes = null;
	static List<String> value = null;
	static List<Map<String, String>> json = null;

	static int itemCounter = 0;

	public static void main(String[] args) {

		try {

			
			attributes = new ArrayList<>();
			value = new ArrayList<>();
			json = new ArrayList<>();
			
			FileInputStream file = new FileInputStream(new File("/home/tony/Desktop/test.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {

				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();

					if (rowCount < 2) {

						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							attributes.add(String.valueOf(cell.getNumericCellValue()));
							break;
						case Cell.CELL_TYPE_STRING:
							attributes.add(cell.getStringCellValue());
							break;
						}

					} else {

						switch (cell.getCellType()) {

						case Cell.CELL_TYPE_NUMERIC:
							value.add(String.valueOf(cell.getNumericCellValue()));
							break;

						case Cell.CELL_TYPE_BLANK:
							value.add("");
							break;

						case Cell.CELL_TYPE_STRING:
							value.add(cell.getStringCellValue());
							break;

						}

					}

				} // finish all cells in one row

				if (rowCount >= 2) {

					item = new JSONHashMap<String, String>();

					for (int i = 0; i < attributes.size(); i++) {

						if (itemCounter >= attributes.size()) {
							item.put(attributes.get(i), value.get(i + itemCounter));
							if (i == attributes.size() - 1) {
								// System.out.println(item);
								itemCounter += attributes.size();
							}

						} else {

							item.put(attributes.get(i), value.get(i));
							itemCounter++;
						}
					}

					json.add(item);
					System.out.println(json);
				}

				rowCount++;
				file.close();
				FileOutputStream out = new FileOutputStream(new File("/home/tony/Desktop/test2.xlsx"));
				workbook.write(out);
				out.close();
			} // finish one row

			System.out.println(attributes);
			System.out.println(value);
			System.out.println(json);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
