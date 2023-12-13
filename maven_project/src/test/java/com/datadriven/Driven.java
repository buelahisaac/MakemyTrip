package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Driven {
	
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ABISAAC\\eclipse-workspace\\maven_project\\Data Driven\\Data1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
	    Sheet sheetAt=wb.getSheetAt(0);
	    Row row=sheetAt.getRow(2);
	    Cell cell=row.getCell(1);
	    CellType cellType=cell.getCellType();
	    if(cellType.equals(cellType.STRING)) {
	    String string= cell.getStringCellValue();
	    System.out.println(string);
	    }
	    else {
	    	double numeric= cell.getNumericCellValue();
	    	int value=(int)numeric;
	    	System.out.println(value);
	    }
	    }
	    
		
	}
	
	


