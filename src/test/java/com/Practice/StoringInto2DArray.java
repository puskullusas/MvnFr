package com.Practice;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class StoringInto2DArray {
  @Test(groups = "regression")
	public void readExcel() throws IOException {
		String filePath ="./src/test/resources/testdata/TestCaseMaybe.xlsx";
		FileInputStream fis = new FileInputStream(filePath);
		Workbook excel = new XSSFWorkbook(fis);
		Sheet sheet = excel.getSheet("Number1");
		
		int rowsSize = sheet.getPhysicalNumberOfRows();
		int colsSize = sheet.getRow(0).getLastCellNum();

		//store into 2D Array
											//no of rows //no of cols
		Object[][] dataFromExcel= new Object   [rowsSize-1]     [colsSize]; //Why aren't we storing in reg 2D array
		for(int i=1; i<rowsSize; i++) { //loops through Excel
			for (int j =0; j<colsSize; j++) {
				String value = sheet.getRow(i).getCell(j).toString();
				
				//storing retrieved data into 2D object array
				dataFromExcel[i-1][j]=value;
				System.out.print(value + " ");
			}
				System.out.println();
				
			}
		
		excel.close();
		fis.close();
		
		System.out.println("Values from 2d Array----------------------");
		for(Object[] arrayOfCells : dataFromExcel) {//enhanced loop
			for (Object valuesFromCells: arrayOfCells) {
				System.out.print(valuesFromCells+" -->");
			}
			System.out.println();
		}
	}
	
	}
	

