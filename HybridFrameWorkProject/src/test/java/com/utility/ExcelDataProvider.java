package com.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook workbook;
	public ExcelDataProvider(String fname) {
		  try {
			  File fs=new File("./TestData"+fname+".xlsx");
			  FileInputStream fis=new FileInputStream(fs);
			  workbook=new XSSFWorkbook(fis);
			  
		  }catch(Exception e) {
			  e.printStackTrace();
		   }
		 }
	 public int getRowCount(String sheetname) {
		  return workbook.getSheet(sheetname).getLastRowNum();
	  }
	 public int getRowCount(int index) {
		 return workbook.getSheetAt(index).getLastRowNum();
		 
	 }
	 public int getColCount(String sheetname,int row) {
		 return workbook.getSheet(sheetname).getRow(row).getLastCellNum();
	 }
	 public int getColCount(int index, int row) {
		 return workbook.getSheetAt(index).getRow(row).getLastCellNum();
	 }
	 public String getStirngCellData(String sheetname,int row,int col) {
		 return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	 }
	 public int getStirngCellData(int index,int row,int col) {
		 return (int) workbook.getSheetAt(index).getRow(row).getCell(col).getNumericCellValue();
	 }
	 public int getNumericCellData(int index,int row,int col) {
		 return (int) workbook.getSheetAt(index).getRow(row).getCell(col).getNumericCellValue();
	 }
	 
	 public static void main(String[] args) {
		
	}

}
