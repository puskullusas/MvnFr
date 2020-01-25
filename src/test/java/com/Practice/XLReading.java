package com.Practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XLReading {
//Excel are being read with index starting from 0
	@Test
	public void read() throws Exception {//exception, because there is a possibility the file will not be found
		//we need file path for location of the file of data we need to read
		String filePath= "./src/test/resources/testdata/HrmsTestData.xlsx";
		//to read we nee to create object
		FileInputStream fis =new FileInputStream(filePath);
		//to read excel we need to use different classes
		//Workbook wbook=HSSFWorkbook() --> 2003 xfiles
		
		//to access excel workbook, we need create obj of Workbook and pass fis as parameter 
		Workbook wbook=new XSSFWorkbook(fis);//2007 files
		//to access sheets
		Sheet xlsheet=wbook.getSheet("Login");
		//to access rows
		Row row=xlsheet.getRow(1);
		//to access cells
		Cell cell=row.getCell(0);
		String value=cell.toString();//will get you value of a cell
		System.out.println(value);
		//
		String value2=xlsheet.getRow(1).getCell(1).toString();
		System.out.println(value2);
	}
}
