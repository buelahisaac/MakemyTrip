package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAllData {

	public static void main(String[] args) throws IOException {
		
File fil=new File("C:\\Users\\ABISAAC\\eclipse-workspace\\maven_project\\Data Driven\\Write data.xlsx");
FileInputStream inp=new FileInputStream(fil);
Workbook work=new XSSFWorkbook(inp);
Sheet sheetAt = work.getSheetAt(0);
Row row = sheetAt.createRow(0);
row.createCell(0).setCellValue("cel");
FileOutputStream fos=new FileOutputStream(fil);
work.write(fos);



	}

}
