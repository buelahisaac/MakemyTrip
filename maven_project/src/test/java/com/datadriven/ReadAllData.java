package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {
	public static void main(String[] args) throws Exception {
	File file=new File("C:\\Users\\ABISAAC\\eclipse-workspace\\maven_project\\Data Driven\\Data1.xlsx");
	FileInputStream input=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(input);
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=3;j++) {
			Sheet sheet1 =book.getSheet("sheet1");
			Row row1=sheet1.getRow(j);
			Cell cell1=row1.getCell(i);
			CellType celtype1=cell1.getCellType();
			if(celtype1.equals(celtype1.STRING)){
				String stringCellValue = cell1.getStringCellValue();
				System.out.println(stringCellValue);
				}
				
				else if(celtype1.equals(celtype1.NUMERIC)){
					double numericCellValue = cell1.getNumericCellValue();
					int val=(int) numericCellValue;
					System.out.println(val);
					 }
			
		}
	}
	}
}
	

	
	
	


