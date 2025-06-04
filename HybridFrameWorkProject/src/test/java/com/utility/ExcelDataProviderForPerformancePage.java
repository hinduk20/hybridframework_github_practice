package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProviderForPerformancePage {
	
	public static XSSFWorkbook workbook;
	
	public ExcelDataProviderForPerformancePage(String excelName) {
		try {
			File fs = new File("./TestData/"+ excelName+".xlsx");
			FileInputStream fis = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String[][] getData(String sheetname){
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int totalRows = sheet.getLastRowNum();
		int totalCells  = sheet.getRow(1).getLastCellNum();
		System.out.println();
		return null;
		
	}

}
