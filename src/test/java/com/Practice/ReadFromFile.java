package com.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadFromFile {

	@Test
	public void readingXLSX() throws IOException {

		// String filePath = "./src/test/resources/testdata/TestCaseMaybe.xlsx";
		// we can use this way
		// File filePath = new File("./src/test/resources/testdata/TestCaseMaybe.xlsx");
		// FileInputStream fis = new FileInputStream(filePath);
		// or directly
		FileInputStream fis = new FileInputStream(new File("./src/test/resources/configs/Configuration.properties"));
		
		/* Another way to read files 
		 * FileReader fR=new FileReader(filePath); then use Properties prop = new Properties(); bla bla
		 * or 
		 * Scanner reader = new Scanner(new File("./src/test/resources/configs/Configuration.properties"));
		 * while(reader.hasNextLine()){ boolean text = reader.nextLine(); 
		 * System.out.println (text);
		 * }
		 */

		// to get the data from Properties file
		Properties prop = new Properties();
		prop.load(fis);
		prop.get("url"); // or can use .getProperty(key)
		System.out.println("This is the key  " + prop.get("url"));

	}
}
