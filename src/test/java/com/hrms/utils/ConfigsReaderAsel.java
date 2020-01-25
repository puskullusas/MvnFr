package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReaderAsel {

	private static Properties prop;

	/*prop has all data:
	 * browser=Chrome
		url=http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login
		username=Admin
		password=Syntax@123
	 */
	//Properties cred=readProperties(credentials.properties);
	//Properties configs=readProperties(configurations.properties)
	
	public static Properties readProperties(String filePath) {//will return properties file
		//We can also use String filePath = Constants.CONFIGS_FILEPATH;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;//returns the entire file, next method will get values from file->
	}
	//returns value based on specified key
	
	public static String getProperty(String key) {//man made method
		return prop.getProperty(key);//getProperty is a method for Properties class //key->browser?
	}
}

