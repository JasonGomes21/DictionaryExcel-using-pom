package excelreadFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException {

		File f = new File("src\\main\\java\\exFile\\wordlist.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook dictionary = WorkbookFactory.create(fi);
		org.apache.poi.ss.usermodel.Sheet sheet0 = dictionary.getSheetAt(0);

		Row row0 = sheet0.getRow(0);
		Row row1 = sheet0.getRow(1);
		Row row2 = sheet0.getRow(2);
		Row row3 = sheet0.getRow(3);

		Cell A1 = row0.getCell(0);
		Cell B1 = row0.getCell(1);
		Cell C1 = row0.getCell(2);

		Cell A2 = row1.getCell(0);
		Cell B2 = row1.getCell(1);
		Cell C2 = row1.getCell(2);

		Cell A3 = row2.getCell(0);
		Cell B3 = row2.getCell(1);
		Cell C3 = row2.getCell(2);

		Cell A4 = row3.getCell(0);
		Cell B4 = row3.getCell(1);
		Cell C4 = row3.getCell(2);

		System.out.println(A1 + " - " + B1 + " & " + C1);

		System.out.println(A2 + "-" + B2 + " , " + C2);
		System.out.println(A3 + "-" + B3 + " , " + C3);
		System.out.println(A4 + "-" + B4 + " , " + C4);

	}

}
