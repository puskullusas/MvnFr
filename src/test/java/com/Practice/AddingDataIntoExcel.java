package com.Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AddingDataIntoExcel {

	//@DataProvider
	/* 1.create a method that return 2D array and annotate with @DataProvider
	 * 2.send that DataProvider as an attribute/parameter to the @Test method
	 * use DataProvider when the data is not extensive
	 * if there are more data, then use Excel or DataBase, we will need Apache POI
	
	 */
	
	@Test
	public void addDataIntoExl() throws IOException{
		String fPath = "./src/test/resources/testdata/TestCaseMaybe.xlsx";
		FileInputStream fis = new FileInputStream(fPath);//file has to be closed, not opened
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Number1");
		//creating rows and cells
		sheet.createRow(4).createCell(0).setCellValue("GuliGuli");
		sheet.getRow(4).createCell(1).setCellValue("kartoshka22");
		sheet.getRow(4).createCell(2).setCellValue("Barbos");
		sheet.getRow(4).createCell(3).setCellValue("Barboskin");
		
		
		sheet.createRow(5).createCell(0).setCellValue("MuliMuli");
		sheet.getRow(5).createCell(1).setCellValue("morkovka33");
		sheet.getRow(5).createCell(2).setCellValue("Buba");
		sheet.getRow(5).createCell(3).setCellValue("Bubochkina");
		
		sheet.createRow(6).createCell(0).setCellValue(" ");
		sheet.getRow(6).createCell(1).setCellValue(" ");
		sheet.getRow(6).createCell(2).setCellValue(" ");
		sheet.getRow(6).createCell(3).setCellValue(" ");
		
		sheet.createRow(7).createCell(0).setCellValue("Martishka");
		sheet.getRow(7).createCell(1).setCellValue("Chimp23");
		sheet.getRow(7).createCell(2).setCellValue("Mila");
		sheet.getRow(7).createCell(3).setCellValue("Milochkina");
		//send to Excelsheet
		FileOutputStream fos=new FileOutputStream(fPath);
		book.write(fos);
		fos.close();
		book.close();
		fis.close();
		
	
	
	}
	
	
}
