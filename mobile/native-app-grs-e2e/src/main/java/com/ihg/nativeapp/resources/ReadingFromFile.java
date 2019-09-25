package com.ihg.nativeapp.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromFile {

	public static void main(String ar[]) {
		ReadingFromFile rw = new ReadingFromFile();
		rw.readDataFromExcel();

	}

	public Object[][] data = null;

	public File getFile() throws FileNotFoundException {
		File here = new File(
				System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx");
		System.out.println("System directory"+System.getProperty("user.dir"));
		return new File(here.getAbsolutePath());
	}

	public Object[][] readDataFromExcel() {
		final DataFormatter df = new DataFormatter();
		try {

			FileInputStream file = new FileInputStream(getFile());
			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();

			int rownum = 0;
			int colnum = 0;
			Row r = rowIterator.next();

			int rowcount = sheet.getLastRowNum();
			int colcount = r.getPhysicalNumberOfCells();
			data = new Object[rowcount][colcount];
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				// For each row, iterate through all the columns
				Iterator<Cell> cellIterator = row.cellIterator();
				colnum = 0;
				while (cellIterator.hasNext()) {

					Cell cell = cellIterator.next();
					// Check the cell type and format accordingly
					data[rownum][colnum] = df.formatCellValue(cell);
					// System.out.print(df.formatCellValue(cell));
					colnum++;
					// System.out.println("-");
				}
				rownum++;
				// System.out.println("");
			}
			file.close();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;

	}
}