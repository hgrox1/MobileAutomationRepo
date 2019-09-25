package com.ihg.nativeapp.resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToFile {

	public void updateToFile() throws IOException {

		// Read the spreadsheet that needs to be updated
		FileInputStream input_document = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx"));

		// Access the workbook
		XSSFWorkbook my_xls_workbook = new XSSFWorkbook(input_document);

		// Access the worksheet, so that we can update/modify it.
		XSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);

		// Declare a Cell object
		Cell cell1 = null, cell2 = null;

		// Access the cell first to update the value
		cell1 = my_worksheet.getRow(1).getCell(17);
		cell2 = my_worksheet.getRow(1).getCell(18);

		// Get current value and then add 1 to it
		cell1.setCellValue(cell2.getNumericCellValue() + 1);
		cell2.setCellValue(cell2.getNumericCellValue() + 1);

		// Close the InputStream
		input_document.close();

		// Open FileOutputStream to write updates
		FileOutputStream output_file = new FileOutputStream(
				new File(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx"));

		// write changes
		my_xls_workbook.write(output_file);
		

		// close the stream
		output_file.close();
		my_xls_workbook.close();
	}

	public void updateConfirmationNumberToFile(String confirmationNumber) throws IOException {

		// Read the spreadsheet that needs to be updated
		FileInputStream input_document = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx"));

		// Access the workbook
		XSSFWorkbook my_xls_workbook = new XSSFWorkbook(input_document);

		// Access the worksheet, so that we can update/modify it.
		XSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);

		// Declare a Cell object
		Cell cell1 = null, cell2 = null;

		// Access the cell first to update the value
		cell1 = my_worksheet.getRow(2).getCell(14);
		// cell2 = my_worksheet.getRow(1).getCell(18);

		// Get current value and then add 1 to it
		cell1.setCellValue(confirmationNumber);
		// cell2.setCellValue(cell2.getNumericCellValue() + 1);

		// Close the InputStream
		input_document.close();

		// Open FileOutputStream to write updates
		FileOutputStream output_file = new FileOutputStream(
				(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx"));

		// write changes
		my_xls_workbook.write(output_file);

		// close the stream
		output_file.close();
	}
	
	public void updateLastNameToFile(String confirmationNumber) throws IOException {

		// Read the spreadsheet that needs to be updated
		FileInputStream input_document = new FileInputStream(
				new File(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx"));

		// Access the workbook
		XSSFWorkbook my_xls_workbook = new XSSFWorkbook(input_document);

		// Access the worksheet, so that we can update/modify it.
		XSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);

		// Declare a Cell object
		Cell cell1 = null, cell2 = null;

		// Access the cell first to update the value
		cell1 = my_worksheet.getRow(2).getCell(5);
		// cell2 = my_worksheet.getRow(1).getCell(18);

		// Get current value and then add 1 to it
		cell1.setCellValue(confirmationNumber);
		// cell2.setCellValue(cell2.getNumericCellValue() + 1);

		// Close the InputStream
		input_document.close();

		// Open FileOutputStream to write updates
		FileOutputStream output_file = new FileOutputStream(
				(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources/TestData.xlsx"));

		// write changes
		my_xls_workbook.write(output_file);

		// close the stream
		output_file.close();
	}

	static Row row = null;
	static Row row1 = null;
	static Workbook wb = null;
	static String cellName;
	static String cellValue;
	static String filePath;
	static String sheetName;
	static String fileName;
	static Sheet sh;
	static Cell cell;
	static File file;

	public static void writeData(String path, String filen, String sheet) throws IOException {

		filePath = path;
		fileName = filen;
		sheetName = sheet;
		file = new File(filePath + "//" + fileName);
		FileInputStream fis = new FileInputStream(file);
		// Find the file extension by splitting file name in substring and
		// getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file

		if (fileExtensionName.equals(".xlsx")) {
			// If it is xlsx file then create object of XSSFWorkbook class
			wb = new XSSFWorkbook(fis);
		}

		// Check condition if the file is xls file

		else if (fileExtensionName.equals(".xls")) {
			// If it is xls file then create object of XSSFWorkbook class
			wb = new HSSFWorkbook(fis);
		}
		sh = wb.getSheet(sheet);
	}

	/*
	 * This function helps to write data to excel sheet. Call to this function
	 * is set in @AfterMethod in DriverCapabilities class and will be called
	 * after every Test execution This will help to update ExecutionSheet.xlsx
	 * after every run for PASS and FAIL status
	 */
	@SuppressWarnings("static-access")
	public static void dataEntry(String classname, String testName, String status, String comment) throws IOException {
		// writeData(System.getProperty("user.dir")+"\\src\\automation\\resources","ExecutionSheet.xlsx","Status");
		writeData(System.getProperty("user.dir") + "/src/main/java/com/ihg/nativeapp/resources", "ExecutionSheet.xlsx",
				"Status");

		FileOutputStream out = null;
		int rowCount = sh.getLastRowNum();
		HashMap<Integer, String> fields = new HashMap<Integer, String>();
		fields.put(0, classname);
		fields.put(1, testName);
		fields.put(2, status);
		fields.put(3, comment);
		row = sh.getRow(0);
		// Create a new row and append it at last of sheet

		Row newRow = sh.createRow(rowCount + 1);

		// Create new cells for newly created row
		for (int i = 0; i < row.getLastCellNum(); i++) {
			cell = newRow.createCell(i);
			cell.setCellType(cell.CELL_TYPE_STRING);
			out = new FileOutputStream(file);
			cell.setCellValue(fields.get(i));
			wb.write(out);
		}
		out.flush();
		out.close();
	}

}
